package Geometry;
import java.text.DecimalFormat;


public class Circle implements iPeremiter, iArea{
	
	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 19/8/2016.
	 * Version : 1.
	 * Class for Circle.
	 */
	
	Distance distance;
	
	
	public Circle() {
		super();
	}

	public Circle(Distance distance) {
		super();
		this.distance = distance;
	}

	
	public Distance getDistance() {
		return distance;
	}

	public void setDistance(Distance distance) {
		this.distance = distance;
	}

	/*
	 * Get diameter of circle.
	 * Return result as double type.
	 */
	public double findDiameter(){
		
		double diameter = distance.getDistance2Point() * 2;
		return diameter;
	}
	/*
	 * Get area of circle.
	 * Return result as double type.
	 */
	@Override
	public double findArea() {
		
		if (distance == null)
			throw new NullPointerException("distance of 2 coordinate is null");
		
		double area = Math.pow(this.findDiameter(), 2)/4 * Math.PI;
		DecimalFormat df = new DecimalFormat("#.000");
		area = Double.parseDouble(df.format(area));
		return area;
	}

	/*
	 * Get peremiter of circle.
	 * Return result as double type.
	 */
	@Override
	public double findPerimeter() {
		
		if (distance == null)
			throw new NullPointerException("distance of 2 point is null");
	
		double perimeter = this.findDiameter() * Math.PI;
		DecimalFormat df = new DecimalFormat("#.000");
		perimeter = Double.parseDouble(df.format(perimeter));
		return perimeter;
		
	}
}
