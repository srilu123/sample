/**
 * 
 */
package com.parsa.sample;

/**
 * @author ramesh
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "lohitakshay";
		System.out.println("hello " + name);
		Dog d1=new Dog();
		Bicycle b=new Bicycle();
		Bike b1=new Bike();
		d1.setColor("black");
		d1.setBreed("breed");
		d1.setName("ramu");
		d1.setHungry(true);
		b.setSpeed(16);
		b1.applyBreak(1);
		b1.changeGear(3);
		
		System.out.println(d1);
		System.out.println(d1.getColor());
		System.out.println(b.getSpeed());
		System.out.println();
		
		
	}

}
