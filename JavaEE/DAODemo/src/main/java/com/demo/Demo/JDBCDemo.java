package com.demo.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.demo.bean.Dept;
public class JDBCDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql:///test";
		Connection conn = DriverManager.getConnection(url, "root", "root");
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select *from dept");
		
		while (rs.next()) {
			Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
			System.out.println(dept);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
	}
}
