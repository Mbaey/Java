package com.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Hero implements Comparable<Hero>{
	int hp;
	String name;
		
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hero(int hp, String name) {
		super();
		this.hp = hp;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "Hero [hp=" + hp + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Hero o) {
		if(this.hp > o.hp)
			return  1;
		else
			return -1;
	}
	
	

	
}

public class ImplComparableDemo {
	public static void main(String[] args) {
		ArrayList<Hero> heroes = new ArrayList<Hero>();
		heroes.add(new Hero(10, "¸ÇÂ×"));
		heroes.add(new Hero(12, "ÌáÄª"));
		heroes.add(new Hero(8, "easy"));
		heroes.add(new Hero(80, "easy"));
		heroes.add(new Hero(18, "easy"));
		heroes.add(new Hero(2, "easy"));
		
		
		Collections.sort(heroes);
		heroes
		.stream()
		.filter(h -> h.hp >8)
		.forEach(h -> System.out.println(h.name + h.hp));
		
	}
	
	
}