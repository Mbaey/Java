package com.withyou.bean;

public class Mgr {
	int	m_no;
	String	m_name;
	String	m_pwd;
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_pwd() {
		return m_pwd;
	}
	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}
	public Mgr(String m_name, String m_pwd) {
		super();
		this.m_name = m_name;
		this.m_pwd = m_pwd;
	}
	public Mgr() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Mgr [m_no=" + m_no + ", m_name=" + m_name + ", m_pwd=" + m_pwd + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((m_name == null) ? 0 : m_name.hashCode());
		result = prime * result + m_no;
		result = prime * result + ((m_pwd == null) ? 0 : m_pwd.hashCode());
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
		Mgr other = (Mgr) obj;
		if (m_name == null) {
			if (other.m_name != null)
				return false;
		} else if (!m_name.equals(other.m_name))
			return false;
		if (m_no != other.m_no)
			return false;
		if (m_pwd == null) {
			if (other.m_pwd != null)
				return false;
		} else if (!m_pwd.equals(other.m_pwd))
			return false;
		return true;
	}
	
}
