package com.dp.structural.adapter;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		final CreditCard ccard = new BankCustomer();
		ccard.giveBankDetails();
		System.out.println(ccard.getCreditCard());
	}
}
