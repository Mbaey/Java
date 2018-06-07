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
			System.out.println("�ֱ�����No." + i + "Ա�����������Ա���ְʱ�䡢ְλ������(quit to quit)");
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
			System.out.print("No." + i + "Ա������Ϣ" + name[i] + "\t"); // ��������(quit to quit)"
			System.out.print(sex[i] + "\t");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
			System.out.print( time[i] + "\t");
			System.out.print(zhiwei[i] + "\t");
			System.out.println( salary[i] + "\t");
		}
	}

	public static void main(String[] args) {
		String administrator;
		int pass;
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ӭ����******Ա������ϵͳ\n�������û�������");
		administrator = scanner.next();
		pass = scanner.nextInt();
		if ("zhangsan".equals(administrator) && pass == 123456) {
			System.out.println("���������ѡ��:");
			System.out.println("1����¼Ա�����������Ա���ְʱ�䡢ְλ������");
			System.out.println("2��ʵ��Ա����ְ");
			System.out.println("3��ʵ��Ա����ְ");
			System.out.println("4��Ա����Ϣ�鿴���鿴ȫ����");
			System.out.println("5���������Ʋ���ָ����Ա��");
			System.out.println("6��������ְʱ�����ָ����Ա�����������2014-8��֮����ְ��Ա������ϸ��Ϣ");
			System.out.println("7�����ݹ��ʵȼ�����ָ�������Ա��");
			System.out.println("8��exit");
			int choose;
			while (true) {
				choose = scanner.nextInt(); // �ѵ����ܶ�һ�����ظ���ֵ����
				switch (choose) {
				case 1:
					record();
					break;
				case 2:
					in();
					System.out.println("���ٴ��������ѡ��:");
					break;
				case 3:
					System.out.println("Ҫ��ְ��Ա���������ǣ�");
					String t = scanner.next(); 
					out(t);
					System.out.println("���ٴ��������ѡ��:");
					break;
				case 4:
					display();
					System.out.println("���ٴ��������ѡ��:");
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
