package com.cts.pattern;

public class MessageSubscriberThree implements Observer {

	
	public void update(Message m) {
		// TODO Auto-generated method stub
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent()+ " "+MessagePublisher.state);
	}

	
}
