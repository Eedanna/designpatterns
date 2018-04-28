package com.dp.structural.adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// TODO: Auto-generated Javadoc
/**
 * The Class BankCustomer.
 */
public class BankCustomer extends BankDetails implements CreditCard {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dp.creational.adapterdp.CreditCard#getCreditCard()
	 */
	@Override
	public String getCreditCard() {
		long accno = getAccNumber();
		String accholdername = getAcctHolderName();
		String bname = getBankName();
		return ("The Account number " + accno + " of " + accholdername + " in " + bname
				+ " bank is valid and authenticated for issuing the credit card.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dp.creational.adapterdp.CreditCard#giveBankDetails()
	 */
	@Override
	public void giveBankDetails() {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			System.out.print("Enter the account holder name :");
			final String customerName = br.readLine();
			System.out.print("\n");

			System.out.print("Enter the account number:");
			final long acctNumber = Long.parseLong(br.readLine());
			System.out.print("\n");

			System.out.print("Enter the bank name :");
			final String bankName = br.readLine();

			setAcctHolderName(customerName);
			setAccNumber(acctNumber);
			setBankName(bankName);

		} catch (final Exception ex) {
			System.out.println("Exception occured due to : " + ex.getMessage());
		}

	}

}
