package FactoryPattern;

/* CLass for Circle
* Date : 1/9/2016
* Author : Nguyen Hoang Phu Tien
* Version : 1.0;
*/

public class ShapeFactory {

	public Shape getShape(String shapeType){
		
		if(shapeType == null)
			return null;
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if(shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if(shapeType.equalsIgnoreCase("Square"))
			return new Square();
		return null;
	}
}
