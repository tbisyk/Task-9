package com.gmai.t.bisyk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFromFile {

	public TextFromFile() {
		super();
	}

	public List<Character> readText(String file) {
		String rowLine = "";
		List<Character> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			while ((rowLine = br.readLine()) != null) {
				StringBuilder sb = new StringBuilder();
				sb.append(rowLine);
				for(;sb.length()>0;) {
					list.add(sb.charAt(0));
					sb.delete(0, 1);
				}
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return list;
	}

}
