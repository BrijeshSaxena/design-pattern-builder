package org.trishinfotech.builder.beverages.cold;

import org.trishinfotech.builder.beverages.BeverageSize;

public class Pepsi extends ColdDrink {

	public Pepsi(BeverageSize size) {
		super(size);
	}
	
	@Override public String name() {
		return "Pepsi" + drinkDetails();
	}

	@Override public int calories() {
		if (size != null) {
			switch (size) {
				case S:
					return 160;
				case M:
					return 220;
				case L:
					return 300;
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
					return 1.2d;
				case M:
					return 2.2d;
				case L:
					return 2.7d;
				default:
					break;
			}
		}
		return 0.0d;
	}

}
