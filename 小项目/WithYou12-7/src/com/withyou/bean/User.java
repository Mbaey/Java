package com.withyou.bean;


public class User {
	int u_no;
	String u_name;
	String u_pwd;
	String u_addr;
	String u_tel;
	int u_credit;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((u_addr == null) ? 0 : u_addr.hashCode());
		result = prime * result + u_credit;
		result = prime * result + ((u_name == null) ? 0 : u_name.hashCode());
		result = prime * result + u_no;
		result = prime * result + ((u_pwd == null) ? 0 : u_pwd.hashCode());
		result = prime * result + ((u_tel == null) ? 0 : u_tel.hashCode());
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
		User other = (User) obj;
		if (u_addr == null) {
			if (other.u_addr != null)
				return false;
		} else if (!u_addr.equals(other.u_addr))
			return false;
		if (u_credit != other.u_credit)
			return false;
		if (u_name == null) {
			if (other.u_name != null)
				return false;
		} else if (!u_name.equals(other.u_name))
			return false;
		if (u_no != other.u_no)
			return false;
		if (u_pwd == null) {
			if (other.u_pwd != null)
				return false;
		} else if (!u_pwd.equals(other.u_pwd))
			return false;
		if (u_tel == null) {
			if (other.u_tel != null)
				return false;
		} else if (!u_tel.equals(other.u_tel))
			return false;
		return true;
	}
	public int getU_no() {
		return u_no;
	}
	public void setU_no(int u_no) {
		this.u_no = u_no;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_pwd() {
		return u_pwd;
	}
	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}
	public String getU_addr() {
		return u_addr;
	}
	public void setU_addr(String u_addr) {
		this.u_addr = u_addr;
	}
	public String getU_tel() {
		return u_tel;
	}
	public void setU_tel(String u_tel) {
		this.u_tel = u_tel;
	}
	public int getU_credit() {
		return u_credit;
	}
	public void setU_credit(int u_credit) {
		this.u_credit = u_credit;
	}
	@Override
	public String toString() {
		return "User [u_no=" + u_no + ", u_name=" + u_name + ", u_pwd=" + u_pwd + ", u_addr=" + u_addr + ", u_tel="
				+ u_tel + ", u_credit=" + u_credit + "]";
	}
	public User(int u_no, String u_name, String u_pwd, String u_addr, String u_tel) {
		super();
		this.u_no = u_no;
		this.u_name = u_name;
		this.u_pwd = u_pwd;
		this.u_addr = u_addr;
		this.u_tel = u_tel;
		this.u_credit = 10;
	}
	public User(String u_name, String u_pwd, String u_addr, String u_tel) {
		super();
		this.u_name = u_name;
		this.u_pwd = u_pwd;
		this.u_addr = u_addr;
		this.u_tel = u_tel;
		this.u_credit = 10;
	}
	public User() {
		super();
		this.u_credit = 10;

	}
	
}
