package FactoryPattern;

/* CLass for Rectangle
* Date : 1/9/2016
* Author : Nguyen Hoang Phu Tien
* Version : 1.0;
*/
public class Rectangle implements Shape{

	public Rectangle() {
		super();
		
	}

	/*
	 * Get drawing by circle
	 * Return result as a String type
	 */
	@Override
	public String draw() {
		
		return "You are drawing a RECTANGLE";
	}


	
}
