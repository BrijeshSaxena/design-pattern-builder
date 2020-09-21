package org.trishinfotech.builder.meal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.trishinfotech.builder.packing.MultiPack;
import org.trishinfotech.builder.packing.Packing;

public class Meal implements FoodItem {

	private List<FoodItem> foodItems = new ArrayList<FoodItem>();
	private String mealName;
	private double discount;

	public Meal(String mealName, List<FoodItem> foodItems, double discount) {
		super();
		if (Objects.isNull(foodItems) || foodItems.stream().filter(Objects::nonNull).collect(Collectors.toList()).isEmpty()) {
			throw new IllegalArgumentException(
					"Meal can't be order without any food item");
		}
		this.mealName = mealName;
		this.foodItems = new ArrayList<FoodItem>(foodItems);
		this.discount = discount;
	}

	public List<FoodItem> getFoodItems() {
		return foodItems;
	}

	@Override
	public String name() {
		return mealName;
	}

	@Override
	public int calories() {
		int totalCalories = foodItems.stream().mapToInt(foodItem -> foodItem.calories()).sum();
		return totalCalories;
	}

	@Override
	public Packing packing() {
		double packingPrice = foodItems.stream().map(foodItem -> foodItem.packing())
				.mapToDouble(packing -> packing.packingPrice()).sum();
		return new MultiPack(packingPrice);
	}

	@Override
	public double price() {
		double totalPrice = foodItems.stream().mapToDouble(foodItem -> foodItem.price()).sum();
		return totalPrice;
	}

	public double discount() {
		return discount;
	}
}
