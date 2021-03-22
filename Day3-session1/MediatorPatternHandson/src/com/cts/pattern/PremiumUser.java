package com.cts.pattern;

public class PremiumUser implements IUser {

	private ChatMediator chatMediator;
	private String name;
	
	
	public ChatMediator getChatMediator() {
		return chatMediator;
	}

	public void setChatMediator(ChatMediator chatMediator) {
		this.chatMediator = chatMediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PremiumUser(ChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}
	
	@Override
	public void receiveMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(name+" received message: "+message);

	}

	@Override
	public void sendMessage(String message) {
		// TODO Auto-generated method stub
		System.out.println(name+ " sending msg: "+message);
		chatMediator.sendMessage(message);

	}

}
