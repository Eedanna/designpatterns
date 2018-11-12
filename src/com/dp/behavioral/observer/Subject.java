package com.dp.behavioral.observer;

/**
 * The Interface Subject.
 */
public interface Subject {

	/**
	 * Register observer.
	 *
	 * @param observer the observer
	 */
	public void registerObserver(final Observer observer);

	/**
	 * Notify observer.
	 */
	public void notifyObserver();

	/**
	 * Un register observer.
	 *
	 * @param observer the observer
	 */
	public void unRegisterObserver(final Observer observer);

	/**
	 * Gets the update.
	 *
	 * @return the update
	 */
	public Object getUpdate();

}
