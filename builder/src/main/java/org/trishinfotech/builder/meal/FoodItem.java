package org.trishinfotech.builder.meal;

import org.trishinfotech.builder.packing.Packing;

public interface FoodItem {

	public String name();

	public int calories();

	public Packing packing();

	public double price();
}
