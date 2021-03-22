package com.cts.pattern;

public class Supervisor implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = null;
	

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		
		if(leaveRequest.leaveDays >=1 && leaveRequest.leaveDays<3) {
			if(leaveRequest.leaveDays ==1) {
			
				System.out.println(String.format("Leave Request for %d day was approved by Supervisor!",leaveRequest.leaveDays));
			}
			else {
				
				System.out.println(String.format("Leave Request for %d days was approved by Supervisor!",leaveRequest.leaveDays));

			}
			
		}
		else {
			
			nextHandler=new ProjectManager();
			nextHandler.handleRequest(leaveRequest);
		
		}
		
		
		
		
		
	}

}
