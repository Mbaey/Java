package com.nwnu.mapper;

import org.springframework.stereotype.Component;

import java.sql.SQLException;

/**
 * Created by lcy on 2018/6/30.
 */
@Component
public class AopDemo {

    public void doSth() throws ClassNotFoundException, SQLException {

        System.out.println("AopDemo Do Sth") ;
//          我疯了。。它不是SpringIOC的 怎么会支持Tx呢
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection conn = DriverManager
//                .getConnection(
//                        "jdbc:mysql://127.0.0.1:3306/db_school?useUnicode=true&characterEncoding=utf-8",
//                        "root", "root");
//        String sql = "INSERT INTO classes VALUES (null, '宇宙超级无敌软件一班')";
//        PreparedStatement preparedStatement = conn.prepareStatement(sql);
//        int i = preparedStatement.executeUpdate();
//        int error = 1/0;
//
//        preparedStatement.close();
//        conn.close();
    }
}