package org.trishinfotech.builder.beverages;

import org.trishinfotech.builder.meal.FoodItem;

public abstract class Drink implements FoodItem {
	
	protected BeverageSize size;

	public Drink(BeverageSize size) {
		super();
		this.size = size;
		if (this.size == null) {
			this.size = BeverageSize.M;
		}
	}

	public BeverageSize getSize() {
		return size;
	}
	
	public String drinkDetails() {
		return " (" + size + ")";
	}
}
