package org.trishinfotech.builder.beverages.hot;

import org.trishinfotech.builder.beverages.BeverageSize;
import org.trishinfotech.builder.beverages.Drink;
import org.trishinfotech.builder.packing.Packing;
import org.trishinfotech.builder.packing.SipperMug;

public abstract class HotDrink extends Drink {

	public HotDrink(BeverageSize size) {
		super(size);
	}

	@Override public Packing packing() {
		return new SipperMug();
	}
}
