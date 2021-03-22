package com.cts.dependencyinversion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessPhoneRepair repair=new ProcessPhoneRepair();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to our site. Would you please enter phone type either samsung or redmi");
		String phoneType=sc.nextLine();
		switch(phoneType) {
		
		case "samsung" : SamsungNote samsungNote=new SamsungNote();
						 repair.RepairSteps(samsungNote);
						 break;
		case "redmi" : Redmi7 redmi7=new Redmi7();
		 			   repair.RepairSteps(redmi7);
		 			   break;
		 default : break;
		
		
		
		}
	}

}
