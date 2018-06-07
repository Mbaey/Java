package com.homework;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class abc {
	static String[] name = new String[100];
	static String[] sex = new String[100];
	static int[] time = new int[100];
	static int[] zhiwei = new int[100];
	static int[] salary = new int[100];

	public static void record() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 30; i++) {
			System.out.println("分别输入No." + i + "员工的姓名、性别、入职时间、职位、工资(quit to quit)");
			name[i] = s.nextLine();
			if ("quit".equals(name[i])) {
				break;
			}
			sex[i] = s.next();
			time[i] = s.nextInt();
			zhiwei[i] = s.nextInt();
			salary[i] = s.nextInt();
		}
		s.close();
	}

	public static void in() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 30; i++) {
			if ("quit".equals(name[i])) {
				name[i] = scanner.nextLine();
				sex[i] = scanner.next();
				time[i] = scanner.nextInt();
				zhiwei[i] = scanner.nextInt();
				salary[i] = scanner.nextInt();
			}
		}
		scanner.close();
	}

	public static void out(String n) {
		int i;
		for (i = 0; i < 30; i++) {
			if (n.equals(name[i])) {
				name[i] = "";
				sex[i] = "";
				time[i] = 0;
				zhiwei[i] = 0;
				salary[i] = 0;
				break;
			}
		}
		for (int j = i + 1; j < 30; j++) {
			name[j] = name[j - 1];
			sex[j] = sex[j - 1];
			time[j] = time[j - 1];
			zhiwei[j] = zhiwei[j - 1];
			salary[j] = salary[j - 1];
			if (n.equals(name[j - 1])) {
				break;
			}
		}
	}

	public static void display() {
		for (int i = 0; i < 30; i++) {
			if ("quit".equals(name[i])) {
				break;
			}
			System.out.print("No." + i + "员工的信息" + name[i] + "\t"); // 、、、、(quit to quit)"
			System.out.print(sex[i] + "\t");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
			System.out.print( time[i] + "\t");
			System.out.print(zhiwei[i] + "\t");
			System.out.println( salary[i] + "\t");
		}
	}

	public static void main(String[] args) {
		String administrator;
		int pass;
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎来到******员工管理系统\n请输入用户名密码");
		administrator = scanner.next();
		pass = scanner.nextInt();
		if ("zhangsan".equals(administrator) && pass == 123456) {
			System.out.println("请输入你的选择:");
			System.out.println("1、记录员工的姓名、性别、入职时间、职位、工资");
			System.out.println("2、实现员工入职");
			System.out.println("3、实现员工离职");
			System.out.println("4、员工信息查看（查看全部）");
			System.out.println("5、根据名称查找指定的员工");
			System.out.println("6、根据入职时间查找指定的员工，比如查找2014-8月之后入职的员工的详细信息");
			System.out.println("7、根据工资等级查找指定级别的员工");
			System.out.println("8、exit");
			int choose;
			while (true) {
				choose = scanner.nextInt(); // 难道不能对一个数重复赋值的吗？
				switch (choose) {
				case 1:
					record();
					break;
				case 2:
					in();
					System.out.println("请再次输入你的选择:");
					break;
				case 3:
					System.out.println("要离职的员工的姓名是：");
					String t = scanner.next(); 
					out(t);
					System.out.println("请再次输入你的选择:");
					break;
				case 4:
					display();
					System.out.println("请再次输入你的选择:");
					break;
				case 8:					
					System.exit(0);
					break;
				default:
					System.out.println("Input error! Please input again");
					break;
				}
				choose = 0;
			}

		} else {
			System.out.println("mdzz bye-bye");
		}
		scanner.close();
		
	}
}
