package com.gmail.t.bisyk;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayDeque<String> bbtt = new ArrayDeque<>();

		bbtt.push("Penny");
		bbtt.push("Kutrapalli");
		bbtt.push("Volovetc");
		bbtt.push("Leonard");
		bbtt.push("Sheldon");

		System.out.println(bbtt.toString());
		System.out.println("-----------------------");
		System.out.print("Cola - ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String temp = bbtt.poll();
			bbtt.addLast(temp);
			bbtt.addLast(temp);
		}

		System.out.println(bbtt.toString());

	}

}
