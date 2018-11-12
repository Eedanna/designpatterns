package com.dp.behavioral.templatemethod;

/**
 * The Class NetOrder.
 */
public class NetOrder extends OrderProcessTemplate {

	/* (non-Javadoc)
	 * @see com.dp.behavioral.templatemethod.OrderProcessTemplate#doSelect()
	 */
	@Override
	public void doSelect() {
		System.out.println("Item added to online shopping cart,");
		System.out.println("Get gift wrap preference,");
		System.out.println("Get delivery address.");
	}

	/* (non-Javadoc)
	 * @see com.dp.behavioral.templatemethod.OrderProcessTemplate#doPayment()
	 */
	@Override
	public void doPayment() {
		System.out.println("Online Payment through Netbanking/Cards.");
	}

	/* (non-Javadoc)
	 * @see com.dp.behavioral.templatemethod.OrderProcessTemplate#doDelivery()
	 */
	@Override
	public void doDelivery() {
		System.out.println("Ship the item through post to delivery address");
	}

}