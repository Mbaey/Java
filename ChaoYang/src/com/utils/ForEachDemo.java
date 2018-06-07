package com.utils;

public class ForEachDemo {
	public static void main(String[] args) {
		int[][] a = new int[5][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[1 + i];
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (i + 1) * (j + 1);
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
