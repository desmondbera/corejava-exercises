package com.perscholas.java_basics;

public class AddTwoInts{
	private int num1;
	private int num2;
	private int total;
	
	//Constructors
	public AddTwoInts(int num1, int num2) {
		System.out.println("Constrcutor running!");
		this.num1 = num1;
		this.num2 = num2;
		this.total = num1 + num2;
	}
	
	public void setInts() {
		
	}
	
	public void getInts() {
		
	}
	
	public void Ans(){
		System.out.println("Our total is: " + total);
	}
	
}
