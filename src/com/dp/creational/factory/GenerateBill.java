package com.dp.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class GenerateBill.
 */
public class GenerateBill {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		final GetPlanFactory gpf = new GetPlanFactory();
		System.out.println("Enter the plan for which bill should geneate : ");
		try (final BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			final String planName = br.readLine();
			System.out.println("Enter number of units for bill will be calculated : ");
			final int units = Integer.parseInt(br.readLine());
			final Plan plan = gpf.getPlan(planName);

			System.out.println("Plan Name is :: " + planName + " and also Units are :  " + units);
			System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
			plan.getRate();
			plan.calculateBill(units);

		} catch (NumberFormatException | IOException e) {
			System.out.println("Exception occured due to :" + e.getMessage());
		}
	}

}
