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
		
		//套路，背会
		int len = -1;//表示读取到的数据的长度，-1表示文件结束
		byte[] buf = new byte[512];//用来放置当前读取到的文件的内容
		
		while((len = fis.read(buf)) != -1){//fis.read(buf)返回值为当前读取到的个数
			fos.write(buf,0,len);
		}
		
		fos.flush();
		fos.close();
		fis.close();
	}

}
