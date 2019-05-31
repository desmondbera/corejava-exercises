package com.perscholas.java_basics;

public class AddTwoIntsDivide {
	
	private double num1;
	private double num2;
	private int largeNum;
	private int smallNum;
	private int total;
	
	public AddTwoIntsDivide(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		
		findLarge(num1, num2);
	}
	
	public void findLarge(double x, double y) {
		if(x > y) {
			largeNum = (int) x;
			smallNum = (int) y;
		} else {
			largeNum = (int) y;
			smallNum = (int) x;
		}
	}
	
	public int divideLarge() {
		return (int) (largeNum / smallNum);
	}
	
	
	public void printResult() {
		System.out.println("Our result of dividing large by small is: " + divideLarge());
	}
	
}
