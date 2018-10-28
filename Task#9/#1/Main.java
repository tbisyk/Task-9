package com.gmail.t.bisyk;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int a = (int) (Math.random() * 100);
			list.add(a);
		}
		System.out.println(list.toString());

		list.remove(0);
		list.remove(0);
		list.remove(list.size()-1);
		
		System.out.println(list.toString());
	}

}
