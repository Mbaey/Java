package com.demo3;

import java.io.File;
import java.io.FileInputStream;

public class ThrowableDemo {
	 public static void main(String[] args) {
	        method1();
	    }
	     
	    public static void method1() {
	        try{
	            method2();
	        }
	        catch(Throwable t) {
	            System.out.println("ϵͳ��ʧ��");
	            t.printStackTrace();
	        }
	    }
	     
	    public static void method2() throws Throwable{
	        File f = new File("d:/LOL.exe");
	         
	        System.out.println("ϵͳ�ȳ��Դ�");
	        new FileInputStream("f");
	        System.out.println("ϵͳ�򿪳ɹ�");
	    }
}