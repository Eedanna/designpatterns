package com.dp.structural.decorator;

// This class has the ability to decorate some more foods.

/**
 * The Class FoodDecorator.
 */
public abstract class FoodDecorator implements Food

{
	
	/** The new food. */
	private Food newFood;

	/**
	 * Instantiates a new food decorator.
	 *
	 * @param newFood the new food
	 */
	public FoodDecorator(Food newFood) {

		this.newFood = newFood;

	}

	/* (non-Javadoc)
	 * @see com.dp.structural.decorator.Food#prepareFood()
	 */
	@Override
	public String prepareFood() {
		return newFood.prepareFood();

	}

	/* (non-Javadoc)
	 * @see com.dp.structural.decorator.Food#foodPrice()
	 */
	public double foodPrice() {
		return newFood.foodPrice();

	}

}
