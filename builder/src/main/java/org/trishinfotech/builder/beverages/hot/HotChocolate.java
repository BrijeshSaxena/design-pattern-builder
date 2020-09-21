package org.trishinfotech.builder.beverages.hot;

import org.trishinfotech.builder.beverages.BeverageSize;

public class HotChocolate extends HotDrink {

	public HotChocolate(BeverageSize size) {
		super(size);
	}
	
	@Override public String name() {
		return "Hot Chocolate" + drinkDetails();
	}

	@Override public int calories() {
		if (size != null) {
			switch (size) {
				case S:
					return 370;
				case M:
					return 450;
				case L:
					return 560;
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
					return 1.6d;
				case M:
					return 2.3d;
				case L:
					return 3.0d;
				default:
					break;
			}
		}
		return 0.0d;
	}

}
