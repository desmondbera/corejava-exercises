package com.perscholas.java_basics;

public class LoopProgFive {
	
	public void LoopTo50() {
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) {
				if(i >= 50) {
					break;
				} else {
					System.out.println("I is: " + i);
				}
				
			}
		}
	}
	
}
