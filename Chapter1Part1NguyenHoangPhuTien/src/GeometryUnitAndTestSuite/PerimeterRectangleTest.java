package GeometryUnitAndTestSuite;
import static org.junit.Assert.*;

import org.junit.Test;

import Geometry.Coordinate;
import Geometry.Rectangle;


public class PerimeterRectangleTest {

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 19/8/2016.
	 * Version : 1.
	 * Test get perimeter of rectangle.
	 * Output : return result perimeter of rectangle as double type.
	 */
	
	Coordinate a = new Coordinate();
	Coordinate c = new Coordinate();
	
	Rectangle rec= new Rectangle();
	
	@Test
	public void test1() {
		
		a.setPointA(1);
		a.setPointB(1);
		
		c.setPointA(3);
		c.setPointB(3);
		
		rec.setA(a);
		rec.setC(c);
		
		double ac = rec.findPerimeter();
		double ex = 8.0;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test2() {
		
		a.setPointA(1);
		a.setPointB(2);
		
		c.setPointA(3);
		c.setPointB(3);
		
		rec.setA(a);
		rec.setC(c);
		
		double ac = rec.findPerimeter();
		double ex = 6.0;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test3() {
		
		a.setPointA(1);
		a.setPointB(8);
		
		c.setPointA(3);
		c.setPointB(3);
		
		rec.setA(a);
		rec.setC(c);
		
		double ac = rec.findPerimeter();
		double ex = 14.0;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test4() {
		
		a.setPointA(1);
		a.setPointB(4);
		
		c.setPointA(3);
		c.setPointB(3);
		
		rec.setA(a);
		rec.setC(c);
		
		double ac = rec.findPerimeter();
		double ex = 6.0;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test5() {
		
		a.setPointA(1);
		a.setPointB(5);
		
		c.setPointA(3);
		c.setPointB(3);
		
		rec.setA(a);
		rec.setC(c);
		
		double ac = rec.findPerimeter();
		double ex = 8.0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		
		a.setPointA(1);
		a.setPointB(1);
		
		c.setPointA(3);
		c.setPointB(3);
		
		rec.setA(a);
		rec.setC(c);
		
		double ac = rec.findPerimeter();
		double ex = 10;
		assertNotEquals(ex, ac,0);
	}
	
	@Test
	public void test7() {
		
		a.setPointA(1);
		a.setPointB(2);
		
		c.setPointA(3);
		c.setPointB(3);
		
		rec.setA(a);
		rec.setC(c);
		
		double ac = rec.findPerimeter();
		double ex = 20;
		assertNotEquals(ex, ac,0);
	}
	
	@Test
	public void test8() {
		
		a.setPointA(1);
		a.setPointB(3);
		
		c.setPointA(3);
		c.setPointB(3);
		
		rec.setA(a);
		rec.setC(c);
		
		double ac = rec.findPerimeter();
		double ex = 30;
		assertNotEquals(ex, ac,0);
	}
	
	@Test
	public void test9() {
		
		a.setPointA(1);
		a.setPointB(4);
		
		c.setPointA(3);
		c.setPointB(3);
		
		rec.setA(a);
		rec.setC(c);
		
		double ac = rec.findPerimeter();
		double ex = 40;
		assertNotEquals(ex, ac,0);
	}
	
	@Test
	public void test10() {
		
		a.setPointA(1);
		a.setPointB(5);
		
		c.setPointA(3);
		c.setPointB(3);
		
		rec.setA(a);
		rec.setC(c);
		
		double ac = rec.findPerimeter();
		double ex = 30;
		assertNotEquals(ex, ac,0);
	}
}
