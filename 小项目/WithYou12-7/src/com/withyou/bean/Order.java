package com.withyou.bean;

import java.sql.Timestamp;

public class Order {
	int	o_no;
	int	u_from;
	int	u_to;
	String	o_name;
	String	o_desc;
	float	o_price;
	Timestamp	o_s_time;
	Timestamp	o_e_time;
	boolean	o_finish;
	public int getO_no() {
		return o_no;
	}
	public void setO_no(int o_no) {
		this.o_no = o_no;
	}
	public int getU_from() {
		return u_from;
	}
	public void setU_from(int u_from) {
		this.u_from = u_from;
	}
	public int getU_to() {
		return u_to;
	}
	public void setU_to(int u_to) {
		this.u_to = u_to;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public String getO_desc() {
		return o_desc;
	}
	public void setO_desc(String o_desc) {
		this.o_desc = o_desc;
	}
	public float getO_price() {
		return o_price;
	}
	public void setO_price(float o_price) {
		this.o_price = o_price;
	}
	public Timestamp getO_s_time() {
		return o_s_time;
	}
	public void setO_s_time(Timestamp o_s_time) {
		this.o_s_time = o_s_time;
	}
	public Timestamp getO_e_time() {
		return o_e_time;
	}
	public void setO_e_time(Timestamp o_e_time) {
		this.o_e_time = o_e_time;
	}
	public boolean isO_finish() {
		return o_finish;
	}
	public void setO_finish(boolean o_finish) {
		this.o_finish = o_finish;
	}
	public Order(int u_from, String o_name, String o_desc, float o_price) {
		super();
		this.u_from = u_from;
		this.o_name = o_name;
		this.o_desc = o_desc;
		this.o_price = o_price;
	}
	public Order() {
		super();
	}
	@Override
	public String toString() {
		return "Order [o_no=" + o_no + ", u_from=" + u_from + ", u_to=" + u_to + ", o_name=" + o_name + ", o_desc="
				+ o_desc + ", o_price=" + o_price + ", o_s_time=" + o_s_time + ", o_e_time=" + o_e_time + ", o_finish="
				+ o_finish + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((o_desc == null) ? 0 : o_desc.hashCode());
		result = prime * result + ((o_e_time == null) ? 0 : o_e_time.hashCode());
		result = prime * result + (o_finish ? 1231 : 1237);
		result = prime * result + ((o_name == null) ? 0 : o_name.hashCode());
		result = prime * result + o_no;
		result = prime * result + Float.floatToIntBits(o_price);
		result = prime * result + ((o_s_time == null) ? 0 : o_s_time.hashCode());
		result = prime * result + u_from;
		result = prime * result + u_to;
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
		Order other = (Order) obj;
		if (o_desc == null) {
			if (other.o_desc != null)
				return false;
		} else if (!o_desc.equals(other.o_desc))
			return false;
		if (o_e_time == null) {
			if (other.o_e_time != null)
				return false;
		} else if (!o_e_time.equals(other.o_e_time))
			return false;
		if (o_finish != other.o_finish)
			return false;
		if (o_name == null) {
			if (other.o_name != null)
				return false;
		} else if (!o_name.equals(other.o_name))
			return false;
		if (o_no != other.o_no)
			return false;
		if (Float.floatToIntBits(o_price) != Float.floatToIntBits(other.o_price))
			return false;
		if (o_s_time == null) {
			if (other.o_s_time != null)
				return false;
		} else if (!o_s_time.equals(other.o_s_time))
			return false;
		if (u_from != other.u_from)
			return false;
		if (u_to != other.u_to)
			return false;
		return true;
	}
	

	
}
