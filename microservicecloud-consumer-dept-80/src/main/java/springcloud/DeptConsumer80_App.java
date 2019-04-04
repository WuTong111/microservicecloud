/**
 * $Id: DeptConsumer80_App.java,v 1.0 2019/3/19 22:54 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import ribbon.configuration.MyRule;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: DeptConsumer80_App.java,v 1.1 2019/3/19 22:54 G Exp $
 * Created on 2019/3/19 22:54
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MyRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}