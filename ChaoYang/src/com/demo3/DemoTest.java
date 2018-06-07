package com.demo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class DemoTest {
	public static void main(String[] args) {
		File file = new File("D:\\LI\\java2\\ChaoYang\\src");
		File[] listFiles = file.listFiles();
		int c = 1;
		for(File i : listFiles){
			System.out.println(i.getName());
		}
		for(File i : listFiles){
			if(i.isFile()){
				Thread thread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						try {
							FileReader fr = new FileReader(i);
							StringBuffer sb = new StringBuffer();
							BufferedReader br = new BufferedReader(fr);
							int len = -1;
							char[] buf = new char[(int) i.length()];
							
							if((len = br.read(buf)) != 0){
								sb.append(new String(buf));
							}
							System.out.println("ÎÄ¼þ£º" + i.getName());
							System.out.println(sb);
							
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				c+= 3;
				thread.setPriority(c);
				thread.start();
			}
		}
		
	}
}
