package com.abstractdemo;

public class BubbleSort {
	public static void bubbleSort(int[] array) {
		int temp;

		for (int i = 0; i < array.length - 1; i++) {// �Ƚ϶�����
			// -i��ʾ���ٱȽϵ�ǰ����Ч��iλ����
			for (int j = 0; j < array.length - i - 1; j++) {// ����һ��
				if (array[j] > array[j + 1]) {// �������ڵ�����
					temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

	}
}
