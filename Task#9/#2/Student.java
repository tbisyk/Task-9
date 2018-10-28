package com.gmail.t.bisyk;

public class Student extends Human {
	private String colege;
	private String fakultet;

	public Student(String secondName, String name, boolean sex, int age, String colege, String fakultet) {
		super(secondName, name, sex, age);
		this.colege = colege;
		this.fakultet = fakultet;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String secondName, String name, boolean sex, int age) {
		super(secondName, name, sex, age);
		// TODO Auto-generated constructor stub
	}

	public String getColege() {
		return colege;
	}

	public void setColege(String colege) {
		this.colege = colege;
	}

	public String getFakultet() {
		return fakultet;
	}

	public void setFakultet(String fakultet) {
		this.fakultet = fakultet;
	}


}
