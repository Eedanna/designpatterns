package com.dp.structural.decorator;

// TODO: Auto-generated Javadoc
/**
 * The Class ChineeseFood.
 */
public class ChineeseFood extends FoodDecorator {

	/**
	 * Instantiates a new chineese food.
	 *
	 * @param newFood the new food
	 */
	public ChineeseFood(final Food newFood) {
		super(newFood);

	}

	/* (non-Javadoc)
	 * @see com.dp.structural.decorator.FoodDecorator#prepareFood()
	 */
	public String prepareFood() {
		return super.prepareFood() + " With Fried Rice and Manchurian  ";

	}

	/* (non-Javadoc)
	 * @see com.dp.structural.decorator.FoodDecorator#foodPrice()
	 */
	public double foodPrice() {
		return super.foodPrice() + 65.0;

	}

}
