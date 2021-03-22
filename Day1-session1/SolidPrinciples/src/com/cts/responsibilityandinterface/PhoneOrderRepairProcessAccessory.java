package com.cts.responsibilityandinterface;

public class PhoneOrderRepairProcessAccessory implements IOOrderRepairProcessAccessoryRepair {

	@Override
	public void processAccessoryRepair(String accessoryType) {
		// TODO Auto-generated method stub
		System.out.println(String.format("%s repair accepted!", accessoryType));
	}

}
