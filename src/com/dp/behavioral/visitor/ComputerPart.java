package com.dp.behavioral.visitor;

/**
 * The Interface ComputerPart.
 */
public interface ComputerPart {

	/**
	 * Accept.
	 *
	 * @param computerPartVisitor the computer part visitor
	 */
	void accept(final ComputerPartVisitor computerPartVisitor);

}
