package com.cts.pattern;


enum CarType{
	MICRO, MINI, LUXURY
}
enum Location{
	DEFAULT, USA, INDIA
}
public abstract class Car {

	CarType model=null;
	Location location=null;
	
	
	
	public Car(CarType model, Location location) {
		super();
		this.model = model;
		this.location = location;
	}
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public abstract void construct();
	
	@Override
	public String toString() {
		
		return "CarModel-"+model+" located in "+location;
	}

	
	
}
