package com.dp.creational.builder;

/**
 * The Class BuilderClient.
 */
public class BuilderClient {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		final MealBuilder pizzaBuilder = new SandwichMealBuilder();
		
		
		final MealDirector director = new MealDirector();
		
		director.makeMeal(pizzaBuilder);

		final Meal meal = pizzaBuilder.getMeal();
		
		System.out.println(meal.toString());
	}

}
