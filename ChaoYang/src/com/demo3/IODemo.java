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
		
		System.out.printf("�����ļ��ǣ�%s, ��С�ǣ�%,dB\n", maxFile.getAbsoluteFile(), maxFile.length());
		System.out.printf("��С���ļ��ǣ�%s, ��С�ǣ�%,dB\n", minFile.getName(), minFile.length());
		
	}
}