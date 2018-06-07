package com.demo.dao;

import java.sql.SQLException;
import java.util.List;

import com.demo.bean.Dept;

public interface DeptDao {
	int insertDept(Dept dept) throws SQLException;
	int insertDepts(List<Dept> depts) throws SQLException;
	
	
	int updateDept(Dept dept) throws SQLException;
	int deleteDeptByDeptno(int deptno) throws SQLException;
	int deleteDeptByDname(String dname) throws SQLException;
	
	public List<Dept> selectAllDept()throws SQLException;
	public List<Dept> selectAllDeptWithLoc(String loc)throws SQLException;
	public Dept selectDeptByname(String dname)throws SQLException;
	public Dept selectDeptByDeptno(int Deptno)throws SQLException;

}
