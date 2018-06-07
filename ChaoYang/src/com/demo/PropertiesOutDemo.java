package com.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOutDemo {

	public static void main(String[] args) {
		Properties properties = new Properties();

		properties.put("12", "abc");
		properties.put("13", "Li");
		properties.put("14", "may");
		properties.put("15", "be");

		try {
			FileOutputStream fos = new FileOutputStream(new File("aaa.properties"));
			properties.store(fos, "myFirst.property");
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello world");

	}

}
