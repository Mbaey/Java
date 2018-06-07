package com.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.gjt.mm.mysql.Driver;

public class JDBCDemo1 {
	public static void main(String[] args) throws Exception {
		
		Connection conn = DbUtils.getConnection();
		Statement stmt = conn.createStatement();

		String sql = "insert into tb_dept values(41,'Li','Maybe')";		
		stmt.executeUpdate(sql);		
		
		DbUtils.release(conn, stmt);

	}
}
