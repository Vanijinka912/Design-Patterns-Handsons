package com.cts.dependencyinversion;

public class ProcessPhoneRepair {
	
	public void RepairSteps(IPhone phone) {
		
		String part1=phone.getPhonePart1();
		System.out.println(String.format("%s repaired!", part1));
		double partCost=phone.getPart1Cost();
		System.out.println(String.format("Repair cost %f", (partCost * 0.5)));

		
	}
	
	
	
	
	
	
	
	
	

}
