package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");		
		Date dd = new Date(randomDate());
		long time = dd.getTime();
		System.out.println(time);
		Date d = new Date(time);
		System.out.println(d);
		System.out.println(sdf.format(dd));

	}
	
	/**
	 * 返回一个[1998，2018]年的日期
	 * @return
	 */
	public static Long randomDate(){//
		return ((long)((Math.random()*(1534694400000L-903542400000L + 1) + 903542400000L)));
	}
}
