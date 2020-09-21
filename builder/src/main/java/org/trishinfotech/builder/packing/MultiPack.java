package org.trishinfotech.builder.packing;

public class MultiPack implements Packing {

	private double packingPrice;
	
	public MultiPack(double packingPrice) {
		super();
		this.packingPrice = packingPrice;
	}

	@Override
	public String pack() {
		return "Multi-Pack";
	}

	@Override
	public double packingPrice() {
		return packingPrice;
	}

}
