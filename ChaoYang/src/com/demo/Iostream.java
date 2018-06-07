package com.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Iostream {

public static void main(String[] args) {
	File file = new File("d:\\LI\\dec++\\abcd.txt");
	String encoding = "GBK";

	try {
		if (file.isFile() && file.exists()) { // �ж��ļ��Ƿ����

			InputStreamReader read = new InputStreamReader(

					new FileInputStream(file), encoding);// ���ǵ������ʽ

			BufferedReader bufferedReader = new BufferedReader(read);

			String lineTxt = null;

			while ((lineTxt = bufferedReader.readLine()) != null) {

				System.out.println(lineTxt);

			}

			read.close();

		} else {

			System.out.println("�Ҳ���ָ�����ļ�");

		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}