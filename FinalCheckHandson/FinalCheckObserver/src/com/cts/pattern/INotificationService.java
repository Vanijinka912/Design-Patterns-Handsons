package com.cts.pattern;


public interface INotificationService {

	void addSubscriber(Observer observer);
	void removeSubscriber(Observer observer);
	void notifySubscriber();
}
