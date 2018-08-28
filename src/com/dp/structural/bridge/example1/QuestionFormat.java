package com.dp.structural.bridge.example1;

// TODO: Auto-generated Javadoc
/**
 * The Class QuestionFormat.
 */
public class QuestionFormat extends QuestionManager {

	/**
	 * Instantiates a new question format.
	 *
	 * @param catalog the catalog
	 */
	public QuestionFormat(final String catalog){
		super(catalog);
		}

		/* (non-Javadoc)
		 * @see com.dp.structural.bridge.QuestionManager#displayAll()
		 */
		public void displayAll() {

		System.out.println("\n--------------------------------------------------------------------");
		super.displayAll();
		System.out.println("-----------------------------------------------------------------------");
		}


	
}
