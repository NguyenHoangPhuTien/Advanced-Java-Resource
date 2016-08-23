/**
 * 
 */
package ShapeInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about rectangle
 */
public class Rectangle extends Shape{

	double weight;
	double height;
	
	
	public Rectangle() {
		super();
	}

	public Rectangle(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	/*
	 * Get perimeter of rectangle
	 * Return result as double type.
	 */
	@Override
	public double perimeter() {
		return (weight + height) * 2;
	}

	/*
	 * Get area of rectangle
	 * Return result as double type.
	 */
	@Override
	public double area() {
		return weight * height;
	}
	
	
	
}
