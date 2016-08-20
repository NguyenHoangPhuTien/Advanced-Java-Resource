package Geometry;
public class Coordinate {
	
	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 19/8/2016.
	 * Version : 1.
	 * Class for coordinate
	 */

	int pointA;
	int pointB;

	public Coordinate() {
		super();
	}

	public Coordinate(int pointA, int pointB) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
	}

	public int getPointA() {
		return pointA;
	}

	public void setPointA(int pointA) {
		this.pointA = pointA;
	}

	public int getPointB() {
		return pointB;
	}

	public void setPointB(int pointB) {
		this.pointB = pointB;
	}

	

}
