package com.dp.structural.bridge.example1;

/**
 * The Interface Question.
 */
public interface Question {
	
	
	/**
	 * Next question.
	 */
	public void nextQuestion();
	
	/**
	 * Previous question.
	 */
	public void previousQuestion();
	
	/**
	 * New question.
	 *
	 * @param q the q
	 */
	public void newQuestion(String q);
	
	/**
	 * Delete question.
	 *
	 * @param q the q
	 */
	public void deleteQuestion(String q);
	
	/**
	 * Display question.
	 */
	public void displayQuestion();
	
	/**
	 * Display all questions.
	 */
	public void displayAllQuestions();
	

}
