package com.dp.structural.decorator;

// TODO: Auto-generated Javadoc
/**
 * The Class VegFood.
 */
public class VegFood implements Food {

	/* (non-Javadoc)
	 * @see com.dp.structural.decorator.Food#prepareFood()
	 */
	public String prepareFood() {

		return "Veg Food";

	}

	/* (non-Javadoc)
	 * @see com.dp.structural.decorator.Food#foodPrice()
	 */
	public double foodPrice() {

		return 50.0;

	}

}
