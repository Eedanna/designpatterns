package com.dp.structural.decorator;


/**
 * The Class NonVegFood.
 */
public class NonVegFood extends FoodDecorator {

	/**
	 * Instantiates a new non veg food.
	 *
	 * @param newFood the new food
	 */
	public NonVegFood(Food newFood) {
		super(newFood);

	}

	/* (non-Javadoc)
	 * @see com.dp.structural.decorator.FoodDecorator#prepareFood()
	 */
	public String prepareFood() {
		return super.prepareFood() + " With Roasted Chiken and Chiken Curry  ";

	}

	/* (non-Javadoc)
	 * @see com.dp.structural.decorator.FoodDecorator#foodPrice()
	 */
	public double foodPrice() {
		return super.foodPrice() + 150.0;

	}

}
