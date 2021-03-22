package com.cts.pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MessagePublisher mp=new MessagePublisher();
		
		MessageSubscriberOne s1 = new MessageSubscriberOne();

		MessageSubscriberTwo s2 = new MessageSubscriberTwo();

		MessageSubscriberThree s3 = new MessageSubscriberThree();
		
		
		mp.setState("First State");
		mp.attach(s1);
		mp.attach(s2);
		mp.notify(new Message("First Message")); 
		
		mp.setState("Second State");
		mp.detach(s1);
		mp.notify(new Message("Second Message")); 
		
		mp.setState("Third State");
		mp.attach(s3);
		mp.notify(new Message("Third Message")); 

		
		

	}

}
