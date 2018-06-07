package com.abstractdemo;

public class BubbleSort {
	public static void bubbleSort(int[] array) {
		int temp;

		for (int i = 0; i < array.length - 1; i++) {// 比较多少轮
			// -i表示不再比较当前轮有效的i位数字
			for (int j = 0; j < array.length - i - 1; j++) {// 交换一轮
				if (array[j] > array[j + 1]) {// 交换相邻的两个
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

	}
}
