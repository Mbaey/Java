package com.homework;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

//����	�ֶ�����	˵��
//Int	empno	��ţ�4λ
//String	ename	����
//String	job	����
//Date	hiredate	�ܹ�����
//Int	mgr	�ϼ���ţ��ϴ�Ϊ����
//Int	sal	����
//int	comm	����
//int	deptno	���ű��

public class Employee implements Serializable{
	private int empno; // ��ţ�4λ
	private String ename;// ����
	private String job;// ����
	private Date hiredate;// �ܹ�����
	private int mgr;// �ϼ���ţ��ϴ�Ϊ����
	private int sal; // ����
	private int comm; // ����
	private int deptno; // ���ű��

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
	 *            ��ţ�4λ
	 * @param ename
	 *            ����
	 * @param job
	 *            ����
	 * @param hiredate
	 *            �ܹ�����
	 * @param mgr
	 *            �ϼ���ţ��ϴ�Ϊ����
	 * @param sal
	 *            ����
	 * @param comm
	 *            ����
	 * @param deptno
	 *            ���ű��
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
