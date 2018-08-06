package com.dp.creational.factory;

import org.apache.log4j.Logger;

/**
 * The Class Plan.
 */
public abstract class Plan {

	private static final Logger logger = Logger.getLogger(Plan.class);

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
	public void calculateBill(final int units) {
		logger.info("Bill Amount is : "+units * rate);
	}

}
