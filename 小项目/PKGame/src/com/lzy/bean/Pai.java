package com.lzy.bean;

import java.util.ArrayList;

public class Pai {
	//Static 的，就不设置getter了
	public static ArrayList<String> Hua;
	public static ArrayList<String> Dian;
	
	static {
		Hua = new ArrayList<>();
		Dian = new ArrayList<>();
		Hua.add("方块");
		Hua.add("梅花");
		Hua.add("红桃");
		Hua.add("黑桃");
		for (int i = 2; i < 11; i++) {
			Dian.add(i + "");
		}
		Dian.add("J");
		Dian.add("Q");
		Dian.add("K");
		Dian.add("A");
	}
	/**
	 * 花色 点数
	 */
	private String huaSe;
	private String dianShu;
	
	public Pai(String huaSe, String dianShu) {
		super();
		this.huaSe = huaSe;
		this.dianShu = dianShu;
	}

	public Pai() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getHuaSe() {
		return huaSe;
	}


	public void setHuaSe(String huaSe) {
		this.huaSe = huaSe;
	}


	public String getDianShu() {
		return dianShu;
	}


	public void setDianShu(String dianShu) {
		this.dianShu = dianShu;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dianShu == null) ? 0 : dianShu.hashCode());
		result = prime * result + ((huaSe == null) ? 0 : huaSe.hashCode());
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
		Pai other = (Pai) obj;
		if (dianShu == null) {
			if (other.dianShu != null)
				return false;
		} else if (!dianShu.equals(other.dianShu))
			return false;
		if (huaSe == null) {
			if (other.huaSe != null)
				return false;
		} else if (!huaSe.equals(other.huaSe))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pai [花色=" + huaSe + ", 点数=" + dianShu + "]";
	}

}
