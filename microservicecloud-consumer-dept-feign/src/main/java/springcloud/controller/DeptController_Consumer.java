/**
 * $Id: DeptController_Consumer.java,v 1.0 2019/3/19 22:22 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import springcloud.entities.Dept;
import springcloud.service.DeptClientService;

import java.util.List;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: DeptController_Consumer.java,v 1.1 2019/3/19 22:22 G Exp $
 * Created on 2019/3/19 22:22
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.service.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return this.service.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept){
        return this.service.add(dept);
    }
}