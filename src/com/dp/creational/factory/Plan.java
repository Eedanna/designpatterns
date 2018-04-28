package com.dp.creational.factory;

// TODO: Auto-generated Javadoc
/**
 * The Class Plan.
 */
public abstract class Plan {

	/** The rate. */
	protected double rate;

	/**
	 * Gets the rate.
	 *
	 * @return the rate
	 */
	abstract void getRate();

	/**
	 * Calculate bill.
	 *
	 * @param units
	 *            the units
	 */
	public void calculateBill(int units) {
		System.out.println(units * rate);
	}

}
