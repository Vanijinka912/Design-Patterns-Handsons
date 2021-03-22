package com.cts.pattern;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Observer puru=new Admin("Purusham");
		Observer dc=new Admin("Dinesh");
		Observer rahul=new Admin("Rahul");
		
		INotificationService notificationService=new NotificationService();
		notificationService.addSubscriber(puru);
		notificationService.addSubscriber(dc);
		notificationService.addSubscriber(rahul);
		notificationService.notifySubscriber();
		notificationService.removeSubscriber(rahul);
		
		
	}

}
