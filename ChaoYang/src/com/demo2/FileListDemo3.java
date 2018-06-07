package com.demo2;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

import org.junit.Test;

public class FileListDemo3 {

	/*
	 * list()和listFiles()方法的区别在于：list()返回的是一个String类型数组，它只是一个数组；
	 * 而listFiles()方法返回的是一个File类的引用，它具有类的所有属性和方法。
	 * 
	 * 下面的前三个方法返回File[]类型，第四个返回static File[]类型。 返回类型 ：
	 * 该路径下所有文件或文件夹的绝对路径（pathname，注意File类型指的是路径，而不是文件） listFiles()
	 * listFiles(FileFilter filter) listFiles(FilenameFilter filter) listRoots()
	 * 
	 */
	@Test
	public void test3() {
		System.out.println("-----判别当前目录下的文件是否为文件夹----");
		// 1、列出当前目录下的所有文件和文件夹，保存为File类对象的数组，判别其是否为文件夹
		File path = new File(".");
		File[] files = path.listFiles();
		for (File f : files) {
			
			System.out.println(f + " ---> is a Directory? " + f.isDirectory());
		}

		System.out.println("-----挑选出当前目录下的所有文件夹----");
		// 2、挑选出当前目录下的所有文件夹
		File path2 = new File(".");
		File[] files2 = path2.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.isDirectory();
			}
		});

		for (File f : files2) {
			System.out.println(f);
		}

		System.out.println("-----挑选出当前目录下的所有以s开头的文件夹----");
		// 2、挑选出当前目录下的所有以s开头的文件夹
		File path3 = new File(".");
		File[] files3 = path3.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				Pattern pattern = Pattern.compile("s.*");
				return pathname.isDirectory() && pattern.matcher(pathname.getName()).matches();
			}
		});
		for (File f : files3) {
			System.out.println(f);
		}

		System.out.println("-----挑选出当前目录下的所有以.开头的文件夹，并且标明文件属性----");
		// 3、挑选出当前目录下以.开头的文件或文件夹，并且在其后部标明f/d标明其为文件或文件夹
		File path4 = new File(".");
		File[] files4 = path4.listFiles(new FilenameFilter() {
			Pattern pattern = Pattern.compile("\\..*");

			@Override
			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		});
		for (File f : files4) {
			String sfd = (f.isFile()) ? "f" : "d";
			System.out.println(f.getName() + "---->" + sfd);
		}
	}
}
