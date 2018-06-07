package com.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;
//���ܣ�
//1��	���ݳ�ʼ����
//a)	����4�����ţ������Զ������ʽ������Ӳ����
//b)	����14��Ա���������Զ������ʽ������Ӳ����
//2��	ʵ�ֹ���
//a)	��Ӳ���
//b)	���Ա��
//c)	�������Ʋ��Ҳ���
//d)	�������Ʋ���Ա��
//e)	����ָ�����Ƶ�Ա���Ĳ�����Ϣ
//f)	����ָ�����ŵ�����Ա������Ϣ

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
		System.out.println(MyEditSQL.findEmpByName(emp, "���ǳ�"));
		
		System.out.println("*******************");
		int Depertment = MyEditSQL.findDeptByEmployeeName(emp, "���ǳ�");
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
