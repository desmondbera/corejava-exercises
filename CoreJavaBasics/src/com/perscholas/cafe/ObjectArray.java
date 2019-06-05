package com.perscholas.cafe;

import java.util.Arrays;

public class ObjectArray {
	private Object[] objArr = new Object[5];
	
	//Constructor 
	public ObjectArray(String name, double price) {
		this.objArr[0] = name;
		this.objArr[1] = price;
//		this.objArr[2] = qty;
//		this.objArr[3] = subtotal;
//		this.objArr[4] = firstAddOn;
//		this.objArr[5] = secondAddon;
	}
	
	public String getName() {
		Object o = objArr[0];
		String s = null;
		
		if(o instanceof String) {
			s = (String) o;
		}
		System.out.println("Our s is: " + s);
		return s;
	}
	
	public void printArr() {
		for(int x = 0; x < objArr.length; x++) {
			System.out.println("X is: " + objArr[x]);
		}
	}
	
	public Object[] getCurrentOrder() {
		return objArr;
	}
	
}
