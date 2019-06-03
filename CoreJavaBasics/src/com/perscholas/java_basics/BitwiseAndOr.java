package com.perscholas.java_basics;

public class BitwiseAndOr {
	private int x;
	private int y;
	private int z;
	
	public BitwiseAndOr() {
		this.x = 7; // 7 in binary is   0000 0111
		this.y = 17; // 17 in binary is 0001 0001
	}
	
	public void doBiteWiseAnd() {
		//I predict bitwise and operator will choose the smaller num.
		System.out.println("x & y = " + (x & y));
		this.z = (x & y);
	}
	
	public void doBiteWiseOr() {
		System.out.println(" x | y  = " + (x | y));
		this.z = (x | y);
	}
	
	public void printZ() {
		System.out.println("our z is " + z);
	}
}
