package com.homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
//		幸运抽奖 
//		 
//		 
//		由程序产生随机数，如果用户的会员号的百位数字 与随机数相同则获奖 否则不获奖
//		产生随机数代码	int random = (int) (Math.random() * 10);
//			/* 分解获得百位 */
//				int baiwei = custNo / 100 % 10;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入4位会员号：");
		int number = scanner.nextInt();
		scanner.close();
		System.out.print("您的会员号："+number);
		int random = (int) (Math.random() * 10);
		int baiwei = number / 100 % 10;
		if(baiwei == random){
			System.out.println("中奖啦~");
		}else {
			System.out.println("谢谢您的支持");
		}
	}
}
