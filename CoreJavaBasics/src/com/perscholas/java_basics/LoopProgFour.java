package com.perscholas.java_basics;

public class LoopProgFour {
	
	public void Loop5() {
		
		for(int x = 1; x <= 100; x++) {
			if(x % 5 == 0) {
				if(x >= 25 && x <= 75) {
					continue;
				} else {
					System.out.println(" x is divisible by 5. X is: " + x);
				}
			} 
		}
	}
}
