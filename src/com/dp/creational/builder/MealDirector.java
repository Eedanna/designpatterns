package com.dp.creational.builder;

/**
 * The Class MealDirector.
 */
public class MealDirector {

	/**
	 * Make meal.
	 *
	 * @param mealBuilder the meal builder
	 */
	public void makeMeal(final MealBuilder mealBuilder) {

		mealBuilder.addSandwich("Hamburger");
		mealBuilder.addSides("Fries");
		mealBuilder.addDrink("Coke");
		mealBuilder.addOffer("Weekend Bonanza");
		mealBuilder.setPrice(100.10);
	}

}
