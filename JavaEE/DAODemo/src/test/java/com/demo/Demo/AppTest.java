package com.demo.Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.junit.Test;

import com.demo.bean.Dept;
import com.demo.utils.DBUtils;





public class AppTest{
	@Test
	public void test() throws SQLException{
		Connection conn = DBUtils.getConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql = "select * from dept";
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
			System.out.println(dept);
		}
		DBUtils.release(rs, stmt, conn);
	}
	
	@Test
	public void test2() {
		
	}
	
	
}
