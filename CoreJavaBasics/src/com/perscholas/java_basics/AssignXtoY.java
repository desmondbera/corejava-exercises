package com.perscholas.java_basics;

public class AssignXtoY {
	private int x;
	private int y;
	private int q;

	public void setNums(int x, int y) {
		this.x = x;
		this.y = y;
		this.q = y / x;
	}
	
	public void yToDouble() {
		//1. Cast Y to a double
		double y = 6;
		this.x = 5;
//		System.out.println("y is: " + y);
//		System.out.println("x is: " + x);
		//2. Assign to q
		double q = y;
		//3. Print q again
		System.out.println("Updated q is: " + q);
	}
	
	public void printQ() {
		System.out.println("Q is: " + q);
	}
}
