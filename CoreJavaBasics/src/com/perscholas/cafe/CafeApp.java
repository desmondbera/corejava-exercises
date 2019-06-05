package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please select from the following menu: ");
		System.out.println("1: Coffee");
		System.out.println("2: Cappuccino");
		System.out.println("3: Espresso");
		System.out.println("4: Checkout");
		
		ShoppingCart cart = new ShoppingCart();
		double salesTax = 0.06;
		Double TOTAL_BEFORE_TAX = 0.00;
		Double GRAND_TOTAL;
		
		//Coffee - Set basic information  
		Coffee cupOfJoe = new Coffee();
		cupOfJoe.setDescription("32oz Special Dark Roast");
		cupOfJoe.setName("Coffee");
		cupOfJoe.setPrice(3.47);
		DrinkCount coffeeTotal = new DrinkCount();
		Double productCoffeeTotal = 0.00;
		
		//Cappuccino Stuff - Set basic information 
		Cappuccino capp = new Cappuccino();
		capp.setDescription("Gob smacking deliciousness that should be illegal.");
		capp.setName("Cappuccino");
		capp.setPrice(4.99);
		DrinkCount cappTotal = new DrinkCount();
		Double productCappTotal = 0.00;
		int pepperCount = 0;
		int whipCount = 0;
		Double totalCappAddOn = 0.00;
		
		//Espresso Stuff - Set basic information 
		Espresso esp = new Espresso();
		esp.setDescription("Small but potent espresso shot to jump start your morning!");
		esp.setName("Espresso");
		esp.setPrice(3.99);
		DrinkCount espressoTotal = new DrinkCount();
		Double productEspressoTotal = 0.00;
		int extraShotCount = 0;
		int machiattoCount = 0;
		Double totalEspAddOn = 0.00;
		
		while(s.hasNext()) {
			String userInput = s.nextLine();			
			if(userInput.equalsIgnoreCase("Coffee")) {				
				int optionCount = 0;
				
				System.out.println("How many coffees would you like? ");
				String coffeeCount = s.nextLine();
				
				//1. Keep track of ALL coffees while the customer is still ordering
				coffeeTotal.addDrinks(Integer.parseInt(coffeeCount));
				//1.1 Keep track of current orders coffee count
				cupOfJoe.setQuantity(Integer.parseInt(coffeeCount));
				cupOfJoe.printOptions(optionCount++);
				
				String sugarWithCoffee = s.nextLine();
				if(sugarWithCoffee.equalsIgnoreCase("yes")) {
					cupOfJoe.setSugar(true);
				}
				
				cupOfJoe.printOptions(optionCount);
				String milkWithCoffee = s.nextLine();
				
				if(milkWithCoffee.equalsIgnoreCase("yes")) {
					cupOfJoe.setMilk(true);
				}
				
				String currSubtotal = cupOfJoe.calculateProductSubtotal(cupOfJoe.getQuantity(), cupOfJoe.getPrice());
//				System.out.println("Our current order subtotal is: " + currSubtotal);
				cart.addToCart(cupOfJoe.getName(), cupOfJoe.getPrice(), cupOfJoe.getQuantity(), cupOfJoe.getSugar(), cupOfJoe.getMilk(), currSubtotal);
				
			
			} else if(userInput.equalsIgnoreCase("Espresso")) {
				int optionCount = 0;
				System.out.println("How many espressos would you like? ");
				String espressoCount = s.nextLine();
				
				//1. Keep track of all espressos while the customer is still ordering
				espressoTotal.addDrinks(Integer.parseInt(espressoCount));
				//1.1 Keep track of current order of espressos
				esp.setQuantity(Integer.parseInt(espressoCount));
				
				esp.printOptions(optionCount++);
				
				String espWithExtraShot = s.nextLine();
				if(espWithExtraShot.equalsIgnoreCase("yes")) {
					esp.setExtraShot(true);
					extraShotCount++;
				}
				
				esp.printOptions(optionCount);
				
				String espMachiatto = s.nextLine();
				if(espMachiatto.equalsIgnoreCase("yes")) {
					esp.setMacchiato(true);
					machiattoCount++;
				}
				
				String currSubtotal = esp.calculateProductSubtotal(esp.getQuantity(), esp.getPrice(), esp.getShot(), esp.getMacchiato());
//				espressoTotal.setTotalOptionsCost(currSubtotal);
				
				cart.addToCart(esp.getName(), esp.getPrice(), esp.getQuantity(), esp.getShot(), esp.getMacchiato(), currSubtotal);
				
			} else if(userInput.equalsIgnoreCase("Cappuccino")) {
				int optionCount = 0;
				System.out.println("How many cappuccinos would you like? ");
				String cappCount = s.nextLine();
				
				//1. keep track of ALL cappuccinos while customer is still ordering
				cappTotal.addDrinks(Integer.parseInt(cappCount));
				//1.1 keep track of current order of cappuccinos
				capp.setQuantity(Integer.parseInt(cappCount));
				
				capp.printOptions(optionCount++);
				
				String cappWithPepper = s.nextLine();
				if(cappWithPepper.equalsIgnoreCase("yes")) {
					capp.setPeppermint(true);
					pepperCount++;
					
				}
				
				capp.printOptions(optionCount);
				
				String cappWithWhip = s.nextLine();
				if(cappWithWhip.equalsIgnoreCase("yes")) {
					capp.setWhippedCream(true);
					whipCount++;
				}
				
				String currSubtotal = capp.calculateProductSubtotal(capp.getQuantity(), capp.getPrice(), capp.getPeppermint(), capp.getWhippedCream());
				cart.addToCart(capp.getName(), capp.getPrice(), capp.getQuantity(), capp.getPeppermint(), capp.getWhippedCream(), currSubtotal);
				
				
				
			} else if(userInput.equalsIgnoreCase("Checkout")) {
				//Print out purchase total 
				cart.printCart();

				if(extraShotCount >= 1) {
					totalEspAddOn += (2.00 * espressoTotal.getDrinkCount());
				}
				
				if(machiattoCount >= 1) {
					totalEspAddOn += (1.00 * espressoTotal.getDrinkCount());
				}
				
				if(pepperCount >= 1) {
					totalCappAddOn += (2.00 * cappTotal.getDrinkCount());
				}
				
				if(whipCount >= 1) {
					totalCappAddOn += (1.00 * cappTotal.getDrinkCount());
				}
				
				productCoffeeTotal = cupOfJoe.calculateProductTotal(coffeeTotal.getDrinkCount(), cupOfJoe.getPrice());
				
				productEspressoTotal = esp.calculateProductTotal(espressoTotal.getDrinkCount(), esp.getPrice());
//				System.out.println("Our productEspressoTotal beofre adding add ons is: "+ productEspressoTotal);
//				System.out.println("Adding total esp add ones right now..: " + totalEspAddOn);
				productEspressoTotal += totalEspAddOn;
//				System.out.println("Our productEspressoTotal is: "+ productEspressoTotal);
				 
				productCappTotal = capp.calculateProductTotal(cappTotal.getDrinkCount(), capp.getPrice());
				productCappTotal += totalCappAddOn;
				
				TOTAL_BEFORE_TAX += productEspressoTotal + productCappTotal;
				TOTAL_BEFORE_TAX += productCoffeeTotal;
								
				System.out.printf("Our total before tax is: %.2f\n", TOTAL_BEFORE_TAX);
				double totalSalesTax = TOTAL_BEFORE_TAX * salesTax;
				System.out.printf("Sales Tax: %.2f\n", totalSalesTax);
				GRAND_TOTAL = Double.sum(TOTAL_BEFORE_TAX, totalSalesTax);
				System.out.printf("Purchase Total: %.2f\n", GRAND_TOTAL);
				break;
			}
			
			System.out.println("Anything else? If not, please proceed to 'Checkout'.");
		}
	}

}


