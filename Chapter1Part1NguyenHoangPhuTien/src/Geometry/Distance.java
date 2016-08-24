package Geometry;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 19/8/2016.
 * Version : 1.
 * Class for get distance two coordinate.
 */

public class Distance {

	Coordinate first;
	Coordinate second;
	
	public Distance() {
		super();
	}

	public Distance(Coordinate first, Coordinate second) {
		super();
		this.first = first;
		this.second = second;
	}

	public Coordinate getFirst() {
		return first;
	}

	public void setFrist(Coordinate first) {
		this.first = first;
	}

	public Coordinate getSecond() {
		return second;
	}

	public void setSecond(Coordinate second) {
		this.second = second;
	}
	
	/*
	 * Get distance with 2 point.
	 * Output : return result as double type.
	 */
	public double getDistance2Point() {

		if(second == null | first == null)
			throw new NullPointerException("fisrt coordinate or second Coordinate is null");
		double result = 0;

		result = Math.sqrt(Math.pow((first.pointA - second.pointA), 2)
				+ Math.pow((first.pointB - second.pointB), 2));
		return result;
	}
}
