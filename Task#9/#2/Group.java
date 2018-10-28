package com.gmail.t.bisyk;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Group implements MilStat {
	private Student[] grp = new Student[10];
	private List<Student> grpStd = new ArrayList<>();

	public Group(Student[] grp) {
		super();
		this.grp = grp;
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void stdInGrp(Student std) {
		if (grpStd.size() == 10) {
			System.out.println("The group is full.");
			return;
		}
		grpStd.add(std);
		System.out.println(std.getSecondName() + " was accepted.");
	}

	public Student stdSrchInGrp(Student std) {
		for (Student student : grpStd) {
			if (student.getSecondName().equals(std.getSecondName()) && student.getName().equals(std.getName())) {
				return student;
			}
		}
		return null;
	}

	public void stdAcc() {
		Student stdA = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input second name ");
		stdA.setSekondName(sc.nextLine());
		System.out.print("Input name ");
		stdA.setName(sc.nextLine());
		System.out.print("Input age ");
		for (;;) {
			try {
				stdA.setAge(Integer.parseInt(sc.nextLine()));
				break;
			} catch (NumberFormatException e) {
				System.out.println("Try again ");
			}
		}
		System.out.print("Input colege ");
		stdA.setColege(sc.nextLine());
		System.out.print("Input facultet ");
		stdA.setFakultet(sc.nextLine());
		System.out.print("Input gender m/f ");
		for (;;) {
			String sex = sc.nextLine();
			if (sex.equals("m")) {
				stdA.setSex(true);
				break;
			}
			if (sex.equals("f")) {
				stdA.setSex(false);
				break;
			}
			System.out.println("Try again");
		}
		stdInGrp(stdA);
	}

	public void stdDellFromGrp(Student std) {
		boolean out = true;
		for (Student student : grpStd) {
			if (student.getSecondName().equals(std.getSecondName()) && student.getName().equals(std.getName())) {
				out = false;
			}
		}
		if (out) {
			System.out.println(std.getSecondName() + " is not in this group.");
		} else {
			grpStd.remove(std);
			System.out.println(std.getSecondName() + " was deleted.");
		}
	}

	public List<Student> sort() {
		System.out.print("How you want to sort by age or sekondname (a/s):");
		Scanner sc = new Scanner(System.in);
		for (;;) {
			String s = sc.nextLine();
			if (s.equals("a")) {
				Collections.sort(grpStd, (a, b) -> a.getAge() - b.getAge());
				break;
			}
			if (s.equals("s")) {
				Collections.sort(grpStd, (a, b) -> a.getSecondName().compareTo(b.getSecondName()));
				break;
			}
			System.out.println("Try again");
		}
		System.out.println(grpToString(grpStd));
		return grpStd;
	}


	private String grpToString(List<Student> list) {
		StringBuilder sb = new StringBuilder();
		for (Student student : list) {
			String std = student.getSecondName() + " " + student.getName() + " " + student.getAge() + " "
					+ student.getColege() + " " + student.getFakultet() + " " + (student.isSex() ? "man" : "wooman")
					+ "\n";
			sb.append(std);
		}
		return sb.toString();
	}

	public List<Student> stdArm() {
		System.out.println(grpToString(stdFromGroupToArmy()));
		return stdFromGroupToArmy();
	}

	@Override
	public List<Student> stdFromGroupToArmy() {
		List<Student> grpArm = new ArrayList<>();
		for (Student student : grpStd) {
			if (student.isSex() && (student.getAge() > 17)) {
				grpArm.add(student);
			}
		}
		return grpArm;
	}

}
