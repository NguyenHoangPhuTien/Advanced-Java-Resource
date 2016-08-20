package UnitTest;
import static org.junit.Assert.*;

import org.junit.Test;

import Geometry.Coordinate;
import Geometry.Distance;


public class Distance2CoordinateTest {
	
	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 19/8/2016.
	 * Version : 1.
	 * Test get distance of 2 coordinate.
	 * Input : second coordinate.
	 * Output : return result of distance 2 coordinate as double type
	 */
	
	Coordinate first = new Coordinate();
	Coordinate second = new Coordinate();
	Distance distance = new Distance();
	// Test Pass
	@Test
	public void test1() {
		
		first.setPointA(0);
		first.setPointB(0);
		
		second.setPointA(0);
		second.setPointB(0);
		distance.setFrist(first);
		distance.setSecond(second);
		
		double ac = distance.getDistance2Point();
		double ex = 0;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test2() {
		
		first.setPointA(0);
		first.setPointB(0);
		
		second.setPointA(0);
		second.setPointB(1);
		
		distance.setFrist(first);
		distance.setSecond(second);
		
		double ac = distance.getDistance2Point();
		double ex = 1;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test3() {
		
		first.setPointA(0);
		first.setPointB(0);
		
		second.setPointA(0);
		second.setPointB(-1);
		distance.setFrist(first);
		distance.setSecond(second);
		
		double ac = distance.getDistance2Point();
		double ex = 1;
		assertEquals(ex, ac,0);
	}

	@Test
	public void test4() {
		
		first.setPointA(0);
		first.setPointB(0);
		
		second.setPointA(0);
		second.setPointB(4);
		
		distance.setFrist(first);
		distance.setSecond(second);
		
		double ac = distance.getDistance2Point();
		double ex = 4;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test5() {
		
		first.setPointA(0);
		first.setPointB(0);
		
		second.setPointA(0);
		second.setPointB(-4);
		
		distance.setFrist(first);
		distance.setSecond(second);
		
		double ac = distance.getDistance2Point();
		double ex = 4;
		assertEquals(ex, ac,0);
	}
	
	//Test Fail
	
	@Test
	public void test6() {
		
		first.setPointA(0);
		first.setPointB(0);
		
		second.setPointA(0);
		second.setPointB(0);
		
		distance.setFrist(first);
		distance.setSecond(second);
		
		double ac = distance.getDistance2Point();
		double ex = 1;
		assertNotEquals(ex, ac,0);
	}
	
	@Test
	public void test7() {
		
		first.setPointA(0);
		first.setPointB(0);
		
		second.setPointA(0);
		second.setPointB(1);
		distance.setFrist(first);
		distance.setSecond(second);
		
		double ac = distance.getDistance2Point();
		double ex = -1;
		assertNotEquals(ex, ac,0);
	}
	
	@Test
	public void test8() {
		
		first.setPointA(0);
		first.setPointB(0);
		
		second.setPointA(0);
		second.setPointB(-1);
		distance.setFrist(first);
		distance.setSecond(second);
		
		double ac = distance.getDistance2Point();
		double ex = 0;
		assertNotEquals(ex, ac,0);
	}

	@Test
	public void test9() {
		
		first.setPointA(0);
		first.setPointB(0);
		
		second.setPointA(0);
		second.setPointB(4);
		distance.setFrist(first);
		distance.setSecond(second);
		
		double ac = distance.getDistance2Point();
		double ex = 2;
		assertNotEquals(ex, ac,0);
	}
	
	@Test
	public void test10() {
		
		first.setPointA(0);
		first.setPointB(0);
		
		second.setPointA(0);
		second.setPointB(-4);
		distance.setFrist(first);
		distance.setSecond(second);
		
		double ac = distance.getDistance2Point();
		double ex = 2;
		assertNotEquals(ex, ac,0);
	}
}
