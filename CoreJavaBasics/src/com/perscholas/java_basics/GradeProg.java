package com.perscholas.java_basics;

import java.util.Scanner;

public class GradeProg {
	private int grade;
	
	public GradeProg() {
		System.out.println("Enter a number score from 0 to 100: ");
		Scanner scan = new Scanner(System.in);
		this.grade = scan.nextInt();		
	}
	
	public void checkInRange() {
		if(grade >= 90 && grade < 100) {
			System.out.println("Your grade is an A");
		} else if(grade >= 80 && grade < 90) {
			System.out.println("Your grade is a B");
		} else if (grade >= 70 && grade < 80) {
			System.out.println("Your grade is a C");
		} else if(grade >= 60 && grade < 70) {
			System.out.println("Your grade is a D");
		} else if(grade >= 0 && grade < 60) {
			System.out.println("Your grade is an F");
		} else {
			System.out.println("Score out of range");
		}
	}
}
