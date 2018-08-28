package com.dp.structural.bridge;


// Concrete implementation 2 for bridge pattern

/**
 * The Class Assemble.
 */
public class Assemble implements Workshop {

	/* (non-Javadoc)
	 * @see com.dp.structural.bridge.Workshop#work()
	 */
	@Override
	public void work() {
		System.out.println(" Assembled.");
	}

}
