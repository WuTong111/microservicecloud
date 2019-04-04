package ribbon.configuration;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

import java.util.List;

/**
 * 类作用:
 * 项目名称: microservicecloud
 * 包: ribbon.configuration
 * 类名称: MyRule
 * 类描述: 类功能详细描述
 * 创建人: wuguang
 * 创建时间: 2019/04/01 10:23
 */
public class MyRoundRule extends AbstractLoadBalancerRule {

    // total = 0 每调用一次加一  当total=5后，我们指针才能往下走
    // index = 0 当前对外提供的服务号
    // total需要重新置为0，但是已经达到过一个5次，我们的index=1
    // 分析：我们5次，但是微服务只有8001，8002，8003三台；
    // 所以
    private int total = 0;
    private int currentIndex = 0;

    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

//                int index = this.rand.nextInt(serverCount);
//                server = (Server)upList.get(index);

                //一直重复5次  index才加一
                if(total < 5){
                    server = upList.get(currentIndex);
                    total++;
                }else {
                    total = 0;
                    currentIndex++;
                    if(currentIndex >= upList.size()){
                        currentIndex = 0;
                    }
                }

                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}