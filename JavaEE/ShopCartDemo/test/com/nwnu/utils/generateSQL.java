package com.nwnu.utils;

import java.util.Random;

public class generateSQL {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i = 0; i < 18; i++) {
			System.out.printf("%.1f\n", random.nextFloat()* 1000);
		}
	}
}
