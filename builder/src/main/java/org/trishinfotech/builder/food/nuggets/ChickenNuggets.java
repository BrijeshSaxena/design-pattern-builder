package org.trishinfotech.builder.food.nuggets;

public class ChickenNuggets extends Nuggets {

	@Override
	public String name() {
		return "Chicken Nuggets";
	}

	@Override
	public int calories() {
		return 450;
	}

	@Override
	public double price() {
		return 5.0d;
	}

}
