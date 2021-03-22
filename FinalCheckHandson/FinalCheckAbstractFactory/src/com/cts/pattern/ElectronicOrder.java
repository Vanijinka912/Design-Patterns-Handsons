package com.cts.pattern;

public class ElectronicOrder extends Order {

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		System.out.println("Electronic Order has been processed via "+getChannel());

	}

}
