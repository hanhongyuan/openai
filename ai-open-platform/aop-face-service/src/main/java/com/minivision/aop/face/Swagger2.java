package com.minivision.aop.face;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.minivision.ai.rest.result.RestResult;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

	@Bean
	public Docket createRestApi() {
		/*List<ResponseMessage> responses = Arrays.asList(
				new ResponseMessageBuilder().code(500).message("服务内部错误").build(),
				new ResponseMessageBuilder().code(403).message("禁止访问(Forbidden)").build(),
				new ResponseMessageBuilder().code(400).message("请求参数错误(Bad Request)").build(),
				new ResponseMessageBuilder().code(401).message("未授权(Unauthorized)").build(),
				new ResponseMessageBuilder().code(405).message("参数格式错误(invalid input)").build());*/
		
		return new Docket(DocumentationType.SWAGGER_2)
		    .genericModelSubstitutes(RestResult.class)
		    .apiInfo(apiInfo())
		    .useDefaultResponseMessages(false)
		    .forCodeGeneration(true)
			//.globalResponseMessage(RequestMethod.GET, responses)
			//.globalResponseMessage(RequestMethod.POST, responses)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.minivision.aop.face.rest"))
			.paths(PathSelectors.any())
			.build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("小视人脸服务平台").description("小视人脸服务RESTful APIs")
				// .termsOfServiceUrl("http:///")
				.contact(new Contact("PanXinmiao", null, "panxinmiao@minivision.cn")).version("1.0").build();
	}

}