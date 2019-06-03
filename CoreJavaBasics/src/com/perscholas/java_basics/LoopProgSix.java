package com.perscholas.java_basics;

public class LoopProgSix {
	
	public void LoopThruWeeks() {
		for(int x = 1; x <= 2; x++) {
			System.out.println("Week " + x +":");
			for(int y = 1; y <=5; y++) {
				System.out.println("Day " + y);
			}
		}
	}
}
