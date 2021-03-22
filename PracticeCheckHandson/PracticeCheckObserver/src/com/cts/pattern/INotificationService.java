package com.cts.pattern;


public interface INotificationService {

	void AddSubscriber(INotificationObserver iNotificationObserver);
	void RemoveSubscriber(INotificationObserver iNotificationObserver);
	void NotifySubscriber();

}
