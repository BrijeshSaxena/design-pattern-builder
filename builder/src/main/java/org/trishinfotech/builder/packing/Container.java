package org.trishinfotech.builder.packing;

public class Container implements Packing {

	@Override
	public String pack() {
		return "Container";
	}

	@Override
	public double packingPrice() {
		return 1.25d;
	}

}
