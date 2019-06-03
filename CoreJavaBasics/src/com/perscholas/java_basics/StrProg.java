package com.perscholas.java_basics;

public class StrProg {

	StrProg() {
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb is: " + sb);
		sb.append(" World!");
		System.out.println("Sb is now: " + sb);
		sb.append(" World");
		System.out.println("Sb updated again: " + sb);
		sb.insert(5, " New");
		sb.replace(5, 9, " Old");
		System.out.println("Sb has changed: " + sb);
		sb.reverse();
		System.out.println("Final sb: " + sb);
	}
}
