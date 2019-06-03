package com.perscholas.java_basics;

public class IncrementProg {
	private int num1;
	
	IncrementProg() {
		this.num1 = 5;
	}
	
	public void printNum() {
		System.out.println("Our num is "+ num1);
		this.num1++;
		System.out.println("Our num has incremented by one: " + num1);
	}
}
