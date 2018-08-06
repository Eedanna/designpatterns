package com.dp.creational.builder;


// TODO: Auto-generated Javadoc
/**
 * The Class SandwichMealBuilder.
 *
 * @author a212684493
 */
public class SandwichMealBuilder implements MealBuilder {
	
	/** The meal. */
	private Meal meal = new Meal();

	/* (non-Javadoc)
	 * @see com.dp.creational.builder.MealBuilder#addSandwich(java.lang.String)
	 */
	@Override
	public void addSandwich(final String sandwich) {
		meal.setSandwich(sandwich);
	}

	/* (non-Javadoc)
	 * @see com.dp.creational.builder.MealBuilder#addSides(java.lang.String)
	 */
	@Override
	public void addSides(final String sides) {
		meal.setSideOrder(sides);
	}

	/* (non-Javadoc)
	 * @see com.dp.creational.builder.MealBuilder#addDrink(java.lang.String)
	 */
	@Override
	public void addDrink(final String drink) {
		meal.setDrink(drink);
	}

	/* (non-Javadoc)
	 * @see com.dp.creational.builder.MealBuilder#addOffer(java.lang.String)
	 */
	@Override
	public void addOffer(final String coupon) {
		meal.setOffer(coupon);
	}

	/* (non-Javadoc)
	 * @see com.dp.creational.builder.MealBuilder#setPrice(double)
	 */
	@Override
	public void setPrice(final double price) {
		meal.setPrice(price);
	}

	/* (non-Javadoc)
	 * @see com.dp.creational.builder.MealBuilder#getMeal()
	 */
	@Override
	public Meal getMeal() {
		return meal;
	}
}
