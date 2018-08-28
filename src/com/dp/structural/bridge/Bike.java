package com.dp.structural.bridge;

// Refine abstraction 2 in bridge pattern

/**
 * The Class Bike.
 */
public class Bike extends Vehicle {

	/**
	 * Instantiates a new bike.
	 *
	 * @param workShop1 the work shop 1
	 * @param workShop2 the work shop 2
	 */
	public Bike(final Workshop workShop1, final Workshop workShop2) {
		super(workShop1, workShop2);
	}

	/* (non-Javadoc)
	 * @see com.dp.structural.bridge.Vehicle#manufacture()
	 */
	@Override
	public void manufacture() {
		System.out.print(" -- Bike  --- ");
		workShop1.work();
		workShop2.work();
	}

}