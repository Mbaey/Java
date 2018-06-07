package com.demo2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

import org.junit.Test;

public class   FileListDemo2 {


	// һ������ʵ�ֽӿڵķ�ʽ
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
	 * �������������ڲ���ķ�ʽ�� ����implements�ķ�ʽ��ʵ�ֽӿڣ����Ƕ���һ����̬�������˾�̬��������һ��FilenameFilter����
	 * ���������������return new FilenameFilter();������������֮ǰ��˵����һ�£���Ҫ�����ﶨ��
	 * һ���࣬��ľ���ʵ������һ������������������
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
		System.out.println("------��ѡ��ǰĿ¼����.��ͷ���ļ����ļ���-------");
		// 1����ѡ��ǰĿ¼����.��ͷ���ļ����ļ��У����Ҵ�ӡ����(����һ������ʵ��FilenameFilter�ӿ�)
		File path = new File(".");
		String[] nameList = path.list(new FileNameFilter1("\\..*"));
		for (String itemName : nameList) {
			System.out.println(itemName);
		}

		System.out.println("------��ѡ��ǰĿ¼����b��ͷ���ļ����ļ���-------");
		// 2����ѡ��ǰĿ¼����b��ͷ���ļ����ļ��У����Ҵ�ӡ����(ʹ�������ڲ���ķ�ʽ��ʵ��)
		File path2 = new File(".");
		String[] nameList2 = path2.list(FileNameFilter2.filter("b.*"));
		for (String itemName : nameList2) {
			System.out.println(itemName);
		}

		System.out.println("------��ѡ��ǰĿ¼����s��ͷ���ļ����ļ���-------");
		// 3���������ڲ������õ�����
		File path3 = new File(".");
		String[] nameList3 = path3.list(new FilenameFilter() {// ��ʵ���ڵڶ��ַ�ʽ�Ļ����Ͼ�������ġ�
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
