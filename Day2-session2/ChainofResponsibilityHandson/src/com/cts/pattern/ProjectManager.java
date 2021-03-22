package com.cts.pattern;

public class ProjectManager implements ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = null;
	

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		
		if(leaveRequest.leaveDays >=3 && leaveRequest.leaveDays<5) {
			
			System.out.println(String.format("Leave Request for %d days was approved by ProjectManager!",leaveRequest.leaveDays));

			
		}
		else {
			
			nextHandler=new HR();
			nextHandler.handleRequest(leaveRequest);
	
		
		
		}
		
		
		
		
		
		
	}

}
