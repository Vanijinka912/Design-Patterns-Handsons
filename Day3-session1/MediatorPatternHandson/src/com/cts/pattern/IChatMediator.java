package com.cts.pattern;

public interface IChatMediator {
	
	public void addUser(IUser user);
	public void sendMessage(String message);
}