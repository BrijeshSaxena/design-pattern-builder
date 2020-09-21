package org.trishinfotech.builder.beverages.cold;

import org.trishinfotech.builder.beverages.BeverageSize;

public class CocaCola extends ColdDrink {

	public CocaCola(BeverageSize size) {
		super(size);
	}

	@Override
	public String name() {
		return "Coca-Cola" + drinkDetails();
	}

	@Override
	public int calories() {
		if (size != null) {
			switch (size) {
			case XS:
				return 110;
			case S:
				return 150;
			case M:
				return 210;
			case L:
				return 290;
			default:
				break;
			}
		}
		return 0;
	}

	@Override
	public double price() {
		if (size != null) {
			switch (size) {
			case XS:
				return 0.80d;
			case S:
				return 1.0d;
			case M:
				return 1.5d;
			case L:
				return 2.0d;
			default:
				break;
			}
		}
		return 0.0d;
	}

}
