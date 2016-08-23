package ShapeInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about square
 */

public class Square extends Shape{

	double height;

	public Square() {
		super();
	}

	public Square(double height) {
		super();
		this.height = height;
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
		return height * 4;
	}

	/*
	 * Get area of rectangle
	 * Return result as double type.
	 */
	@Override
	public double area() {
		return height * height;
	}
	
	
}
