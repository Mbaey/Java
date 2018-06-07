package com.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
//功能：
//1、	数据初始化：
//a)	创建4个部门，将其以对象的形式保存在硬盘上
//b)	创建14个员工，将其以对象的形式保存在硬盘上
//2、	实现功能
//a)	添加部门
//b)	添加员工
//c)	根据名称查找部门
//d)	根据名称查找员工
//e)	查找指定名称的员工的部门信息
//f)	查找指定部门的所有员工的信息

public class MysqlTest {
	public static void main(String[] args) throws IOException, Exception {
		File file1 = new File("dep.txt");
		File file2 = new File("emp.txt");
		
		List<Depertment>  dep = new LinkedList<Depertment>();
		List<Employee> emp = new LinkedList<>();		
		if(file1.exists() && file2.exists()){
			ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(file1));
			dep = (List<Depertment>) ois1.readObject();
			ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(file2));
			emp = (List<Employee>) ois2.readObject();
			
			ois1.close();
			ois2.close();
			
		}else {		
			MyEditSQL.initDept(dep);
			MyEditSQL.initEmp(emp);
			
			MyEditSQL.addDept(dep);
			MyEditSQL.addEmp(emp);
			MyEditSQL.addEmp(emp);
			MyEditSQL.addEmp(emp);
		}
		
				
		MyEditSQL.displayDept(dep);
		MyEditSQL.displayEmp(emp);
		
		System.out.println("*******************");
		System.out.println(MyEditSQL.findDeptByNumber(dep, 103));
		System.out.println(MyEditSQL.findEmpByName(emp, "周星驰"));
		
		System.out.println("*******************");
		int Depertment = MyEditSQL.findDeptByEmployeeName(emp, "周星驰");
		List<Employee> empInDept = MyEditSQL.findEmpByDepertmentNumber(dep, emp, Depertment);
		MyEditSQL.displayEmp(empInDept);
		
		
		
		if(!file1.exists()){
			file1.createNewFile();
			file2.createNewFile();
			ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(file1));
			ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(file2));
			
			oos1.writeObject(dep);
			oos2.writeObject(emp);
			oos1.flush();
			oos2.flush();
			oos1.close();
			oos2.close();
			
		}
		
		
	}
}
