package com.gmail.t.bisyk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hmnOne = new Human();
		Group grp = new Group();
		Student stdOne = new Student("A.Bisyk", "Taras1", true, 18, "KPI", "FIOT");
		Student stdTwo = new Student("B.Bisyk", "Ira1", false, 18, "KPI", "FIOT");
		Student stdThree = new Student("C.Bisyk", "Taras3", true, 19, "KPI", "FIOT");
		Student stdFour = new Student("D.Bisyk", "Taras4", true, 18, "KPI", "FIOT");
		Student stdFive = new Student("E.Bisyk", "Taras5", true, 22, "KPI", "FIOT");
		Student stdSix = new Student("F.Bisyk", "Ira2", false, 18, "KPI", "FIOT");
		Student stdSeven = new Student("G.Bisyk", "Taras7", true, 21, "KPI", "FIOT");
		Student stdEight = new Student("H.Bisyk", "Taras8", true, 18, "KPI", "FIOT");
		Student stdNine = new Student("I.Bisyk", "Taras9", true, 20, "KPI", "FIOT");
		Student stdEleven = new Student("K.Bisyk", "Taras11", true, 18, "KPI", "FIOT");

		grp.stdInGrp(stdOne);
		grp.stdInGrp(stdTwo);
		grp.stdInGrp(stdThree);
		grp.stdInGrp(stdFour);
		grp.stdInGrp(stdFive);
		grp.stdInGrp(stdSix);
		grp.stdInGrp(stdSeven);
		grp.stdInGrp(stdEight);
		grp.stdInGrp(stdNine);
//		grp.stdAcc();

		System.out.println("--------------------");

		grp.stdInGrp(stdEleven);
		System.out.println("--------------------");

		grp.stdDellFromGrp(stdSix);
		grp.stdDellFromGrp(stdOne);
		System.out.println("--------------------");

		grp.stdInGrp(stdOne);
		grp.stdInGrp(stdSix);
		System.out.println("--------------------");

		if (grp.stdSrchInGrp(stdOne)==null) {
			System.out.println(stdOne.getSecondName() + " is not in the group.");
		}else {
			System.out.println(grp.stdSrchInGrp(stdOne).getSecondName() + " is in the group.");

		}
		if (grp.stdSrchInGrp(stdEleven)==null) {
			System.out.println(stdEleven.getSecondName() + " is not in the group.");
		}else {
			System.out.println(grp.stdSrchInGrp(stdEleven).getSecondName() + " is in the group.");

		}
		System.out.println("********************");
		grp.sort();
		System.out.println("***********");
		System.out.println("Student conscript:");
		grp.stdArm();
		
	}

}
