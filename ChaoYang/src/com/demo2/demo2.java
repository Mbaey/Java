package com.demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import log4j.TestLog4j;

public class demo2 {
	static Logger logger= Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) throws IOException {

		File file = new File("src/com/demo2/2.txt");
		FileReader fr = new FileReader(file);
		char[] buf = new char[(int) file.length()];
		fr.read(buf);
		String res = new String(buf);
		fr.close();
		BasicConfigurator.configure();
		logger.info(res);
	}

}
