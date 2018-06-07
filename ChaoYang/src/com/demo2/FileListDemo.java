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
        //3、new File(new File("."),"bin")表示当前目录下的bin目录  
        System.out.println("--------->");  
        path = new File(new File("."),"bin");  
        list = path.list();//列出bin目录下的所有文件或者是文件夹  
        for(String itemName : list){  
            System.out.println(itemName);  
        }  
	}
}
