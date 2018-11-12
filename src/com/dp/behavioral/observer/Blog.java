package com.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Subject {

	List<Observer> observersList;

	private boolean stateChange;

	public Blog() {
		this.observersList = new ArrayList<>();
		stateChange = false;
	}

	public void registerObserver(Observer observer) {
		observersList.add(observer);
	}

	public void unRegisterObserver(Observer observer) {
		observersList.remove(observer);
	}

	public void notifyObserver() {

		if (stateChange) {
			for (Observer observer : observersList) {
				observer.update();
			}
		}
	}

	public Object getUpdate() {
		Object changedState = null;
		if (stateChange) {
			changedState = "Observer Design Pattern";
		}
		return changedState;
	}

	public void postNewArticle() {
		stateChange = true;
		notifyObserver();
	}

}
