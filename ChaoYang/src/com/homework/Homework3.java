package com.homework;

public class Homework3 {
	public static void main(String[] args) {
		int res = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				res += i;
			}
		}
		System.out.println(res);
	}
}
