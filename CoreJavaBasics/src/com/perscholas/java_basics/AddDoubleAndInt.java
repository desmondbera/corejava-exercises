package com.perscholas.java_basics;

public class AddDoubleAndInt {
	
	private int num1;
	private double num2;
	private double total;
	
	public void setNums(int num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		setTotal();
	}
	
	public void setTotal() {
		this.total = num1 + num2;
	}
	
	public void printTotal() {
		System.out.println("Our total after adding 1 int and 1 double is: " + total);
	}
	
	
}
