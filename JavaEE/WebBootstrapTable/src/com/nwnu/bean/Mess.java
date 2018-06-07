package com.nwnu.bean;

import java.util.Date;

public class Mess {
	private String name, title, message, timestampDate;

	public Mess(String name, String title, String message, String timestampDate) {
		super();
		this.name = name;
		this.title = title;
		this.message = message;
		this.timestampDate = timestampDate;
	}

	public Mess() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimestampDate() {
		return timestampDate;
	}

	public void setTimestampDate(String timestampDate) {
		this.timestampDate = timestampDate;
	}

	@Override
	public String toString() {
		return "Board [name=" + name + ", title=" + title + ", message="
				+ message + ", timestampDate=" + timestampDate + "]";
	}
	

}
