/**
 * $Id: DeptDao.java,v 1.0 2019/3/19 20:46 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import springcloud.entities.Dept;

import java.util.List;

/**
 * @Description: 部门dao接口
 * @author Wuguang
 * @version $Id: DeptDao.java,v 1.1 2019/3/19 20:46 G Exp $
 * Created on 2019/3/19 20:46
 */
@Mapper
public interface DeptDao {
    boolean addDept(Dept dept);
    Dept findById(Long id);
    List<Dept> findAll();
}