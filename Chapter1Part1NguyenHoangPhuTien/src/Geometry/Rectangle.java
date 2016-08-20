package Geometry;
import java.text.DecimalFormat;


public class Rectangle implements iPeremiter, iArea{
	
	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 19/8/2016.
	 * Version : 1.
	 * Class for Rectangle.
	 */
	
	Coordinate A;
	Coordinate C;
	
	public Rectangle() {
		super();
	}

	public Rectangle(Coordinate a, Coordinate c) {
		A = a;
		C = c;
	}

	public Coordinate getA() {
		return A;
	}

	public void setA(Coordinate a) {
		A = a;
	}

	public Coordinate getC() {
		return C;
	}

	public void setC(Coordinate c) {
		C = c;
	}

	/*
	 * Get weight of rectangle.
	 * Return weight as double type.
	 */
	public double getWeight(){
		
		double weight = C.pointA - A.pointA;
		return Math.abs(weight);
	}
	
	/*
	 * Get height of rectangle.
	 * Return height as double type.
	 */
	public double getHeight(){
		
		double height = C.pointB - A.pointB;
		return Math.abs(height);
	}
	
	/*
	 * Get area of rectangle.
	 * Return result as double type.
	 */
	@Override
	public double findArea() {
		
		if (A == null | C == null)
			throw new NullPointerException("A coordinate or C coordinate is null");
		
		double area = this.getWeight() *  this.getHeight();
		return area;	
	}

	/*
	 * Get peremiter of rectangle.
	 * Return result as double type.
	 */
	@Override
	public double findPerimeter() {
		
		if (A == null | C == null)
			throw new NullPointerException("A coordinate or C coordinate is null");
		
		double perimeter = (this.getWeight() +  this.getHeight()) * 2;
		
		return perimeter;
		
	}

}
