package com.dp.behavioral.visitor;

/**
 * The Class Computer.
 */
public class Computer implements ComputerPart {

	/** The parts. */
	ComputerPart[] parts;

	/**
	 * Instantiates a new computer.
	 */
	public Computer() {
		parts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
	}

	/* (non-Javadoc)
	 * @see com.dp.behavioral.visitor.ComputerPart#accept(com.dp.behavioral.visitor.ComputerPartVisitor)
	 */
	@Override
	public void accept(final ComputerPartVisitor computerPartVisitor) {
		for (int i = 0; i < parts.length; i++) {
			parts[i].accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}
}