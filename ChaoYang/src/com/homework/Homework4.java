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

		System.out.println("����1�ĸ����ǣ�" + y);
		System.out.println("����2�ĸ����ǣ�" + e);
		System.out.println("����3�ĸ����ǣ�" + s);
		System.out.println("�Ƿ����ֵĸ����ǣ�" + other);
	}
}
