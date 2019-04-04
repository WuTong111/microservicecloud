/**
 * $Id: ConfigBean.java,v 1.0 2019/3/19 22:08 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: ConfigBean.java,v 1.1 2019/3/19 22:08 G Exp $
 * Created on 2019/3/19 22:08
 */
@Configuration
public class ConfigBean {  //boot--->spring  applicationContext.xml == @Configuration

    @Bean
    @LoadBalanced   //springcloud Ribbon是基于Netfix Ribbon实现的是一套客户端 负载均衡的工具。
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
//applicationContext.xml = ConfigBean(@Configuration)
//<bean id="deptService" class="xxx.xxx.ServiceImpl">