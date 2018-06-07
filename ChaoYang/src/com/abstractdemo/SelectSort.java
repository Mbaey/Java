package com.abstractdemo;

public class SelectSort {
	public static void selectionSort(int[] array) {
		int temp;
		int t = 0;// 每一轮比较的时候都是让t指向第一个元素

		for (int i = 0; i < array.length - 1; i++) {
			t = 0;
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[t] < array[j + 1])
					t = j + 1;
			}
			temp = array[array.length - i - 1];
			array[array.length - i - 1] = array[t];
			array[t] = temp;
		}
	}

}
