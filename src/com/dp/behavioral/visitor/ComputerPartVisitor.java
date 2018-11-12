package com.dp.behavioral.visitor;

/**
 * The Interface ComputerPartVisitor.
 */
public interface ComputerPartVisitor {
	
	/**
	 * Visit.
	 *
	 * @param computer the computer
	 */
	public void visit(final Computer computer);

	/**
	 * Visit.
	 *
	 * @param mouse the mouse
	 */
	public void visit(final Mouse mouse);

	/**
	 * Visit.
	 *
	 * @param keyboard the keyboard
	 */
	public void visit(final Keyboard keyboard);

	/**
	 * Visit.
	 *
	 * @param monitor the monitor
	 */
	public void visit(final Monitor monitor);
}