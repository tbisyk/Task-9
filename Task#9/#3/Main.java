package com.gmai.t.bisyk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		TextFromFile tff = new TextFromFile();
		List<Character> list = new ArrayList<>();
		list = tff.readText("textOne.txt");
		List<SumLetter> sm = new ArrayList<>();
//		TreeSet<SumLetter> sm = new TreeSet<SumLetter>((a,b)->b.getSum()-a.getSum());
		for (int i = 0; i < 26; i++) {
			int deltaBig = Delta(i, 97, list);
			int deltaLittel = Delta(i, 65, list);
			sm.add(new SumLetter((deltaBig + deltaLittel), (char) (i + 97)));
		}
		Collections.sort(sm, (a, b) -> b.getSum() - a.getSum());
		for (SumLetter sumLetter : sm) {
			System.out.println(sumLetter);
		}
	}

	public static int Delta(int i, int n, List list) {
		List<Character> temp = new ArrayList<>();
		char tempC = (char) (i + n);
		temp.add(tempC);
		int delta = list.size();
		list.removeAll(temp);
		delta = delta - list.size();
		return delta;
	}
}
