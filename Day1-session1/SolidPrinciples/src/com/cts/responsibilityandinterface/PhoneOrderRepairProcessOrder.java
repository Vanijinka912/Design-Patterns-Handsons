package com.cts.responsibilityandinterface;

public class PhoneOrderRepairProcessOrder implements IOOrderRepairProcessOrder {

	@Override
	public void processOrder(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(String.format("%s order accepted!", modelName));

	}

}
