package com.homework;

import java.io.Serializable;

public class Depertment implements Serializable{
	private int Deptno;
	private String dname;
	private String loc;

	// 编号，4位
	// 部门名称
	// 部门地址
	public int getDeptno() {
		return Deptno;
	}

	public void setDeptno(int deptno) {
		Deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	/**
	 * @param deptno
	 *            编号，4位
	 * @param dname
	 *            部门名称
	 * @param loc
	 *            部门地址
	 */
	public Depertment(int deptno, String dname, String loc) {
		Deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	/**
	 * 
	 */
	public Depertment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Depertment [Deptno=" + Deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Deptno;
		result = prime * result + ((dname == null) ? 0 : dname.hashCode());
		result = prime * result + ((loc == null) ? 0 : loc.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Depertment other = (Depertment) obj;
		if (Deptno != other.Deptno)
			return false;
		if (dname == null) {
			if (other.dname != null)
				return false;
		} else if (!dname.equals(other.dname))
			return false;
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
			return false;
		return true;
	}

}
