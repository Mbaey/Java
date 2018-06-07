package com.entity;

public class Stu {
	int num;
	String name;
	float score;

	public Stu(int num, String name, float score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
	}

	public Stu() {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Stu [num=" + num + ", name=" + name + ", score=" + score + "]";
	}

	public static void main(String[] args) {
		Stu[] stu = new Stu[10];
		for (int i = 0; i < stu.length; i++) { // ÄÄÀï´íÁË£¿£¿£¿
			String x = "li" + 00 + i;
			stu[i] = new Stu();
			stu[i].setName(x);
			stu[i].setNum(i);
			stu[i].setScore(i);
		}

		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i]);
		}
		// for (int i = 0; i < stu.length; i++) {
		// stu[i] = new Stu( i,"li"+i, 60+i);
		//
		// }
		// for (int i = 0; i < stu.length; i++) {
		// System.out.println(stu[i]);
		// }
	}
}
