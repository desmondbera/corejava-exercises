package com.perscholas.java_basics;

public class AddTwoDoublesDivide {
	
	private double num1;
	private double num2;
	private double largeNum;
	private double smallNum;
	private double total;
	
	public void setNums(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		findLgAndSmNums(num1, num2);
	}
	
	public void findLgAndSmNums(double num1, double num2) {
		if(num1 > num2) {
			this.largeNum = num1;
			this.smallNum = num2;
		} else {
			this.largeNum = num2;
			this.smallNum = num1;
		}
	}
	
	public double setTotal() {
		this.total = largeNum / smallNum;
		return (int) this.total;
	}
	
	public void printTotal() {
		System.out.println("Our total of dividing the larger double by the smaller one is: " + setTotal() );
	}
	
}
