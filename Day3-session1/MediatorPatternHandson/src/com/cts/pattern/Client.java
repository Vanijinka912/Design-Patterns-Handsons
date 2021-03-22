package com.cts.pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChatMediator chatmediator=new ChatMediator();
		IUser user1=new BasicUser(chatmediator,"James");
		IUser user2=new PremiumUser(chatmediator,"Andy");
		IUser user3=new BasicUser(chatmediator,"Dorris");
		chatmediator.addUser(user1);
		chatmediator.addUser(user2);
		
		user3.sendMessage("Hi! How are you?");
		
		
		
		
	}

}