/**
 * $Id: DeptController.java,v 1.0 2019/3/19 21:43 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import springcloud.entities.Dept;
import springcloud.service.DeptService;

import java.util.List;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: DeptController.java,v 1.1 2019/3/19 21:43 G Exp $
 * Created on 2019/3/19 21:43
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "peocessHystrix_Get")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptService.get(id);
        if(null == dept){
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return dept;
    }
    public Dept peocessHystrix_Get(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

}