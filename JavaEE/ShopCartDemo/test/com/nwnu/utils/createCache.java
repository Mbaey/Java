package com.nwnu.utils;

import java.io.File;
import java.io.IOException;

public class createCache {
	public static void main(String[] args) throws IOException {
		File f = new File("1");
		System.out.println(f.exists());
		
		f.createNewFile();
		
	}
}
