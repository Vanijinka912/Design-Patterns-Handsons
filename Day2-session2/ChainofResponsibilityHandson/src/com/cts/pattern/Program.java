package com.cts.pattern;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ILeaveRequestHandler supervisorHandler = new Supervisor();

        LeaveRequest leaveRequest = new LeaveRequest();
       
        System.out.println("Enter number of leave days:");
        Scanner sc=new Scanner(System.in);
        int leavedays=sc.nextInt();
        
        leaveRequest.setLeaveDays(leavedays);
        supervisorHandler.handleRequest(leaveRequest);


	}

}
