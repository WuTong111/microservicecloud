/**
 * $Id: DeptController_Consumer.java,v 1.0 2019/3/19 22:22 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud.controller;

import springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: DeptController_Consumer.java,v 1.1 2019/3/19 22:22 G Exp $
 * Created on 2019/3/19 22:22
 */
@RestController
public class DeptController_Consumer {

//    写死了端口 地址 ip
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
//      在eureka上通过名字访问
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }
}