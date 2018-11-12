package com.dp.behavioral.visitor;

/**
 * The Class ComputerPartDisplayVisitor.
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	/* (non-Javadoc)
	 * @see com.dp.behavioral.visitor.ComputerPartVisitor#visit(com.dp.behavioral.visitor.Computer)
	 */
	@Override
	public void visit(final Computer computer) {
		System.out.println("Displaying Computer.");
	}

	/* (non-Javadoc)
	 * @see com.dp.behavioral.visitor.ComputerPartVisitor#visit(com.dp.behavioral.visitor.Mouse)
	 */
	@Override
	public void visit(final Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	/* (non-Javadoc)
	 * @see com.dp.behavioral.visitor.ComputerPartVisitor#visit(com.dp.behavioral.visitor.Keyboard)
	 */
	@Override
	public void visit(final Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	/* (non-Javadoc)
	 * @see com.dp.behavioral.visitor.ComputerPartVisitor#visit(com.dp.behavioral.visitor.Monitor)
	 */
	@Override
	public void visit(final Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}
}
