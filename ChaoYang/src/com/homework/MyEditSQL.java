package com.homework;
//功能：

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class MyEditSQL {
	static String[] name = { "邓紫棋", "范玮琪", "赫子铭", "邵美琪", "李易峰", "尤浩然", "张丰毅", "李宗翰", "范冰冰", "朱亚文", "彭丹", "蔡琴", "杨幂",
			"刘嘉玲", "童蕾", "张丹峰", "Angelababy", "闫妮", "热依扎", "柯受良", "唐嫣", "张静初", "林忆莲", "濮存昕", "刘诗诗", "莫小棋", "潘粤明", "贾晓晨",
			"周星驰", "毛俊杰", "万茜", "隋俊波", "李小璐", "赵文卓", "潘长江" };
	char[] sex = { '男', '女' };
	static String[] jobs = { "clerk", "manager", "salesman", "analyst" };
	static int[] deptnu = { 103, 104, 105, 106 };

	// 1、 数据初始化：
	// a) 创建4个部门，将其以对象的形式保存在硬盘上
	// b) 创建14个员工，将其以对象的形式保存在硬盘上

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

	// 2、 实现功能
	// a) 添加部门
	// b) 添加员工
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
	// c) 根据名称查找部门
	// d) 根据名称查找员工
	
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
	// e) 查找指定名称的员工的部门信息
	// f) 查找指定部门的所有员工的信息
	
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
