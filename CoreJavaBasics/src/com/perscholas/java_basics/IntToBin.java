package com.perscholas.java_basics;

public class IntToBin {
	private int num1;
	
	public IntToBin(int num1) {
		this.num1 = num1;
		System.out.println("Binary of " + num1 + " is " + String.format("%6s", Integer.toBinaryString(num1)).replace(" ", "0"));
	}
	
}
