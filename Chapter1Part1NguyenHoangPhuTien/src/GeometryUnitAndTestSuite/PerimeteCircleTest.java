package GeometryUnitAndTestSuite;
import static org.junit.Assert.*;

import org.junit.Test;

import Geometry.Circle;
import Geometry.Coordinate;
import Geometry.Distance;


public class PerimeteCircleTest {

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 19/8/2016.
	 * Version : 1.
	 * Test get perimeter of circle.
	 * Output : return result perimeter of circle as double type.
	 */
	
	Coordinate o = new Coordinate();
	Coordinate r = new Coordinate();
	
	Distance distance = new Distance();
	Circle circle = new Circle();
	
	@Test
	public void test1() {
		
		o.setPointA(0);
		o.setPointB(0);
		
		r.setPointA(0);
		r.setPointB(0);
		
		distance.setFrist(o);
		distance.setSecond(r);
		
		circle.setDistance(distance);
		
		double ac = circle.findPerimeter();
		double ex = 0;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test2() {
		
		o.setPointA(1);
		o.setPointB(1);
		
		r.setPointA(2);
		r.setPointB(4);
		distance.setFrist(o);
		distance.setSecond(r);
		
		circle.setDistance(distance);
		
		double ac = circle.findPerimeter();
		double ex = 19.869;
		assertEquals(ex, ac,0);
	}

	@Test
	public void test3() {
		
		o.setPointA(1);
		o.setPointB(2);
		
		r.setPointA(2);
		r.setPointB(4);
		
		distance.setFrist(o);
		distance.setSecond(r);
		
		circle.setDistance(distance);
		
		double ac = circle.findPerimeter();
		double ex = 14.05;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test4() {
		
		o.setPointA(2);
		o.setPointB(2);
		
		r.setPointA(2);
		r.setPointB(4);
		
		distance.setFrist(o);
		distance.setSecond(r);
		
		circle.setDistance(distance);
		
		double ac = circle.findPerimeter();
		double ex = 12.566;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test5() {
		
		o.setPointA(3);
		o.setPointB(2);
		
		r.setPointA(2);
		r.setPointB(4);
		
		distance.setFrist(o);
		distance.setSecond(r);
		
		circle.setDistance(distance);
		
		double ac = circle.findPerimeter();
		double ex = 14.05;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test6() {
		
		o.setPointA(0);
		o.setPointB(0);
		
		r.setPointA(0);
		r.setPointB(0);
		
		distance.setFrist(o);
		distance.setSecond(r);
		
		circle.setDistance(distance);
		
		double ac = circle.findPerimeter();
		double ex = 1;
		assertNotEquals(ex, ac,0);
	}
	
	@Test
	public void test7() {
		
		o.setPointA(1);
		o.setPointB(1);
		
		r.setPointA(2);
		r.setPointB(4);
		
		distance.setFrist(o);
		distance.setSecond(r);
		
		circle.setDistance(distance);
		
		double ac = circle.findPerimeter();
		double ex = -19.869;
		assertNotEquals(ex, ac,0);
	}

	@Test
	public void test8() {
		
		o.setPointA(1);
		o.setPointB(2);
		
		r.setPointA(2);
		r.setPointB(4);
		
		distance.setFrist(o);
		distance.setSecond(r);
		
		circle.setDistance(distance);
		
		double ac = circle.findPerimeter();
		double ex = -14.05;
		assertNotEquals(ex, ac,0);
	}
	
	@Test
	public void test9() {
		
		o.setPointA(2);
		o.setPointB(2);
		
		r.setPointA(2);
		r.setPointB(4);
		
		distance.setFrist(o);
		distance.setSecond(r);
		
		circle.setDistance(distance);
		
		double ac = circle.findPerimeter();
		double ex = 11.566;
		assertNotEquals(ex, ac,0);
	}
	
	@Test
	public void test10() {
		
		o.setPointA(3);
		o.setPointB(2);
		
		r.setPointA(2);
		r.setPointB(4);
		
		distance.setFrist(o);
		distance.setSecond(r);
		
		circle.setDistance(distance);
		
		double ac = circle.findPerimeter();
		double ex = 13.05;
		assertNotEquals(ex, ac,0);
	}
}
