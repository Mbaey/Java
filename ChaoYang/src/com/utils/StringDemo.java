package com.utils;

public class StringDemo {
	public static void main(String[] args) {
		String[] s = { "ABC", "DEF" };
		change(s);
		for(String i: s){
			System.out.println(i);
		}
	}

	private static void change(String[] s) {
		for (int j = 0; j < s.length; j++) {
			s[j] += "********";
		}
			
	}
}
