package com.dp.behavioral.templatemethod;


/**
 * The Class OrderProcessTemplate.
 */
public abstract class OrderProcessTemplate {
	
	/** The is gift. */
	public boolean isGift;

	/**
	 * Do select.
	 */
	public abstract void doSelect();

	/**
	 * Do payment.
	 */
	public abstract void doPayment();

	/**
	 * Gift wrap.
	 */
	public final void giftWrap() {
		System.out.println("Gift wrap done.");
	}

	/**
	 * Do delivery.
	 */
	public abstract void doDelivery();

	/**
	 * Process order.
	 */
	public final void processOrder() {
		doSelect();
		doPayment();
		if (isGift) {
			giftWrap();
		}
		doDelivery();
	}
}