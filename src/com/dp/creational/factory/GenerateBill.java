package com.dp.creational.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

/**
 * The Class GenerateBill.
 */
public class GenerateBill {

	private static final Logger logger = Logger.getLogger(GenerateBill.class);

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {

		final GetPlanFactory gpf = new GetPlanFactory();
		logger.info("\n Enter the plan for which bill should geneate : ");
		try (final BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			final String planName = br.readLine();
			logger.info("\n Enter number of units for bill will be calculated : ");
			final int units = Integer.parseInt(br.readLine());
			final Plan plan = gpf.getPlan(planName);

			logger.info("\n Plan Name is :: " + planName + " and also Units are :  " + units);
			logger.info("\n Bill amount for " + planName + " of  " + units + " units is: ");
			plan.getRate();
			plan.calculateBill(units);

		} catch (NumberFormatException | IOException e) {
			logger.info("Exception occured due to :" + e.getMessage());
		}
	}

}
