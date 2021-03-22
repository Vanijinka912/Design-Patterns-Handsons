package com.cts.responsibilityandinterface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		
		String processOption=sc.nextLine();

		PhoneOrderRepairProcessAccessory poAccessoryRepair=new PhoneOrderRepairProcessAccessory();
		PhoneOrderRepairProcessPhoneRepair poPhoneRepair=new PhoneOrderRepairProcessPhoneRepair();
		PhoneOrderRepairProcessOrder poProcessOrder=new PhoneOrderRepairProcessOrder();
		
		String productDetail="";
		
		switch(processOption) {
		
		case "order" : System.out.println("Please provide the phone model name");
						productDetail=sc.nextLine();
						poProcessOrder.processOrder(productDetail);
						break;
		case "repair" : System.out.println("Is it the phone or the accessory that you want to be repaired?");
						String productType=sc.nextLine();
						if(productType.equalsIgnoreCase("phone")) {
							System.out.println("Please provide the phone model name");
							productDetail=sc.nextLine();
							poPhoneRepair.processPhoneRepair(productDetail);
							
						}
						else if(productType.equalsIgnoreCase("accessory")) {
							System.out.println("Please provide the accessory detail, like headphone, tempered glass");
							productDetail=sc.nextLine();
							poAccessoryRepair.processAccessoryRepair(productDetail);
						}
						break;
		default: break;
		
		
		}
		
		
	}

}
