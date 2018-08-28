package com.dp.structural.bridge;

// Concrete implementation 1 for bridge pattern

/**
 * The Class Produce.
 */
public class Produce implements Workshop {

	/* (non-Javadoc)
	 * @see com.dp.structural.bridge.Workshop#work()
	 */
	@Override
	public void work() {
		System.out.print("Produced");
	}

}