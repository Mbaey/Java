package com.demo2;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

import org.junit.Test;

public class FileListDemo3 {

	/*
	 * list()��listFiles()�������������ڣ�list()���ص���һ��String�������飬��ֻ��һ�����飻
	 * ��listFiles()�������ص���һ��File������ã�����������������Ժͷ�����
	 * 
	 * �����ǰ������������File[]���ͣ����ĸ�����static File[]���͡� �������� ��
	 * ��·���������ļ����ļ��еľ���·����pathname��ע��File����ָ����·�����������ļ��� listFiles()
	 * listFiles(FileFilter filter) listFiles(FilenameFilter filter) listRoots()
	 * 
	 */
	@Test
	public void test3() {
		System.out.println("-----�б�ǰĿ¼�µ��ļ��Ƿ�Ϊ�ļ���----");
		// 1���г���ǰĿ¼�µ������ļ����ļ��У�����ΪFile���������飬�б����Ƿ�Ϊ�ļ���
		File path = new File(".");
		File[] files = path.listFiles();
		for (File f : files) {
			
			System.out.println(f + " ---> is a Directory? " + f.isDirectory());
		}

		System.out.println("-----��ѡ����ǰĿ¼�µ������ļ���----");
		// 2����ѡ����ǰĿ¼�µ������ļ���
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

		System.out.println("-----��ѡ����ǰĿ¼�µ�������s��ͷ���ļ���----");
		// 2����ѡ����ǰĿ¼�µ�������s��ͷ���ļ���
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

		System.out.println("-----��ѡ����ǰĿ¼�µ�������.��ͷ���ļ��У����ұ����ļ�����----");
		// 3����ѡ����ǰĿ¼����.��ͷ���ļ����ļ��У���������󲿱���f/d������Ϊ�ļ����ļ���
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
