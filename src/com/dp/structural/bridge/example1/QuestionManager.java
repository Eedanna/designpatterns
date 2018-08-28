package com.dp.structural.bridge.example1;

// TODO: Auto-generated Javadoc
/**
 * The Class QuestionManager.
 */
public class QuestionManager {

	/** The q. */
	protected Question q;

	/** The catalog. */
	public String catalog;

	/**
	 * Instantiates a new question manager.
	 *
	 * @param catalog the catalog
	 */
	public QuestionManager(final String catalog) {
		this.catalog = catalog;
	}

	/**
	 * Next.
	 */
	public void next() {
		q.nextQuestion();
	}

	/**
	 * Previous.
	 */
	public void previous() {
		q.previousQuestion();
	}

	/**
	 * New one.
	 *
	 * @param quest the quest
	 */
	public void newOne(final String quest) {
		q.newQuestion(quest);
	}

	/**
	 * Delete.
	 *
	 * @param quest the quest
	 */
	public void delete(final String quest) {
		q.deleteQuestion(quest);
	}

	/**
	 * Display.
	 */
	public void display() {
		q.displayQuestion();
	}

	/**
	 * Display all.
	 */
	public void displayAll() {
		System.out.println("Question Paper: " + catalog);
		q.displayAllQuestions();
	}

}
