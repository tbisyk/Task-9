package com.gmai.t.bisyk;

public class SumLetter{
	private int sum;
	private char letter;

	public SumLetter(int sum, char letter) {
		super();
		this.sum = sum;
		this.letter = letter;
	}

	public int getSum() {
		return sum;
	}

	@Override
	public String toString() {
		return sum + " - " + letter;
	}

	
}
