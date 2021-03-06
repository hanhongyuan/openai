package fastdfs.client;

import java.net.InetSocketAddress;

/**
 * @author siuming
 */
public class TrackerServer {

    private String host;
    private int port;
    private int weight;
    private ServerStatus status = ServerStatus.UP;

    /**
     * @param host
     * @param port
     */
    public TrackerServer(String host, int port) {
        this(host, port, -1);
    }

    /**
     * @param host
     * @param port
     * @param weight
     */
    public TrackerServer(String host, int port, int weight) {
        this.host = host;
        this.port = port;
        this.weight = weight;
    }

    /**
     * @return
     */
    public String host() {
        return host;
    }

    /**
     * @return
     */
    public int port() {
        return port;
    }

    /**
     * @return
     */
    public int weight() {
        return weight;
    }
    
    public ServerStatus status() {
    	return status;
    }
    
    public void setStatus(ServerStatus status) {
    	this.status = status;
    }

    /**
     * @return
     */
    public InetSocketAddress toInetAddress() {
        return new InetSocketAddress(host, port);
    }

    @Override
    public String toString() {
        return "TrackerServer{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", weight=" + weight +
                ", status=" + status +
                '}';
    }
}
