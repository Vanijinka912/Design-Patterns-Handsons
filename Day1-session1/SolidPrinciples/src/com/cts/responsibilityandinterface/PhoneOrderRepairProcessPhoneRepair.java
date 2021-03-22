package com.cts.responsibilityandinterface;

public class PhoneOrderRepairProcessPhoneRepair implements IOOrderRepairProcessPhoneRepair {

	@Override
	public void processPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(String.format("%s repair accepted!", modelName));

	}

}
