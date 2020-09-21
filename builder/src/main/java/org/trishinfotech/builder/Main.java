package org.trishinfotech.builder;

import org.trishinfotech.builder.beverages.BeverageSize;
import org.trishinfotech.builder.beverages.cold.CocaCola;
import org.trishinfotech.builder.beverages.cold.Pepsi;
import org.trishinfotech.builder.beverages.hot.HotChocolate;
import org.trishinfotech.builder.food.burger.ChickenBurger;
import org.trishinfotech.builder.food.nuggets.CheeseNuggets;
import org.trishinfotech.builder.food.nuggets.ChickenNuggets;
import org.trishinfotech.builder.util.BillPrinter;

public class Main {

	public static void main(String[] args) {
		OrderBuilder builder1 = new OrderBuilder();
		// you can see the use of chained calls of setters here. No statement terminator
		// till we set all the values of the object
		Order meal1 = builder1.name("Brijesh").service(OrderService.TAKE_AWAY).item(new ChickenBurger())
				.item(new Pepsi(BeverageSize.M)).vegNuggetsHappyMeal().build();
		BillPrinter.printItemisedBill(meal1);

		OrderBuilder builder2 = new OrderBuilder();
		Order meal2 = builder2.name("Micheal").service(OrderService.EAT_HERE).item(new ChickenNuggets())
				.item(new CheeseNuggets()).item(new CocaCola(BeverageSize.L)).chickenBurgerHappyMeal()
				.item(new HotChocolate(BeverageSize.M)).vegBurgerHappyMeal().build();
		BillPrinter.printItemisedBill(meal2);
	}

}
