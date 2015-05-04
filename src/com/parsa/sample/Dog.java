package com.parsa.sample;

public class Dog {

	String color;
	String breed;
	String name;
	boolean hungry;

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed
	 *            the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the hungry
	 */
	public boolean isHungry() {
		return hungry;
	}

	/**
	 * @param hungry
	 *            the hungry to set
	 */
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [color=" + color + ", breed=" + breed + ", name=" + name
				+ ", hungry=" + hungry + "]";
	}

}
