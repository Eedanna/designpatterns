package com.dp.creational.builder;

// TODO: Auto-generated Javadoc
/**
 * The Interface MealBuilder.
 */
public interface MealBuilder {

	/**
	 * Adds the sandwich.
	 *
	 * @param sandwich the sandwich
	 */
	void addSandwich(final String sandwich);

	/**
	 * Adds the sides.
	 *
	 * @param sides the sides
	 */
	void addSides(final String sides);

	/**
	 * Adds the drink.
	 *
	 * @param drink the drink
	 */
	void addDrink(final String drink);

	
	/**
	 * Adds the offer.
	 *
	 * @param coupon the coupon
	 */
	void addOffer(final String coupon);

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	void setPrice(final double price);

	/**
	 * Gets the meal.
	 *
	 * @return the meal
	 */
	Meal getMeal();

}
