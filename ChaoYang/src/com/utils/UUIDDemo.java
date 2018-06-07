package com.utils;

import java.util.UUID;

public class UUIDDemo {
	public static void main(String[] args) {
		String s = UUID.randomUUID().toString(); //为什么不用 new UUID();   ?? Date 也是！！！
		System.out.println(s);
		String replace = s.replace("-", "");
		System.out.println(replace);
		

	}
}
