package org.trishinfotech.builder.packing;

public class Wrap implements Packing {

	@Override
	public String pack() {
		return "Wrap";
	}

	@Override
	public double packingPrice() {
		return 0.40d;
	}

}
