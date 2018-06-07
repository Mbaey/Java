package com.homework;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

//类型	字段名称	说明
//Int	empno	编号，4位
//String	ename	姓名
//String	job	工作
//Date	hiredate	受雇日期
//Int	mgr	上级编号，老大为自身
//Int	sal	工资
//int	comm	奖金
//int	deptno	部门编号

public class Employee implements Serializable{
	private int empno; // 编号，4位
	private String ename;// 姓名
	private String job;// 工作
	private Date hiredate;// 受雇日期
	private int mgr;// 上级编号，老大为自身
	private int sal; // 工资
	private int comm; // 奖金
	private int deptno; // 部门编号

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	/**
	 * @param empno
	 *            编号，4位
	 * @param ename
	 *            姓名
	 * @param job
	 *            工作
	 * @param hiredate
	 *            受雇日期
	 * @param mgr
	 *            上级编号，老大为自身
	 * @param sal
	 *            工资
	 * @param comm
	 *            奖金
	 * @param deptno
	 *            部门编号
	 */
	public Employee(int empno, String ename, String job, Date hiredate, int mgr, int sal, int comm, int deptno) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
		this.mgr = mgr;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate + ", mgr="
				+ mgr + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}

}
