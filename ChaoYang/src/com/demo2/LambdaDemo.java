package com.demo2;

import java.util.Arrays;
import java.util.Comparator;

class Usezhe {
	public String name;
	public int score;

	public Usezhe() {
		super();
	}

	public Usezhe(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", score=" + score + "]";
	}

}

public class LambdaDemo {

	public static void main(String[] args) {
		Usezhe[] u = { new Usezhe("Li", 88), new Usezhe("Chao", 77), new Usezhe("yang", 66), new Usezhe("may", 100) };
		//¶Ôuser½øÐÐÅÅÐò
		
		System.out.println(Arrays.toString(u));
		Arrays.sort(u, ( o1,  o2)->   Integer.compare(o1.score, o2.score));
		
		System.out.println(Arrays.toString(u));
	}

}
