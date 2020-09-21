package org.trishinfotech.builder.food.burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public int calories() {
		return 180;
	}

	@Override
	public double price() {
		return 2.7d;
	}

}
