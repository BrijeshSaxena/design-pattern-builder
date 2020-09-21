package org.trishinfotech.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.trishinfotech.builder.meal.FoodItem;

public class Order {

	private List<FoodItem> foodItems = new ArrayList<FoodItem>();

	private String customerName;
	private OrderService service;

	public Order(OrderService service, List<FoodItem> foodItems, String customerName) {
		super();
		if (Objects.isNull(service)) {
			throw new IllegalArgumentException(
					"Meal can't be order without selecting service 'Take Away' or 'Eat Here'");
		}
		if (Objects.isNull(foodItems) || foodItems.stream().filter(Objects::nonNull).collect(Collectors.toList()).isEmpty()) {
			throw new IllegalArgumentException(
					"Meal can't be order without any food item");
		}
		this.service = service;
		this.foodItems = new ArrayList<FoodItem>(foodItems);
		this.customerName = customerName;
		if (this.customerName == null) {
			this.customerName = "NO NAME";
		}
	}

	public List<FoodItem> getFoodItems() {
		return foodItems;
	}

	public String getCustomerName() {
		return customerName;
	}

	public OrderService getService() {
		return service;
	}

}
