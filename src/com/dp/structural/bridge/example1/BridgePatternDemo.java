package com.dp.structural.bridge.example1;

// TODO: Auto-generated Javadoc
/**
 * The Class BridgePatternDemo.
 */
public class BridgePatternDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		final QuestionFormat questions = new QuestionFormat("Java Programming Language");

		questions.q = new JavaQuestions();

		questions.next();
		
		questions.display();
		
		questions.delete("what is class?");

		questions.newOne("What is inheritance? ");

		questions.newOne("How many types of inheritance are there in java?");

		questions.displayAll();
	}

}
