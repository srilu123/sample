package com.parsa.sample;

 class Bike implements Vehicle {
  
	@Override
	public void applyBreak(int newBreak) {
		System.out.println(name);
		System.out.println(++newBreak);
	}

	@Override
	public void changeGear(int newGear) {
		
		System.out.println(newGear);
	}

}
