package com.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input 10 intger:");
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("After sort:");
		Arrays.sort(a);
		for (int i : a) {
			System.out.print(i + ',');
		}
	}
}
