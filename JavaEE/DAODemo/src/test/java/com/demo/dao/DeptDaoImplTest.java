package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.demo.bean.Dept;
import com.demo.dao.impl.DeptDaoImpl;
import com.demo.utils.DBUtils;

public class DeptDaoImplTest {
	@Test
	public void insertDeptTest() {
		DeptDao deptDao = new DeptDaoImpl();
		Dept dept = new Dept(2, "Li", "ltgy");
		Dept dept2 = new Dept(4, "Li", "ltgy");
		
		int insertDept=0;
		try {
			insertDept = deptDao.insertDept(dept);
			insertDept = deptDao.insertDept(dept2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(insertDept == 1)
			System.out.println("插入成功");
		else {
			System.out.println("插入失败");
			
		}		
	}
	
	
	@Test
	public void deleteDeptByDeptnoTest() {
		DeptDao deptDao = new DeptDaoImpl();
		
		int insertDept=0;
		try {
			insertDept = deptDao.deleteDeptByDeptno(100);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(insertDept == 1)
			System.out.println("删除成功");
		else {
			System.out.println("删除失败");
			
		}		
	}
	
	@Test
	public void deleteDeptByDnameTest() {
		DeptDao deptDao = new DeptDaoImpl();
		
		int insertDept=0;
		try {
			insertDept = deptDao.deleteDeptByDname("a");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(insertDept == -1)
			System.out.println("删除失败");
		else {
			System.out.println("成功");
			
		}		
	}
	
	@Test
	public void updateDeptTest() {
		DeptDao deptDao = new DeptDaoImpl();
		Dept dept = new Dept(8, "Li", "ltgy");
		int insertDept=0;
		try {
			insertDept = deptDao.updateDept(dept);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(insertDept == -1)
			System.out.println("失败");
		else {
			System.out.println("成功");
			
		}		
	}
	
	
	@Test
	public void insertDeptsTest() {
		DeptDao deptDao = new DeptDaoImpl();
		ArrayList<Dept> depts = new ArrayList<Dept>();
		
		depts.add(new Dept(100, "Li", "ltgy"));
		depts.add(new Dept(60, "Li", "ltgy"));
		depts.add(new Dept(70, "Li", "ltgy"));
		depts.add(new Dept(80, "Li", "ltgy"));
		depts.add(new Dept(90, "Li", "ltgy"));
		
		
		int insertDept=0;
		try {
			insertDept = deptDao.insertDepts(depts);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.printf("成功插入:%d条 ", insertDept);
	}
	
	@Test
	public void selectDeptTest() {
		DeptDao deptDao = new DeptDaoImpl();
		List<Dept> depts = new ArrayList<Dept>();
		int insertDept=0;
		try {
			depts = deptDao.selectAllDept();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(insertDept == -1)
			System.out.println("失败");
		else {
			depts.
			stream().
			sorted((o1, o2)-> Integer.compare(o2.getDeptno(), o1.getDeptno())).
			forEach(i->System.out.println(i));
		}		
	}
	
	@Test
	public void selectDeptByLocTest() {
		DeptDao deptDao = new DeptDaoImpl();
		List<Dept> depts = new ArrayList<Dept>();
		int insertDept=0;
		try {
			depts = deptDao.selectAllDeptWithLoc("ltgy");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(insertDept == -1)
			System.out.println("失败");
		else {
			depts.
			forEach(i->System.out.println(i));
		}		
	}
	
	@Test
	public void selectDeptBynameTest() {
		DeptDao deptDao = new DeptDaoImpl();
		Dept dept = null;
		int insertDept=0;
		try {
			dept = deptDao.selectDeptByname("Li");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(insertDept == -1)
			System.out.println("失败");
		else {
			System.out.println(dept);
		}		
	}
	
	
	@Test
	public void selectDeptByDeptnoTest() {
		DeptDao deptDao = new DeptDaoImpl();
		Dept dept = null;
		int insertDept=0;
		try {
			dept = deptDao.selectDeptByDeptno(60);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(insertDept == -1)
			System.out.println("失败");
		else {
			System.out.println(dept);
		}		
	}
	
	@Test
	public void shiwuTest() throws SQLException{
		Connection conn = DBUtils.getConnection();
		Statement stmt = conn.createStatement();
		conn.setAutoCommit(false);
		
		
		String sql2 = "insert into dept values (13 , 'a', 'aaaaaaa')";
		int res = stmt.executeUpdate(sql2);
		String sql1 = "delete from dept where deptno=3";
		int res1 = stmt.executeUpdate(sql1);
		
		conn.commit();
		conn.setAutoCommit(true);

		DBUtils.release(null, stmt, conn);
	}
}
