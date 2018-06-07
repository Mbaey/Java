package com.abstractdemo;

public abstract class GetRunTime {
	public long getRunTime(int[] array) {
		long s = System.currentTimeMillis();
		fun(array);
		long e = System.currentTimeMillis();
		return e - s;
	}

	public abstract void fun(int[] array);

}
