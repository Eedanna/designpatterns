package com.dp.creational.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class CustomerService.
 */
public class CustomerService {

	/** The instance. */
	private static CustomerService instance;

	/** The customer details. */
	private List<Customer> customerDetails = new ArrayList<>();

	/**
	 * Instantiates a new customer service.
	 */
	private CustomerService() {
	}

	/**
	 * Gets the single instance of CustomerService.
	 *
	 * @return single instance of CustomerService
	 */
	public static synchronized CustomerService getInstance() {
		if (instance == null) {
			System.out.println(" ----------------- Customer instance created  -----------------  ");
			instance = new CustomerService();
		}
		return instance;
	}

	/**
	 * Adds the customer.
	 *
	 * @param name
	 *            the name
	 * @param emailId
	 *            the email id
	 * @param address
	 *            the address
	 */
	public void addCustomer(final String name, final String emailId, final String address) {
		Customer customer = new Customer();
		customer.setName(name);
		customer.setEmailId(emailId);
		customer.setAddress(address);
		customerDetails.add(customer);
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public Integer getSize() {
		return customerDetails.size();
	}

}
