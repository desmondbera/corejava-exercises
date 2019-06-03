package com.perscholas.java_basics;

public class IncrementProgThree {
	
	private int num1;
	
	IncrementProgThree() {
		this.num1 = 66;
	}
	
	public void MethodOne() {
		System.out.println("Num1 is: " + num1);
		num1++;
		System.out.println("Added one. Num is: " + num1);
		num1++;
		System.out.println("Added one more. Num is: " + num1);
	}
	
	public void MethodTwo() {
		System.out.println("Num1 is: " + num1);
		++num1;
		System.out.println("Added one. Num is: " + num1);
		++num1;
		System.out.println("Added one more. Num is: " + num1);
	}
	
	public void MethodThree() {
		System.out.println("Num 1 is: " + num1);
		num1 += 1;
		System.out.println("Added one. Num is: " + num1);
		num1 += 1;
		System.out.println("Added one more. Num is: " + num1);
		
	}
	
}
