package com.dp.behavioral.visitor;


/**
 * The Class Mouse.
 */
public class Mouse implements ComputerPart {

	/* (non-Javadoc)
	 * @see com.dp.behavioral.visitor.ComputerPart#accept(com.dp.behavioral.visitor.ComputerPartVisitor)
	 */
	@Override
	public void accept(final ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}
