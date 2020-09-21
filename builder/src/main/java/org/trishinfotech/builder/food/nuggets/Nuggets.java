package org.trishinfotech.builder.food.nuggets;

import org.trishinfotech.builder.meal.FoodItem;
import org.trishinfotech.builder.packing.Container;
import org.trishinfotech.builder.packing.Packing;

public abstract class Nuggets implements FoodItem {

	@Override
	public Packing packing() {
		return new Container();
	}

}
