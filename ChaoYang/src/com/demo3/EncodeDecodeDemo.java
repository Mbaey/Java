package com.demo3;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class EncodeDecodeDemo {
	public static void main(String[] args) {
		
		String s = "最大的文件";
		char[] c = new char[s.length()];
		byte[] bytes = null;
		String string = null;
		try {
			s.getChars(0, s.length(), c, 0);
			bytes = s.getBytes("utf-8");
			string = new String(bytes, "utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(char i : c){
			System.out.println(i);			
		}
		System.out.println(bytes);
		System.out.println(string);
	}
	
}