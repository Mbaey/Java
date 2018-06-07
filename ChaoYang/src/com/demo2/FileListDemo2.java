package com.demo2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

import org.junit.Test;

public class   FileListDemo2 {


	// 一、采用实现接口的方式
	class FileNameFilter1 implements FilenameFilter {
		private Pattern pattern;

		public FileNameFilter1(String regex) {
			pattern = Pattern.compile(regex);
		}

		@Override
		public boolean accept(File dir, String name) {
			boolean result = pattern.matcher(name).matches();
			return result;
		}
	}

	/*
	 * 二、采用匿名内部类的方式。 不用implements的方式来实现接口，但是定义一个静态方法，此静态方法返回一个FilenameFilter对象，
	 * 本来正常的语句是return new FilenameFilter();但是在语句结束之前我说“等一下，我要在这里定义
	 * 一个类，类的具体实现我用一个大括号括起来”。
	 */
	static class FileNameFilter2 {
		public static FilenameFilter filter(final String regex) {
			return new FilenameFilter() {
				private Pattern pattern = Pattern.compile(regex);

				@Override
				public boolean accept(File dir, String name) {
					return pattern.matcher(name).matches();
				}
			};
		}
	}

	@Test
	public void test2() {
		System.out.println("------挑选当前目录下以.开头的文件或文件夹-------");
		// 1、挑选当前目录下以.开头的文件或文件夹，并且打印出来(创建一个类来实现FilenameFilter接口)
		File path = new File(".");
		String[] nameList = path.list(new FileNameFilter1("\\..*"));
		for (String itemName : nameList) {
			System.out.println(itemName);
		}

		System.out.println("------挑选当前目录下以b开头的文件或文件夹-------");
		// 2、挑选当前目录下以b开头的文件或文件夹，并且打印出来(使用匿名内部类的方式来实现)
		File path2 = new File(".");
		String[] nameList2 = path2.list(FileNameFilter2.filter("b.*"));
		for (String itemName : nameList2) {
			System.out.println(itemName);
		}

		System.out.println("------挑选当前目录下以s开头的文件或文件夹-------");
		// 3、将匿名内部类利用到极致
		File path3 = new File(".");
		String[] nameList3 = path3.list(new FilenameFilter() {// 其实是在第二种方式的基础上精简过来的。
			private Pattern pattern = Pattern.compile("s.*");

			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		});
		for (String itemName : nameList3) {
			System.out.println(itemName);
		}
	}
}
