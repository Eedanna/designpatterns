package com.dp.creational.builder;

/**
 * The Class Meal.
 */
public class Meal {

	/** The sandwich. */
	private String sandwich;
	
	/** The side order. */
	private String sideOrder;
	
	/** The drink. */
	private String drink;
	
	/** The offer. */
	private String offer;
	
	/** The price. */
	private double price;

	/**
	 * Gets the sandwich.
	 *
	 * @return the sandwich
	 */
	public String getSandwich() {
		return sandwich;
	}

	/**
	 * Sets the sandwich.
	 *
	 * @param sandwich the new sandwich
	 */
	public void setSandwich(final String sandwich) {
		this.sandwich = sandwich;
	}

	/**
	 * Gets the side order.
	 *
	 * @return the side order
	 */
	public String getSideOrder() {
		return sideOrder;
	}

	/**
	 * Sets the side order.
	 *
	 * @param sideOrder the new side order
	 */
	public void setSideOrder(final String sideOrder) {
		this.sideOrder = sideOrder;
	}

	/**
	 * Gets the drink.
	 *
	 * @return the drink
	 */
	public String getDrink() {
		return drink;
	}

	/**
	 * Sets the drink.
	 *
	 * @param drink the new drink
	 */
	public void setDrink(final String drink) {
		this.drink = drink;
	}

	/**
	 * Gets the offer.
	 *
	 * @return the offer
	 */
	public String getOffer() {
		return offer;
	}

	/**
	 * Sets the offer.
	 *
	 * @param offer the new offer
	 */
	public void setOffer(final String offer) {
		this.offer = offer;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(final double price) {
		this.price = price;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sandwich=" + sandwich + "\nSide Order=" + sideOrder + "\nDrink=" + drink + " \nOffer=" + offer
				+ "\nPrice=" + price;
	}

}
