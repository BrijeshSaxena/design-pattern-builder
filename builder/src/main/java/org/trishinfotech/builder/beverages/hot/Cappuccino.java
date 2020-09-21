package org.trishinfotech.builder.beverages.hot;

import org.trishinfotech.builder.beverages.BeverageSize;

public class Cappuccino extends HotDrink {

	public Cappuccino(BeverageSize size) {
		super(size);
	}
	
	@Override public String name() {
		return "Cappuccino" + drinkDetails();
	}

	@Override public int calories() {
		if (size != null) {
			switch (size) {
				case S:
					return 120;
				case M:
					return 160;
				case L:
					return 210;
				default:
				break;
			}
		}
		return 0;
	}
	
	@Override public double price() {
		if (size != null) {
			switch (size) {
				case S:
					return 1.0d;
				case M:
					return 1.4d;
				case L:
					return 1.8d;
				default:
				break;
			}
		}
		return 0.0d;
	}

}
