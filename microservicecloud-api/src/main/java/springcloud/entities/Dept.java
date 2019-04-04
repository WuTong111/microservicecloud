/**
 * $Id: Dept.java,v 1.0 2019/3/19 12:31 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: Dept.java,v 1.1 2019/3/19 12:31 G Exp $
 * Created on 2019/3/19 12:31
 */
@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)   //链式结构注解
public class Dept implements Serializable {
    private Long deptno; // 主键
    private String dname; // 部门名称
    private String db_source; //来自哪个数据库,因为微服务架构可以一个服务对应一个数据库
}