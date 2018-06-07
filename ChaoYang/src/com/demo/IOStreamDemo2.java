package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStreamDemo2 {
	public static void main(String[] args) throws Exception {
		File file1 = new File("d:\\LI\\dec++\\abcd.txt");
		File file2 = new File("d:\\LI\\dec++\\copy.txt");
		
		
		FileInputStream fis = new FileInputStream(file1);
		FileOutputStream fos = new FileOutputStream(file2);
		
		//��·������
		int len = -1;//��ʾ��ȡ�������ݵĳ��ȣ�-1��ʾ�ļ�����
		byte[] buf = new byte[512];//�������õ�ǰ��ȡ�����ļ�������
		
		while((len = fis.read(buf)) != -1){//fis.read(buf)����ֵΪ��ǰ��ȡ���ĸ���
			fos.write(buf,0,len);
		}
		
		fos.flush();
		fos.close();
		fis.close();
	}

}
