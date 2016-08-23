package ShapeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ShapeInformation.Circle;

/*
 * Nguyen Hoang Phu Tien
 * Version 1.0
 * 23/8/2016
 * Test for rectangle
 */

public class CircleUnitTest {

	Circle cir = new Circle();
	
	@Test
	public void test1() {

		cir.setRadius(2);
		double ac = cir.perimeter();
		double ex = 12.57;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test2() {

		cir.setRadius(2);
		double ac = cir.area();
		double ex = 12.57;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() {

		cir.setRadius(3);
		double ac = cir.perimeter();
		double ex = 18.85;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test4() {

		cir.setRadius(3);
		double ac = cir.area();
		double ex = 28.27;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {

		cir.setRadius(2);
		double ac = cir.perimeter();
		double ex = 112.57;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test6() {

		cir.setRadius(2);
		double ac = cir.area();
		double ex = 120.57;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test7() {

		cir.setRadius(3);
		double ac = cir.perimeter();
		double ex = 181.85;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test8() {

		cir.setRadius(3);
		double ac = cir.area();
		double ex = 128.27;
		assertNotEquals(ex, ac, 0);
	}

}
