package com.homework;

import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		int y = 0, e = 0, s = 0, other = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input 10 intger:");
		for (int i = 0; i < 10; i++) {
			int t = scanner.nextInt();
			switch (t) {
			case 1:
				y++;
				break;
			case 2:
				e++;
				break;
			case 3:
				s++;
				break;
			default:
				other++;
				break;
			}
		}
		scanner.close();

		System.out.println("数字1的个数是：" + y);
		System.out.println("数字2的个数是：" + e);
		System.out.println("数字3的个数是：" + s);
		System.out.println("非法数字的个数是：" + other);
	}
}
