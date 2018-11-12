package com.dp.behavioral.templatemethod;

/**
 * The Class StoreOrder.
 */
public class StoreOrder extends OrderProcessTemplate {

	/* (non-Javadoc)
	 * @see com.dp.behavioral.templatemethod.OrderProcessTemplate#doSelect()
	 */
	@Override
	public void doSelect() {
		System.out.println("Customer chooses the item from shelf.");
	}

	/* (non-Javadoc)
	 * @see com.dp.behavioral.templatemethod.OrderProcessTemplate#doPayment()
	 */
	@Override
	public void doPayment() {
		System.out.println("Pays at counter through cash/POS");
	}

	/* (non-Javadoc)
	 * @see com.dp.behavioral.templatemethod.OrderProcessTemplate#doDelivery()
	 */
	@Override
	public void doDelivery() {
		System.out.println("Item deliverd to in delivery counter.");
	}

}