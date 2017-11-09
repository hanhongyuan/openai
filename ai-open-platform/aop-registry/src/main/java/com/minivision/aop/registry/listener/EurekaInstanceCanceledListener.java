package com.minivision.aop.registry.listener;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.shared.Applications;
import com.netflix.eureka.EurekaServerContextHolder;
import com.netflix.eureka.registry.PeerAwareInstanceRegistry;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 用于监听eureka服务停机通知
 * @author hughzhao
 * @2017年7月18日
 */
@Configuration
@Slf4j
@EnableScheduling
public class EurekaInstanceCanceledListener implements ApplicationListener<ApplicationEvent> {
	
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        // 服务挂掉自动通知
        if(applicationEvent instanceof EurekaInstanceCanceledEvent) {
            // 应该设置时长，多少秒后服务没有启动如何
            EurekaInstanceCanceledEvent event = (EurekaInstanceCanceledEvent) applicationEvent;
            PeerAwareInstanceRegistry registry = EurekaServerContextHolder.getInstance().getServerContext().getRegistry();
            Applications applications = registry.getApplications();
            applications.getRegisteredApplications().forEach((registeredApplication) -> {
                registeredApplication.getInstances().forEach((instance) -> {
                    if(instance.getInstanceId().equals(event.getServerId())){
                        String id = instance.getInstanceId();
                        lostInstanceMap.remove(id);
                        lostInstanceMap.put(id, new LostInstance(instance));
                        log.warn("服务{}失效，请检查服务状态！", id);
                    }
                });
            });
        }
        if(applicationEvent instanceof EurekaInstanceRegisteredEvent){
            EurekaInstanceRegisteredEvent event = (EurekaInstanceRegisteredEvent) applicationEvent;
            lostInstanceMap.remove(event.getInstanceInfo().getInstanceId());
            log.info("服务{}注册成功...", event.getInstanceInfo().getInstanceId());
        }
    }

    private ConcurrentHashMap<String,LostInstance> lostInstanceMap = new ConcurrentHashMap<String,LostInstance>();
    private int defalutNotifyInterval[] = {0,60,120,240,480};
    
    @Scheduled(cron = "0/30 * * * * ?")
    private void notifyLostInstance(){
        lostInstanceMap.entrySet().forEach((lostInstanceMap)->{
            //String key = lostInstanceMap.getKey();
            LostInstance lostInstance = lostInstanceMap.getValue();
            DateTime dt = new DateTime(lostInstance.getLostTime());
            if(dt.plusSeconds(defalutNotifyInterval[lostInstance.getCurrentInterval()]).isBeforeNow()){
                log.info("服务：{}已失效，IP为：{}，失效时间为：{}，请重启服务！",new Object[]{lostInstance.getInstanceId(), lostInstance.getIPAddr(), dt.toString()});
            }
        });
    }

    class LostInstance extends InstanceInfo {
        protected int currentInterval = 0;
        
        protected Date lostTime;
        
        public LostInstance(InstanceInfo ii) {
            super(ii);
            this.lostTime = new Date();
        }

        public Date getLostTime() {
            return lostTime;
        }

        public void setLostTime(Date lostTime) {
            this.lostTime = lostTime;
        }
        
        public int getCurrentInterval(){
            return currentInterval++ % 4;
        }
    }
    
}

