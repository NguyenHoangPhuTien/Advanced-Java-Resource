package ShapeInformation;

import java.text.DecimalFormat;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about cirle.
 */

public class Circle extends Shape{
	
	public double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/*
	 * Get perimeter of circle
	 * Return result as double type.
	 */
	@Override
	public double perimeter() {
		DecimalFormat df = new DecimalFormat("#.00");
		double perimeter = 2 * Math.PI * radius;
		return Double.parseDouble(df.format(perimeter));
	}

	/*
	 * Get area of circle
	 * Return result as double type.
	 */
	@Override
	public double area() {
		DecimalFormat df = new DecimalFormat("#.00");
		double area = Math.PI * Math.pow(radius, 2);
		return Double.parseDouble(df.format(area));
	}
	

}
