package com.dp.behavioral.visitor;

/**
 * The Class VisitorPatternDemo.
 */
public class VisitorPatternDemo {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(final String[] args) {

		final ComputerPart computer = new Computer();
		
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
