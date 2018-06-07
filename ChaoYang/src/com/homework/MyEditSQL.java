package com.homework;
//���ܣ�

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class MyEditSQL {
	static String[] name = { "������", "������", "������", "������", "���׷�", "�Ⱥ�Ȼ", "�ŷ���", "���ں�", "������", "������", "��", "����", "����",
			"������", "ͯ��", "�ŵ���", "Angelababy", "����", "������", "������", "����", "�ž���", "������", "姴��", "��ʫʫ", "ĪС��", "������", "������",
			"���ǳ�", "ë����", "����", "�忡��", "��С�", "����׿", "�˳���" };
	char[] sex = { '��', 'Ů' };
	static String[] jobs = { "clerk", "manager", "salesman", "analyst" };
	static int[] deptnu = { 103, 104, 105, 106 };

	// 1�� ���ݳ�ʼ����
	// a) ����4�����ţ������Զ������ʽ������Ӳ����
	// b) ����14��Ա���������Զ������ʽ������Ӳ����

	public static void initDept(List<Depertment> dep) {

		for (int i = 0; i < 4; i++) {
			int deptno = 103 + i;
			String dname = "Dep" + i;
			String loc = "9c20" + i;
			dep.add(new Depertment(deptno, dname, loc));
		}
		
		System.out.println("initiate depertment success");
	}

	public static void initEmp(List<Employee> emp) {

		for (int i = 0; i < 14; i++) {
			int empno = 20101 + i;
			String ename = name[(int) (Math.random() * name.length)];
			String job = jobs[(int) (Math.random() * jobs.length)];

			Date hiredate = new Date(randomDate());

			int mgr = getMgr(i);
			int sal = new Random().nextInt(6000) + 5000;
			int comm = new Random().nextInt(4000);
			int deptno = deptnu[(int) (Math.random() * deptnu.length)];
			emp.add(new Employee(empno, ename, job, hiredate, mgr, sal, comm, deptno));
		}
		
		System.out.println("initiate employee success");
	}

	private static Long randomDate() {
		return ((long) ((Math.random() * (1534694400000L - 903542400000L + 1) + 903542400000L)));
	}

	private static int getMgr(int i) {
		int mgr;
		if (i < 6) {
			mgr = i;
		} else {
			mgr = new Random().nextInt(6); // 6 boss
		}
		return mgr;
	}

	// 2�� ʵ�ֹ���
	// a) ��Ӳ���
	// b) ���Ա��
	public static void addDept(List<Depertment> dep) {
		int deptno = 102 + dep.size() + 1;
		String dname = "Dep" + new Random().nextInt(4);
		String loc = "9c20" + new Random().nextInt(4);
		dep.add(new Depertment(deptno, dname, loc));
		System.out.println("add depertment success");
	}
	
	public static void addEmp(List<Employee> emp) {
		int empno = 20101 + emp.size();
		String ename = name[(int) (Math.random() * name.length)];
		String job = jobs[(int) (Math.random() * jobs.length)];

		Date hiredate = new Date(randomDate());

		int mgr = new Random().nextInt(6);
		int sal = new Random().nextInt(6000) + 5000;
		int comm = new Random().nextInt(4000);
		int deptno = deptnu[(int) (Math.random() * deptnu.length)];
		emp.add(new Employee(empno, ename, job, hiredate, mgr, sal, comm, deptno));
		System.out.println("add employee success");
	}
	// c) �������Ʋ��Ҳ���
	// d) �������Ʋ���Ա��
	
	public static Depertment findDeptByNumber(List<Depertment> dep, int Dnumber) {
		Depertment res = null;
		Iterator<Depertment> iterator = dep.iterator();
		while(iterator.hasNext()){
			Depertment next = (Depertment) iterator.next();
			if(next.getDeptno() == Dnumber){
				return next;
			}
		}
		
		return res;
		
	}
	
	public static Employee findEmpByName(List<Employee> emp, String Ename1) {
		Employee res = null;
		Iterator<Employee> iterator = emp.iterator();
		while(iterator.hasNext()){
			Employee next = (Employee) iterator.next();
			if(next.getEname().equals(Ename1)){
				return next;
			}
		}		
		return res;
		
	}
	// e) ����ָ�����Ƶ�Ա���Ĳ�����Ϣ
	// f) ����ָ�����ŵ�����Ա������Ϣ
	
	public static int findDeptByEmployeeName(List<Employee> emp, String Empname1 ) {
		int res = 0;
		Iterator iterator = emp.iterator();
		while(iterator.hasNext()){
			Employee next = (Employee) iterator.next();
			if(next.getEname().equals(Empname1)){
				return next.getDeptno();
			}
		}		
		return res;
	}
	
	public static List<Employee> findEmpByDepertmentNumber(List<Depertment> dep, List<Employee> emp, int Deptnumber) {
		List<Employee> res = new LinkedList<>();
		boolean flag = false;
		Iterator<Depertment> iterator = dep.iterator();
		while(iterator.hasNext()){
			Depertment next = iterator.next();
			if(next.getDeptno() == Deptnumber){
				flag = true;
				break;
			}
		}		
		if(flag){
			
			Iterator<Employee> iterator2 = emp.iterator();
			while(iterator2.hasNext()){
				Employee next = iterator2.next();
				if(next.getDeptno() == Deptnumber){
					res.add(next);
				}
			}
		}
		return res;
	}

	public static void displayEmp(List<Employee> emp) {
		Iterator<Employee> iterator2 = emp.iterator();
		while(iterator2.hasNext()){
			Employee next = iterator2.next();
			System.out.println(next);
		}
	}
	public static void displayDept(List<Depertment> dep) {
		Iterator<Depertment> iterator = dep.iterator();
		while(iterator.hasNext()){
			Depertment next = iterator.next();
			System.out.println(next);
		}		
	}

}
