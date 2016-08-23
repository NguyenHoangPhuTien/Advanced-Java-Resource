package ShapeTest;

/*
 * Nguyen Hoang Phu Tien
 * Version 1.0
 * 23/8/2016
 * Test for rectangle
 */
import static org.junit.Assert.*;

import org.junit.Test;

import ShapeInformation.Rectangle;

public class RectanglelTest {

	Rectangle rec = new Rectangle();
	
	@Test
	public void test1() {
		rec.setHeight(2);
		rec.setWeight(1);
		
		double ac = rec.perimeter();
		double ex = 6;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test2() {
		rec.setHeight(3);
		rec.setWeight(2);
		
		double ac = rec.perimeter();
		double ex = 10;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() {
		rec.setHeight(2);
		rec.setWeight(1);
		
		double ac = rec.area();
		double ex = 2;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		rec.setHeight(3);
		rec.setWeight(2);
		
		double ac = rec.area();
		double ex = 6;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		rec.setHeight(4);
		rec.setWeight(1);
		
		double ac = rec.area();
		double ex = 4;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		rec.setHeight(2);
		rec.setWeight(1);
		
		double ac = rec.perimeter();
		double ex = 16;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test7() {
		rec.setHeight(3);
		rec.setWeight(2);
		
		double ac = rec.perimeter();
		double ex = 1;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {
		rec.setHeight(2);
		rec.setWeight(1);
		
		double ac = rec.area();
		double ex = 22;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		rec.setHeight(3);
		rec.setWeight(2);
		
		double ac = rec.area();
		double ex = 61;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		rec.setHeight(4);
		rec.setWeight(1);
		
		double ac = rec.area();
		double ex = 14;
		assertNotEquals(ex, ac, 0);
	}
}
