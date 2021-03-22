package com.cts.pattern;

public interface Subject

{
	public static final Subject state=null;
	public void attach(Observer o);

	public void detach(Observer o);

	public void notify(Message m);
	


}