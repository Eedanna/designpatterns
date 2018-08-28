package com.dp.structural.adapter;

/**
 * The Class AdapterPatternDemo.
 */
public class AdapterPatternDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		final CreditCard ccard = new BankCustomer();
		ccard.giveBankDetails();
		System.out.println(ccard.getCreditCard());
		
	}
}
