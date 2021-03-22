package com.cts.carsmanufacture;


public class FactoryProducer {

	public static Factory getFactory(String typeOfFactory)
	{
		if(typeOfFactory.equals("audi"))
		{
			return new AudiFactory();
		}
		else if(typeOfFactory.equals("mercedes"))
		{
			return new MercedesFactory();
		}
		return null;
	}
	
	
	
	
	
	
	
	
}
