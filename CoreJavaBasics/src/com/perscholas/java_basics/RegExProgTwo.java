package com.perscholas.java_basics;

import java.util.Arrays;

public class RegExProgTwo {
	
	private String namesArr[];
	
	RegExProgTwo() {
		this.namesArr = new String[4];
		namesArr[0] = "Doe, John";
		namesArr[1] = "Doe, Jane";
		namesArr[2] = "Doe, James";
		namesArr[3] = "Doe, Joan";
		System.out.println("Our names arr is: " + Arrays.deepToString(namesArr));
		
	}

	public void formatOutput() {
		for(int x = 0; x < namesArr.length; x++) {
			//1. Split into temp array at ",";
			String temp[] = namesArr[x].split(", ");
			for(int y = temp.length - 1; y >= 0; y--) {
				if(y != 0) {
					System.out.println("First Name: "+temp[y]);
				} else {
					System.out.println("Last Name: " + temp[y]);
				}
				
			}
		}
		
	}
	
}
