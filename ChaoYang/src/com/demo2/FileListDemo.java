package com.demo2;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args) {
		File path = new File(".");
		String[] list = path.list();
		for (String itemName : list) {
			System.out.println(itemName);
		}

		System.out.println("--------->");  
        path = new File("D:\\LI\\java");  
        list = path.list();  
        for(String itemName : list){  
            System.out.println(itemName);  
        }  
        //3��new File(new File("."),"bin")��ʾ��ǰĿ¼�µ�binĿ¼  
        System.out.println("--------->");  
        path = new File(new File("."),"bin");  
        list = path.list();//�г�binĿ¼�µ������ļ��������ļ���  
        for(String itemName : list){  
            System.out.println(itemName);  
        }  
	}
}
