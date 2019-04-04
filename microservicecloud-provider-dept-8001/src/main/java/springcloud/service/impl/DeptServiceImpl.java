/**
 * $Id: DeptServiceImpl.java,v 1.0 2019/3/19 21:37 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud.service.impl;

import springcloud.dao.DeptDao;
import springcloud.entities.Dept;
import springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: DeptServiceImpl.java,v 1.1 2019/3/19 21:37 G Exp $
 * Created on 2019/3/19 21:37
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }
}