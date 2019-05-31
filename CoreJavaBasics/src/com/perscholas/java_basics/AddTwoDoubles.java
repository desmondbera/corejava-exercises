package com.perscholas.java_basics;

public class AddTwoDoubles {
	private double num1;
	private double num2;
	private double total;
	
	//Constructor
//	public AddTwoDoubles(double num1, double num2) {
//		this.num1 = num1;
//		this.num2 = num2;
//		
//		this.total = num1 + num2;
//	}
	
	
	
	public double getNum1() {
		return num1;
	}
	
	public double getNum2() {
		return num2;
	}

	public void setNums(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public void printTotal() {
		this.total = num1 + num2;
		System.out.println("Our result for adding two doubles: " + total);
	}

}
