package com.nwnu.bean;

public class Car {
	private String number,name, date;

	public Car(String number, String name, String date) {
		super();
		this.number = number;
		this.name = name;
		this.date = date;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "car [number=" + number + ", name=" + name + ", date=" + date
				+ "]";
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
