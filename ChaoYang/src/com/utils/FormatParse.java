package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Format��ʽ�� Parse����
 * 
 * @author Administrator
 *
 */
public class FormatParse {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(d);
		System.out.println("After format(����):" + sdf.format(d));
		Date parse = sdf.parse(sdf.format(d));
		System.out.println("After parse(���Date.getTime()��ʲô����):" + parse.getTime());
		System.out.println("Date.getTime() �ǰ���Ĭ�ϸ�ʽ��ʽ���ģ�"+ d.getTime());
		
		
		String i = "123456.12";
		double a = Double.parseDouble(i);
		System.out.println(a+1);
		int parseInt = Integer.parseInt("1234");
		System.out.println(parseInt);
		

	}
}
