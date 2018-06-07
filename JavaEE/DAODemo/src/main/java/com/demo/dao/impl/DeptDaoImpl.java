package com.demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Dept;
import com.demo.dao.DeptDao;
import com.demo.utils.DBUtils;

public class DeptDaoImpl implements DeptDao {

	public int insertDept(Dept dept) throws SQLException {
		Connection conn = DBUtils.getConnection();

		String sql = "insert into dept values (?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, dept.getDeptno());
		ps.setString(2, dept.getDname());
		ps.setString(3, dept.getLoc());
		int res = ps.executeUpdate();

		DBUtils.release(null, ps, conn);
		return res;
	}

	// 我的实现
	public int insertDepts1(List<Dept> depts) throws SQLException {
		Connection conn = DBUtils.getConnection();
		PreparedStatement ps = null;
		int res = 0;
		for (int i = 0; i < depts.size(); i++) {

			String sql = "insert into dept values (?, ?, ?)";
			ps = conn.prepareStatement(sql);

			ps.setInt(1, depts.get(i).getDeptno());
			ps.setString(2, depts.get(i).getDname());
			ps.setString(3, depts.get(i).getLoc());
			res = ps.executeUpdate();
		}

		DBUtils.release(null, ps, conn);
		return res;
	}

	// teh
	public int insertDepts(List<Dept> depts) throws SQLException {
		Connection conn = DBUtils.getConnection();
		PreparedStatement ps = null;
		int res = 0;
		StringBuffer sql = new StringBuffer("insert into dept values ");
		for (int i = 0; i < depts.size() - 1; i++) {
			sql.append("(?, ?, ?),");
		}
		sql.append("(?, ?, ?)");

		ps = conn.prepareStatement(sql.toString());
		int i=1;
		for (Dept dept : depts) {
			ps.setInt(i++, dept.getDeptno());
			ps.setString(i++, dept.getDname());
			ps.setString(i++, dept.getLoc());
		}
		res = ps.executeUpdate();
		DBUtils.release(null, ps, conn);
		return res;
	}

	public int updateDept(Dept dept) throws SQLException {
		Connection conn = DBUtils.getConnection();

		String sql = "update dept set dname=?, loc=? where deptno= ?";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, dept.getDname());
		ps.setString(2, dept.getLoc());
		ps.setInt(3, dept.getDeptno());
		int res = ps.executeUpdate();

		DBUtils.release(null, ps, conn);
		return res;
	}

	public int deleteDeptByDeptno(int deptno) throws SQLException {
		Connection conn = DBUtils.getConnection();

		String sql = "delete from dept where deptno = ?";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setInt(1, deptno);
		int res = ps.executeUpdate();

		DBUtils.release(null, ps, conn);
		return res;
	}

	public int deleteDeptByDname(String dname) throws SQLException {
		Connection conn = DBUtils.getConnection();

		String sql = "delete from dept where dname = ?";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1, dname);
		int res = ps.executeUpdate();

		DBUtils.release(null, ps, conn);
		return res;
	}

	public List<Dept> selectAllDept() throws SQLException {
		ArrayList<Dept> depts = new ArrayList<Dept>();
		Connection conn = DBUtils.getConnection();

		String sql = "select * from dept";
		PreparedStatement ps = conn.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			depts.add(new Dept(rs.getInt(1), rs.getString(2), rs.getString("Loc")));
		}
		

		DBUtils.release(null, ps, conn);
		return depts;
	}

	public List<Dept> selectAllDeptWithLoc(String loc) throws SQLException {
		ArrayList<Dept> depts = new ArrayList<Dept>();
		Connection conn = DBUtils.getConnection();

		String sql = "select * from dept where loc=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, loc);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			depts.add(new Dept(rs.getInt(1), rs.getString(2), rs.getString("Loc")));
		}
		

		DBUtils.release(null, ps, conn);
		return depts;
	}

	public Dept selectDeptByname(String dname) throws SQLException {
		Dept dept =null;
		Connection conn = DBUtils.getConnection();

		String sql = "select * from dept where dname=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, dname);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			dept = new Dept(rs.getInt(1), rs.getString(2), rs.getString("Loc"));
		}
		

		DBUtils.release(null, ps, conn);
		return dept;
	}

	public Dept selectDeptByDeptno(int Deptno) throws SQLException {
		Dept dept =null;
		Connection conn = DBUtils.getConnection();

		String sql = "select * from dept where Deptno=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, Deptno);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			dept = new Dept(rs.getInt(1), rs.getString(2), rs.getString("Loc"));
		}
		

		DBUtils.release(null, ps, conn);
		return dept;
	}

}
