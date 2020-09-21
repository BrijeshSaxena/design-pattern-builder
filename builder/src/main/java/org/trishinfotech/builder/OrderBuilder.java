package org.trishinfotech.builder;

import java.util.ArrayList;
import java.util.List;

import org.trishinfotech.builder.beverages.BeverageSize;
import org.trishinfotech.builder.beverages.cold.CocaCola;
import org.trishinfotech.builder.beverages.cold.Pepsi;
import org.trishinfotech.builder.food.burger.ChickenBurger;
import org.trishinfotech.builder.food.burger.VegBurger;
import org.trishinfotech.builder.food.nuggets.CheeseNuggets;
import org.trishinfotech.builder.food.nuggets.ChickenNuggets;
import org.trishinfotech.builder.meal.FoodItem;
import org.trishinfotech.builder.meal.Meal;

public class OrderBuilder {

	protected static final double HAPPY_MENU_DISCOUNT = 5.0d;

	private String customerName;

	private OrderService service = OrderService.TAKE_AWAY;

	private List<FoodItem> items = new ArrayList<FoodItem>();

	public OrderBuilder() {
		super();
	}

	// Setters for each of the fields we have in the target object. In this example its Order.
	// We are having return type as Builder itself (i.e. OrderBuilder) to make chained calling of setters possible.
	public OrderBuilder name(String customerName) {
		this.customerName = customerName;
		return this;
	}

	public OrderBuilder service(OrderService service) {
		if (service != null) {
			this.service = service;
		}
		return this;
	}

	public OrderBuilder item(FoodItem item) {
		items.add(item);
		return this;
	}

	// Happy Menus
	public OrderBuilder vegNuggetsHappyMeal() {
		List<FoodItem> foodItems = new ArrayList<FoodItem>();
		foodItems.add(new CheeseNuggets());
		foodItems.add(new Pepsi(BeverageSize.S));
		Meal meal = new Meal("Veg Nuggets Happy Meal", foodItems, HAPPY_MENU_DISCOUNT);
		return item(meal);
	}

	public OrderBuilder chickenNuggetsHappyMeal() {
		List<FoodItem> foodItems = new ArrayList<FoodItem>();
		foodItems.add(new ChickenNuggets());
		foodItems.add(new CocaCola(BeverageSize.S));
		Meal meal = new Meal("Chicken Nuggets Happy Meal", foodItems, HAPPY_MENU_DISCOUNT);
		return item(meal);
	}

	public OrderBuilder vegBurgerHappyMeal() {
		List<FoodItem> foodItems = new ArrayList<FoodItem>();
		foodItems.add(new VegBurger());
		foodItems.add(new Pepsi(BeverageSize.S));
		Meal meal = new Meal("Veg Burger Happy Meal", foodItems, HAPPY_MENU_DISCOUNT);
		return item(meal);
	}

	public OrderBuilder chickenBurgerHappyMeal() {
		List<FoodItem> foodItems = new ArrayList<FoodItem>();
		foodItems.add(new ChickenBurger());
		foodItems.add(new CocaCola(BeverageSize.S));
		Meal meal = new Meal("Chicken Burger Happy Meal", foodItems, HAPPY_MENU_DISCOUNT);
		return item(meal);
	}

	public Order build() {
		Order order = new Order(service, items, customerName);
		if (!validateOrder()) {
			System.out.println("Sorry! Order can't be placed without service type (Take Away/Eat Here) and any food item.");
			return null;
		}
		return order;
	}

	private boolean validateOrder() {
		return (service != null) && !items.isEmpty();
	}
}
