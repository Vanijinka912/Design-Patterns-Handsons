package com.cts.dependencyinversion;

public class Redmi7 implements IPhone {

	@Override
	public String getPhonePart1() {
		// TODO Auto-generated method stub
		return "display";
	}

	@Override
	public double getPart1Cost() {
		// TODO Auto-generated method stub
		return 500;
	}

}
