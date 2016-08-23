package ShapeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ShapeInformation.Rectangle;
import ShapeInformation.Square;

/*
 * Nguyen Hoang Phu Tien
 * Version 1.0
 * 23/8/2016
 * Test for square
 */

public class SquareTest {

	Square square = new Square();
	
	@Test
	public void test1() {
		
		square.setHeight(2);
		
		double ac = square.perimeter();
		double ex = 8;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() {
		
		square.setHeight(4);
		
		double ac = square.perimeter();
		double ex = 16;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() {
		
		square.setHeight(2);
		
		double ac = square.area();
		double ex = 4;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		
		square.setHeight(3);
		
		double ac = square.area();
		double ex = 9;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		
		square.setHeight(4);
		
		double ac = square.area();
		double ex = 16;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		
		square.setHeight(2);
		
		double ac = square.perimeter();
		double ex = 2;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test7() {
		
		square.setHeight(4);
		
		double ac = square.perimeter();
		double ex = 6;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test8() {
		
		square.setHeight(2);
		
		double ac = square.area();
		double ex = 14;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		
		square.setHeight(3);
		
		double ac = square.area();
		double ex = 91;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		
		square.setHeight(4);
		
		double ac = square.area();
		double ex = 6;
		assertNotEquals(ex, ac, 0);
	}
}
