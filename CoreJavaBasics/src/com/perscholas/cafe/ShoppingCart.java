package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	private List<String> shoppingArr;
//	private List<String> shoppingArr = new ArrayList<String>();
//	private Object[] shoppingArr = new Object[5];

	public ShoppingCart() {
		this.shoppingArr = new ArrayList<String>();
	}

	public void addToCart(String item, double price, int qty, boolean option1, boolean option2, String subTotal) {
			shoppingArr.add(item);
			shoppingArr.add(String.valueOf(price));
			shoppingArr.add(String.valueOf(qty));
			shoppingArr.add(String.valueOf(option1));
			shoppingArr.add(String.valueOf(option2));
			shoppingArr.add(subTotal);

	}
	
	
	public void printCart() {
		System.out.println("=======RECEIPT======");
		
		for(int x = 0; x < shoppingArr.size(); x+=6) {
			
			int count = 0;
			String currItem = null;
			for(int y = x; y < x + 6; y++) {
				
				if(count == 0) {
					currItem = shoppingArr.get(y);
					System.out.println("Our currItem is now: " + currItem);
					System.out.println("Item: " + shoppingArr.get(y));
				} else if(count == 1) {
					System.out.println("Price: " + shoppingArr.get(y));
				} else if(count == 2) {
					System.out.println("Qty: " + shoppingArr.get(y));
				} else if(count == 3) {
					if(shoppingArr.get(y).equalsIgnoreCase("true")) {
						//TODO: Check for what type of current item we have so 
						// we can set the appropriate options.
						if(currItem.equalsIgnoreCase("Coffee")) {
							System.out.println("Sugar: Yes");
						} else if(currItem.equalsIgnoreCase("Espresso")) {
							System.out.println("Extra shot: Yes (Add $2)");
						} else if(currItem.equalsIgnoreCase("Cappuccino")) {
							System.out.println("Peppermint: Yes (Add $2)");
						}
					} else {
						if(currItem.equalsIgnoreCase("Coffee")) {
							System.out.println("Sugar: No");
						} else if(currItem.equalsIgnoreCase("Espresso")) {
							System.out.println("Extra shot: No");
						} else if(currItem.equalsIgnoreCase("Cappuccino")) {
							System.out.println("Peppermint: No");
						}
					}
				} else if(count == 4) {
					if(shoppingArr.get(y).equalsIgnoreCase("true")) {
						if(currItem.equalsIgnoreCase("Coffee")) {
							System.out.println("Milk: Yes");
						} else if(currItem.equalsIgnoreCase("Espresso")) {
							System.out.println("Machiatto: Yes (Add $1)");
						} else if(currItem.equalsIgnoreCase("Cappuccino")) {
							System.out.println("Whipped Cream: Yes (Add $1)");
						}
					} else {
						if(currItem.equalsIgnoreCase("Coffee")) {
							System.out.println("Milk: No");
						} else if(currItem.equalsIgnoreCase("Espresso")) {
							System.out.println("Machiatto: No");
						} else if(currItem.equalsIgnoreCase("Cappuccino")) {
							System.out.println("Whipped Cream: No");
						}			
					}
				} else if(count == 5) {
					System.out.println("Subtotal: " + shoppingArr.get(y));
				}
				count++;
			}
			System.out.println("====");
		}
	}
	
}
