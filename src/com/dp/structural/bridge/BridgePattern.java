package com.dp.structural.bridge;

// TODO: Auto-generated Javadoc
/**
 * The Class BridgePattern.
 */
public class BridgePattern {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		final Vehicle vehicle1 = new Car(new Produce(), new Assemble());
		vehicle1.manufacture();
		Vehicle vehicle2 = new Bike(new Produce(), new Assemble());
		vehicle2.manufacture();

	}
}