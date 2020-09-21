package org.trishinfotech.builder.food.nuggets;

public class CheeseNuggets extends Nuggets {

	@Override
	public String name() {
		return "Cheese Nuggets";
	}

	@Override
	public int calories() {
		return 330;
	}

	@Override
	public double price() {
		return 3.8d;
	}

}
