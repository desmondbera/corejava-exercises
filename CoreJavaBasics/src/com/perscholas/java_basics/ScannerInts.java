package com.perscholas.java_basics;

import java.util.Scanner;

public class ScannerInts {
	private int num1;
	private int num2;
	private int sum;
	
	public ScannerInts() {
		System.out.println("Please pick two integers, separeted by a space: ");
		Scanner s = new Scanner(System.in);
		this.num1 = s.nextInt();
		this.num2 = s.nextInt();
		this.sum = num1 + num2;
//		s.close();
	}
	public void printSum() {
		System.out.println("Our sum is: " + sum);
	}
}
