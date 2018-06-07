package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
	public static void main(String[] args) {
		//why cann't be int?
		List<String> list = new ArrayList<>();
		list.add("232");
		list.add("56");
		list.add("Li");
		list.add("adw6");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));			
		}
		
		System.out.println("\n----------");
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println(list.contains("Li"));
	}
}
