package com.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class F<T>{
	T name;

	public F(T name) {
		super();
		this.name = name;
	}
	
}

public class ·ºÐÍTest {
	public static void main(String[] args) {
		
		String name = "Mbaey";
		F f = new F<String>(name);
		System.out.println(f.name);
		
	}
}
