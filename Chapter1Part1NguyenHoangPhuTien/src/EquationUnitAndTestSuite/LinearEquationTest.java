package EquationUnitAndTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import Equation.LinearEquation;

public class LinearEquationTest {

	LinearEquation le = new LinearEquation();
	
	@Test
	public void test1() {
		
		le.setA(0);
		le.setB(0);
		double ac = le.findRoot();
		double ex = Double.MAX_VALUE;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test2() {
		
		le.setA(0);
		le.setB(1);
		double ac = le.findRoot();
		double ex = Double.MIN_VALUE;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test3() {
		
		le.setA(0);
		le.setB(-2);
		double ac = le.findRoot();
		double ex = Double.MIN_VALUE;
		assertEquals(ex, ac,0);
	}

	
	@Test
	public void test4() {
		
		le.setA(1);
		le.setB(2);
		double ac = le.findRoot();
		double ex = -2;
		assertEquals(ex, ac,0);
	}

	
	@Test
	public void test5() {
		
		le.setA(1);
		le.setB(-2);
		double ac = le.findRoot();
		double ex = 2;
		assertEquals(ex, ac,0);
	}

	
	@Test
	public void test6() {
		
		le.setA(0);
		le.setB(0);
		double ac = le.findRoot();
		double ex = Double.MIN_VALUE;
		assertEquals(ex, ac,0);
	}

	@Test
	public void test7() {
		
		le.setA(0);
		le.setB(-1);
		double ac = le.findRoot();
		double ex = Double.MAX_VALUE;
		assertEquals(ex, ac,0);
	}

	@Test
	public void test8() {
		
		le.setA(0);
		le.setB(-2);
		double ac = le.findRoot();
		double ex = Double.MAX_VALUE;
		assertEquals(ex, ac,0);
	}
	
	@Test
	public void test9() {
		
		le.setA(1);
		le.setB(-2);
		double ac = le.findRoot();
		double ex = -2;
		assertEquals(ex, ac,0);
	}

	@Test
	public void test10() {
		
		le.setA(-1);
		le.setB(-2);
		double ac = le.findRoot();
		double ex = 2;
		assertEquals(ex, ac,0);
	}
}
