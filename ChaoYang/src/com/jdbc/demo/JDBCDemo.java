package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {
	/**
	 * 1.加载驱动
	 * 2.创建连接
	 * 3.获取statement对象
	 * 4.URID
	 * 5.关闭
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/sys?characterEncoding=utf8&useSSL=true";
		String user= "root";
		String password = "root";
		Connection conn = DriverManager.getConnection(url, user, password);
		
		Statement stmt = conn.createStatement();
		
		String sql = "insert into tb_dept values(12,'aa','aaaaaaaaa')";
		stmt.executeUpdate(sql);
		
		stmt.close();
		conn.close();
		
	}
}
