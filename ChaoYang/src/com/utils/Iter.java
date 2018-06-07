package com.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iter {
	public static void main(String[] args) {
		/*
		 * File file = new File("d:\\abcd.txt"); System.setOut(out);
		 * System.out.println("abc");
		 */

		// LinkedList<String> list = new LinkedList<>();

		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");

		for (String item : list)
			System.out.print(item + "  ");
		System.out.println();
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");

		System.out.println("*************");
		// iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("**********");
		// 专门用来遍历List
		ListIterator<String> iterator2 = list.listIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}

}
