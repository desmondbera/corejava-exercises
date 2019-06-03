package com.perscholas.java_basics;

public class BitLeftShift {
	private int x;
	
	BitLeftShift() {
		this.x = 12;
	}
	
	BitLeftShift(int x) {
		this.x = x;
	}
	
	public void printBinaryOfInt() {
		System.out.println("Our int to convert is: " + x);
		String s = "";
		while(x > 0) {
			// if our int is divisible by 2 then we return "0" else we return "1"
			// this will keep appending to the 
			s = ( (x % 2) == 0 ? "0" : "1") + s;
			x /= 2;
		}
		System.out.println("X in binary is; " + s);
	}
 	
	public void shiftLeft() {
		System.out.println("X at the start of this method is: " + x);
		x = x << 1;
		System.out.println("Shifted x to the left by one. X is now: "+ x);
	}
	
	public void shiftRight() {
		System.out.println("Shifting to the right. X is: "+ x);
		x = x >> 2;
		System.out.println("Shifted x to the right by 2. X is now: " + x);
	}
}
