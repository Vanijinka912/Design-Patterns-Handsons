package com.cts.pattern;

public class HR implements ILeaveRequestHandler {
	
	ILeaveRequestHandler nextHandler = null;
	
	

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		
		
		// TODO Auto-generated method stub
		if(leaveRequest.leaveDays >=5) {
			
			System.out.println(String.format("Leave Request for %d days was approved by HR!",leaveRequest.leaveDays));
		}
		
		
		
	}

}
