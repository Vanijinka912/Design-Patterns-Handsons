package com.cts.pattern;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		INotificationObserver john=new JohnObserver("John");
		INotificationObserver steve=new SteveObserver("Steve");
		NotificationService notificationService=new NotificationService();
		notificationService.AddSubscriber(john);
		notificationService.AddSubscriber(steve);
		
		notificationService.NotifySubscriber();
		
		notificationService.RemoveSubscriber(steve);
		
		

	}

}
