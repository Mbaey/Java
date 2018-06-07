package com.entity;

import java.io.Serializable;

public class Student extends Person implements Serializable{
	private float score;

	/**
	 * @param gender
	 * @param name
	 * @param height
	 * @param score
	 */
	public Student(boolean gender, String name, int height, float score) {
		super(gender, name, height);
		this.score = score;
	}

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param gender
	 * @param name
	 * @param height
	 */
	public Student(boolean gender, String name, int height) {
		super(gender, name, height);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public String toString() {
		return "Student [score=" + score + ", getScore()=" + getScore() + ", hashCode()=" + hashCode() + ", isGender()="
				+ isGender() + ", getName()=" + getName() + ", getHeight()=" + getHeight() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + "]";
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(score);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Float.floatToIntBits(score) != Float.floatToIntBits(other.score))
			return false;
		return true;
	}

	
}
