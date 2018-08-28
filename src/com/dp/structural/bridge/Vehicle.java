package com.dp.structural.bridge;

// abstraction in bridge pattern

/**
 * The Class Vehicle.
 */
abstract class Vehicle {
	
	/** The work shop 1. */
	protected Workshop workShop1;
	
	/** The work shop 2. */
	protected Workshop workShop2;

	/**
	 * Instantiates a new vehicle.
	 *
	 * @param workShop1 the work shop 1
	 * @param workShop2 the work shop 2
	 */
	protected Vehicle(final Workshop workShop1, final Workshop workShop2) {
		this.workShop1 = workShop1;
		this.workShop2 = workShop2;
	}

	/**
	 * Manufacture.
	 */
	abstract public void manufacture();
}
