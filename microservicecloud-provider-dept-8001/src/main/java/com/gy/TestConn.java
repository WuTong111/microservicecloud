/**
 * $Id: TestConn.java,v 1.0 2019/3/26 21:17 G Exp $
 * <p>
 * Copyright 2018 Asiainfo Technologies(China),Inc. All rights reserved.
 */
package com.gy;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @Description:
 * @author Wuguang
 * @version $Id: TestConn.java,v 1.1 2019/3/26 21:17 G Exp $
 * Created on 2019/3/26 21:17
 */
public class TestConn {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/wg?useUnicode=true&useSSL=false&characterEncoding=utf8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, "root", "123");
            System.out.println(conn.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}