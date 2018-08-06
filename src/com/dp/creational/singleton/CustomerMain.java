package com.dp.creational.singleton;

import org.apache.log4j.Logger;

/**
 * The Class CustomerMain.
 */
public class CustomerMain {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(CustomerMain.class);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		final CustomerService customerService = CustomerService.getInstance();

		customerService.addCustomer("Customer1", "test1@gmail.com", "KA");

		customerService.addCustomer("Customer2", "test2@gmail.com", "AP");

		logger.info("CustomerService Size : " + customerService.getSize());
		
		final CustomerService customerServiceTemp = CustomerService.getInstance();

		customerServiceTemp.addCustomer("Customer3", "test1@gmail.com", "KA");

		customerServiceTemp.addCustomer("Customer4", "test2@gmail.com", "AP");

		logger.info("CustomerServiceTemp Size : " + customerServiceTemp.getSize());

	}

}
