package org.trishinfotech.builder.food.burger;

import org.trishinfotech.builder.meal.FoodItem;
import org.trishinfotech.builder.packing.Packing;
import org.trishinfotech.builder.packing.Wrap;

public abstract class Burger implements FoodItem {

	@Override
	public Packing packing() {
		return new Wrap();
	}

}
