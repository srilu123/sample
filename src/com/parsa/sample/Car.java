package com.parsa.sample;

public class Car  implements Vehicle{

	@Override
	public void applyBreak(int newBreak) {
	System.out.println("applyingbreaks");
		
	}

	@Override
	public void changeGear(int newGear) {
		System.out.println("changing gear");
		
	}

}
