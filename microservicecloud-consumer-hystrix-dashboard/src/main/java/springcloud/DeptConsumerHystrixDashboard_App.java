/**
 * $Id: DeptConsumer80_App.java,v 1.0 2019/3/19 22:54 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: DeptConsumer80_App.java,v 1.1 2019/3/19 22:54 G Exp $
 * Created on 2019/3/19 22:54
 */
@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumerHystrixDashboard_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixDashboard_App.class, args);
    }
}