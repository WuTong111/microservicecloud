/**
 * $Id: DeptService.java,v 1.0 2019/3/19 21:36 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud.service;

import springcloud.entities.Dept;

import java.util.List;

/**
 * @author G
 * @version $Id: DeptService.java,v 1.1 2019/3/19 21:36 G Exp $
 * Created on 2019/3/19 21:36
 */
public interface DeptService {
    boolean add(Dept dept);
    Dept get(Long id);
    List<Dept> list();
}