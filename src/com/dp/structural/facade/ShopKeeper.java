package com.dp.structural.facade;

// TODO: Auto-generated Javadoc
/**
 * The Class ShopKeeper.
 */
public class ShopKeeper {

	/** The iphone. */
	private MobileShop iphone;

	/** The samsung. */
	private MobileShop samsung;

	/** The blackberry. */
	private MobileShop blackberry;

	/**
	 * Instantiates a new shop keeper.
	 */
	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		blackberry = new Blackberry();
	}

	/**
	 * Iphone sale.
	 */
	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	/**
	 * Samsung sale.
	 */
	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	/**
	 * Blackberry sale.
	 */
	public void blackberrySale() {
		blackberry.modelNo();
		blackberry.price();
	}

}
