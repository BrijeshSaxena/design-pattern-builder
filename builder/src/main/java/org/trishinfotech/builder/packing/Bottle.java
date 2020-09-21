package org.trishinfotech.builder.packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

	@Override
	public double packingPrice() {
		return 0.75d;
	}

}
