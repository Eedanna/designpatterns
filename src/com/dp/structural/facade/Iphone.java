package com.dp.structural.facade;

// TODO: Auto-generated Javadoc
/**
 * The Class Iphone.
 */
public class Iphone implements MobileShop {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dp.creational.facadedp.MobileShop#mobileNo()
	 */
	@Override
	public void modelNo() {
		System.out.println(" Iphone 6 ");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dp.creational.facadedp.MobileShop#price()
	 */
	@Override
	public void price() {
		System.out.println(" Rs 65000.00 ");
	}

}
