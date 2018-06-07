package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");		
		Date dd = new Date(randomDate());
		long time = dd.getTime();
		System.out.println(time);
		Date d = new Date(time);
		System.out.println(d);
		System.out.println(sdf.format(dd));

	}
	
	/**
	 * ����һ��[1998��2018]�������
	 * @return
	 */
	public static Long randomDate(){//
		return ((long)((Math.random()*(1534694400000L-903542400000L + 1) + 903542400000L)));
	}
}
