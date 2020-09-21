package org.trishinfotech.builder.beverages.cold;

import org.trishinfotech.builder.beverages.BeverageSize;
import org.trishinfotech.builder.beverages.Drink;
import org.trishinfotech.builder.packing.Bottle;
import org.trishinfotech.builder.packing.Packing;

public abstract class ColdDrink extends Drink {

	public ColdDrink(BeverageSize size) {
		super(size);
	}

	@Override public Packing packing() {
		return new Bottle();
	}
}
