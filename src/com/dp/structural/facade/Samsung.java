package com.dp.structural.facade;

// TODO: Auto-generated Javadoc
/**
 * The Class Samsung.
 */
public class Samsung implements MobileShop {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dp.creational.facadedp.MobileShop#mobileNo()
	 */
	@Override
	public void modelNo() {
		System.out.println(" Samsung galaxy tab 3 ");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.dp.creational.facadedp.MobileShop#price()
	 */
	@Override
	public void price() {
		System.out.println(" Rs 45000.00 ");
	}

}
