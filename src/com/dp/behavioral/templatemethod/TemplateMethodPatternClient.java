package com.dp.behavioral.templatemethod;

/**
 * The Class TemplateMethodPatternClient.
 */
public class TemplateMethodPatternClient {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String... args) {
		
		System.out.println("$$$ NetOrder instance of the Template: $$$");
		final OrderProcessTemplate netOrder = new NetOrder();
		netOrder.processOrder();
		
		System.out.println("$$$ StoreOrder instance of the Template: $$$");
		final OrderProcessTemplate storeOrder = new StoreOrder();
		storeOrder.processOrder();
	}
}
