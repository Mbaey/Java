package com.homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
//		���˳齱 
//		 
//		 
//		�ɳ�����������������û��Ļ�Ա�ŵİ�λ���� ���������ͬ��� ���򲻻�
//		�������������	int random = (int) (Math.random() * 10);
//			/* �ֽ��ð�λ */
//				int baiwei = custNo / 100 % 10;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������4λ��Ա�ţ�");
		int number = scanner.nextInt();
		scanner.close();
		System.out.print("���Ļ�Ա�ţ�"+number);
		int random = (int) (Math.random() * 10);
		int baiwei = number / 100 % 10;
		if(baiwei == random){
			System.out.println("�н���~");
		}else {
			System.out.println("лл����֧��");
		}
	}
}
