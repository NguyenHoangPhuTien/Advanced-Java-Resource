package FactoryPattern;

/* CLass for Circle
* Date : 1/9/2016
* Author : Nguyen Hoang Phu Tien
* Version : 1.0;
*/
public class Circle implements Shape{

	public Circle() {
		super();
		
	}

	/*
	 * Get drawing by circle
	 * Return result as a String type
	 */
	@Override
	public String draw() {
		
		return "You are drawing a CIRCLE";
	}

	
}
