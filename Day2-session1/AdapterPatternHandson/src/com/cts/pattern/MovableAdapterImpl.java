package com.cts.pattern;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars; 
	// standard constructors 
	
	
	public MovableAdapterImpl(Movable bugattiVeyron) {
		// TODO Auto-generated constructor stub
		luxuryCars=bugattiVeyron;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) { 
		return mph * 1.60934;
	}

	@Override
	public double getUsd() {
		// TODO Auto-generated method stub
		return convertUSDtoEURO(luxuryCars.getUsd());
	}
	
	private double convertUSDtoEURO(double usd) { 
		return usd * 0.84099;
	}

	
	
	
}


