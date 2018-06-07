package com.abstractdemo;

import java.util.Arrays;

public class TimeTest {
	public static void main(String[] args) {
		int[] a = new int[10000];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 900 + 100);
		}
		long runTime = new GetRunTime() {

			@Override
			public void fun(int[] array) {
				new SelectSort();
				SelectSort.selectionSort(array);
			}
		}.getRunTime(a);
		System.out.println(runTime);
		
//		long runTime2 = new GetRunTime() {
//
//			@Override
//			public void fun(int[] array) {
//				new BubbleSort().bubbleSort(array);
//			}
//		}.getRunTime(a);
//		System.out.println(runTime2);
//		
//		long runTime2 = new GetRunTime() {
//
//			@Override
//			public void fun(int[] array) {
//				Arrays.sort(array);
//			}
//		}.getRunTime(a);
//		System.out.println(runTime2);
	}
}
