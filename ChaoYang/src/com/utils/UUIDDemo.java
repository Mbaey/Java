package com.utils;

import java.util.UUID;

public class UUIDDemo {
	public static void main(String[] args) {
		String s = UUID.randomUUID().toString(); //Ϊʲô���� new UUID();   ?? Date Ҳ�ǣ�����
		System.out.println(s);
		String replace = s.replace("-", "");
		System.out.println(replace);
		

	}
}
