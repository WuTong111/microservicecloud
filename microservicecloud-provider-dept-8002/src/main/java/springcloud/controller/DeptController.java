/**
 * $Id: DeptController.java,v 1.0 2019/3/19 21:43 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud.controller;

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
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptService.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return deptService.get(id);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list(){
        return deptService.list();
    }

    @RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = client.getServices();
        System.out.println("*************" + list);
        List<ServiceInstance> instanceList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance instance: instanceList) {
            System.out.println(instance.getServiceId() + "\t" + instance.getHost() +
                     "\t" + instance.getPort() + "\t" +instance.getUri());
        }
        return this.client;
    }
}