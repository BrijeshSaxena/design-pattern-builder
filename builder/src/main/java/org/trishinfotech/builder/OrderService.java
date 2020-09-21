package org.trishinfotech.builder;

public enum OrderService {

	TAKE_AWAY("Take Away", 2.0d), EAT_HERE("Eat Here", 5.5d);

	private String name;
	private double tax;

	OrderService(String name, double tax) {
		this.name = name;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public double getTax() {
		return tax;
	}

}
