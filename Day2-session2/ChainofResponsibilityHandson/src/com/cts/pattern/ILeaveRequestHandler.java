package com.cts.pattern;

public interface ILeaveRequestHandler {
	
	public static final ILeaveRequestHandler nextHandler = null;
	
	public void handleRequest(LeaveRequest leaveRequest);

}
