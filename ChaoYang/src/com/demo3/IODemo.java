package com.demo3;

import java.io.File;
import java.io.FileInputStream;

public class IODemo {
	public static void main(String[] args) {
		File file = new File("D:\\MyDownloads");
		File[] listFiles = file.listFiles();
		long max = 0;
		long min = Integer.MAX_VALUE;
		File minFile = null;
		File maxFile = null;
		
		for(File i : listFiles){
			if(i.isFile()){
				long len = i.length();
				if(len > max){
					max = len;
					maxFile = i;
				}else if (len < min && len != 0 ) {
					min = len;
					minFile = i;
				}				
			}
		}
		
		System.out.printf("最大的文件是：%s, 大小是：%,dB\n", maxFile.getAbsoluteFile(), maxFile.length());
		System.out.printf("最小的文件是：%s, 大小是：%,dB\n", minFile.getName(), minFile.length());
		
	}
}