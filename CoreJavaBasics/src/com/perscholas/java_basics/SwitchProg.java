package com.perscholas.java_basics;

import java.util.Scanner;

public class SwitchProg {
	
	private int userInt;
	
	SwitchProg() {
		System.out.println("Please enter an integer between 1 and 7: ");
		Scanner scan = new Scanner(System.in);
		this.userInt = scan.nextInt();
		
	}
	
	public void printWeekday() {
		switch(userInt) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Out of range");
				break;
				
		}
	}
}
