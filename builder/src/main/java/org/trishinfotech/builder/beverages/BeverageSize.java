package org.trishinfotech.builder.beverages;

public enum BeverageSize {
	XS("Extra Small", 110), S("Small", 150), M("Medium", 210), L("Large", 290);

	private String name;
	private int calories;

	BeverageSize(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}

	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

}
