package com.cts.pattern;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMovable {

	
	@Test 
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() 
	{ 
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron); 
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001); 
	}
	
	@Test 
	public void whenConvertingUSDToEURO_thenSuccessfullyConverted() 
	{ 
		Movable bugattiVeyronMoney = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronMoneyAdapter = new MovableAdapterImpl(bugattiVeyronMoney); 
		assertEquals(bugattiVeyronMoneyAdapter.getUsd(), 84.099, 0.00001); 
	}
	
	
	
	
}
