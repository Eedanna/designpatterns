package com.dp.structural.adaptor;

/**
 * The Class AdapterPatternDemo.
 */
public class AdaptorPatternDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		final CreditCard ccard = new BankCustomerAdaptor();
		ccard.giveBankDetails();
		System.out.println(ccard.getCreditCard());
		
	}
}
