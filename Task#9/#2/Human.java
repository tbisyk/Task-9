package com.gmail.t.bisyk;

public class Human {
	private String secondName;
	private String name;
	private boolean sex;
	private int age;

	public Human(String secondName, String name, boolean sex, int age) {
		super();
		this.secondName = secondName;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSekondName(String secondName) {
		this.secondName = secondName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}