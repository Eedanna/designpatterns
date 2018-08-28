package com.dp.structural.bridge;

// Refine abstraction 1 in bridge pattern

/**
 * The Class Car.
 */
public class Car extends Vehicle {

	/**
	 * Instantiates a new car.
	 *
	 * @param workShop1 the work shop 1
	 * @param workShop2 the work shop 2
	 */
	public Car(final Workshop workShop1,final  Workshop workShop2) {
		super(workShop1, workShop2);
	}

	/* (non-Javadoc)
	 * @see com.dp.structural.bridge.Vehicle#manufacture()
	 */
	@Override
	public void manufacture() {
		System.out.print(" -- Car --  ");
		workShop1.work();
		workShop2.work();

	}

}
