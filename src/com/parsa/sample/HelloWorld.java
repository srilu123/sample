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
		
		
		FactorialDemo f=new FactorialDemo();
		f.getFactorial(5);
		
		System.out.println("the factorial of given no:"+f.getFactorial(0));
		
		
		
		Dog d1=new Dog();
		Bicycle b=new Bicycle();
		Bike b1=new Bike();
		Car c=new Car();
		d1.setColor("black");
		d1.setBreed("breed");
		d1.setName("ramu");
		d1.setHungry(true);
		b.setSpeed(16);
		b1.applyBreak(1);
		b1.changeGear(3);
		c.applyBreak(5);
		c.changeGear(6);
		
		System.out.println(d1);
		System.out.println(d1.getColor());
		System.out.println(b.getSpeed());
		System.out.println();
		
		
	}

}
