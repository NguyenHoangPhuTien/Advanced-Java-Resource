package TestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

import Code.MarkSession;
 
/*
 * Author : Nguyen Hoang Phu Tien
 * version : 1.0
 * Date : 6/9/2016
 * Test for calculate total mark 
 */
public class MarkSessionTestCase {

	MarkSession markSession = new MarkSession();
	
	@Test
	public void test1() {
		markSession.setMarkActive(10);
		markSession.setMarkAttendence(10);
		markSession.setMarkExercise(10);
		
		double ac = markSession.calSessionGrade();
		double ex = 10;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test2() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(10);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 3;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(10);
		
		double ac = markSession.calSessionGrade();
		double ex = 6;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		markSession.setMarkActive(10);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 1;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		markSession.setMarkActive(10);
		markSession.setMarkAttendence(10);
		markSession.setMarkExercise(10);
		
		double ac = markSession.calSessionGrade();
		double ex = 1;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test7() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 10;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(10);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 31;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		markSession.setMarkActive(0);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(10);
		
		double ac = markSession.calSessionGrade();
		double ex = 16;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		markSession.setMarkActive(10);
		markSession.setMarkAttendence(0);
		markSession.setMarkExercise(0);
		
		double ac = markSession.calSessionGrade();
		double ex = 10;
		assertNotEquals(ex, ac, 0);
	}
}
