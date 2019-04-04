/**
 * $Id: DeprProvider8001_App.java,v 1.0 2019/3/19 21:49 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: DeprProvider8001_App.java,v 1.1 2019/3/19 21:49 G Exp $
 * Created on 2019/3/19 21:49
 */
@SpringBootApplication
@EnableEurekaClient   //本服务启动后自动注册eurekaserver中
@EnableDiscoveryClient  //服务发现
public class DeprProvider8002_App {

    public static void main(String[] args) {
        SpringApplication.run(DeprProvider8002_App.class, args);
    }
}