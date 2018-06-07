package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesInDemo {

	public static void main(String[] args) {
		Properties properties = new Properties();

		try {
			FileInputStream fis;
			File file = new File("aaa.properties");
			fis = new FileInputStream(file);
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String property = properties.getProperty("12");
		System.out.println(property);
		
		
		String object = (String) properties.get("13");
		System.out.println(object);
		
		System.out.println("Hello world");

	}

}
