package com.perscholas.cafe;

public class DrinkCount {

	private int count;
	private String totalOptionsCost;;
	
	//Constructor 1
	public DrinkCount() {
		this.count = 0;
	}
	
	//Methods
	public void addDrinks(int x) {
		count += x;
	}

	public int getDrinkCount() {
		System.out.println("Our drink count is: " + count);
		return count;
	}
	
	public void setTotalOptionsCost(String total) {
		totalOptionsCost = total;
	}
	
	public String getTotalOptionCost() {
		System.out.println("total options cost is: " + totalOptionsCost);
		return totalOptionsCost;
	}
	
}
