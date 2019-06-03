package com.perscholas.java_basics;

public class LoopProgSeven {
	public void NestedLoop() {
		for(int x = 0; x < 2; x++) {
			for(int y = 0; y < 5; y++) {
				System.out.println("Outer loop is: " + x + ". Inner loop is: " + y);
			}
		}
	}
}
