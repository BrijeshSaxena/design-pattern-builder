package org.trishinfotech.builder.packing;

public class SipperMug implements Packing {

	@Override
	public String pack() {
		return "Sipper Mug";
	}

	@Override
	public double packingPrice() {
		return 1.6d;
	}

}
