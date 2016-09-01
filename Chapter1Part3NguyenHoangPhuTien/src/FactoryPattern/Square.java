package FactoryPattern;

/* CLass for Square
* Date : 1/9/2016
* Author : Nguyen Hoang Phu Tien
* Version : 1.0;
*/
public class Square implements Shape{

	
	public Square() {
		super();
		
	}
	/*
	 * Get drawing by circle
	 * Return result as a String type
	 */
	@Override
	public String draw() {
		
		return "You are drawing a SQUARE";
	}

}
