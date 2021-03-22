package com.cts.pattern;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

	private List<Observer> observers = new ArrayList<>();
	public static String state;

	
	
	public static String getState() {
		return state;
	}

	public static void setState(String state) {
		MessagePublisher.state = state;
	}

	
	
	public void notify(Message m) {
		// TODO Auto-generated method stub
		for(Observer o: observers) 
		{ 
			o.update(m); 
		}

		
	}

	@Override
	public void attach(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);

	}

	@Override
	public void detach(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);

	}

	

	
}
