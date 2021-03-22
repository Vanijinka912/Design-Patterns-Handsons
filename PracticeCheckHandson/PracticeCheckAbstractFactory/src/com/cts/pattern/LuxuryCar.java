package com.cts.pattern;


public class LuxuryCar extends Car {

	public LuxuryCar(Location location)
	{
		super(CarType.LUXURY,location);
		construct();
	}
	
	
	@Override
	public void construct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to luxury car");

	}

}
