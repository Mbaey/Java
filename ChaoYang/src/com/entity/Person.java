package com.entity;

public class Person {
	private boolean gender;
	private String name;
	private int height;

	public String isGender() {
		if (gender == true)
			return "male";
		else
			return "female";
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Person(boolean gender, String name, int height) {
		super();
		this.gender = gender;
		this.name = name;
		this.height = height;
	}

	public Person() {
		super();
	}

	public void eat() {
		System.out.println("person eat ");
	}

	@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + ", height=" + height + "]";
	}

}
