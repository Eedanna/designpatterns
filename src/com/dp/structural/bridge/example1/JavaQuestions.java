package com.dp.structural.bridge.example1;

import java.util.ArrayList;
import java.util.List;


// TODO: Auto-generated Javadoc
/**
 * The Class JavaQuestions.
 */
public class JavaQuestions implements Question {
	
	
	/** The questions. */
	private List <String> questions = new ArrayList<String>();

	/** The current. */
	private int current = 0;

	/**
	 * Instantiates a new java questions.
	 */
	public JavaQuestions() {
	questions.add("What is class? ");
	questions.add("What is interface? ");
	questions.add("What is abstraction? ");
	questions.add("How multiple polymorphism is achieved in java? ");
	questions.add("How many types of exception  handling are there in java? ");
	questions.add("Define the keyword final for  variable, method, and class in java? ");
	questions.add("What is abstract class? ");
	questions.add("What is multi-threading? ");

	}

	/* (non-Javadoc)
	 * @see com.dp.structural.bridge.Question#nextQuestion()
	 */
	public void nextQuestion() {
	if( current <= questions.size()-1 )
	current++;
	}

	/* (non-Javadoc)
	 * @see com.dp.structural.bridge.Question#previousQuestion()
	 */
	public void previousQuestion() {
	if( current > 0 )
	current--;
	
	}

	/* (non-Javadoc)
	 * @see com.dp.structural.bridge.Question#newQuestion(java.lang.String)
	 */
	public void newQuestion(String quest) {
	questions.add(quest);
	}

	/* (non-Javadoc)
	 * @see com.dp.structural.bridge.Question#deleteQuestion(java.lang.String)
	 */
	public void deleteQuestion(String quest) {
	questions.remove(quest);
	}

	/* (non-Javadoc)
	 * @see com.dp.structural.bridge.Question#displayQuestion()
	 */
	public void displayQuestion() {
	System.out.println( questions.get(current) );
	}

	/* (non-Javadoc)
	 * @see com.dp.structural.bridge.Question#displayAllQuestions()
	 */
	public void displayAllQuestions() {
		for (String quest : questions) {
			System.out.println(quest);
		}
	}

}
