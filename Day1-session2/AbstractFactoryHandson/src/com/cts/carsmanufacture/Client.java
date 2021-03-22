package com.cts.carsmanufacture;


public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory typeFactory=null;
		Headlight headlight=null;
		Tire tire=null;
		
		
		typeFactory=FactoryProducer.getFactory("audi");
		headlight=typeFactory.makeHeadlight();
		headlight.print();
		
		
		typeFactory=FactoryProducer.getFactory("audi");
		tire=typeFactory.makeTire();
		tire.print();
		
		
		
		typeFactory=FactoryProducer.getFactory("mercedes");
		headlight=typeFactory.makeHeadlight();
		headlight.print();
		
		
		typeFactory=FactoryProducer.getFactory("mercedes");
		tire=typeFactory.makeTire();
		tire.print();
			
	}

}
