package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Calculate.Forumula2no;

public class Formula2noTest {

	/*
	 * Author : Nguyen Hoang Phu Tien. 
	 * Date : 19/8/2016. Version : 1. 
	 * Test operations of 2 numbers. 
	 * Output : return array include result of operations.
	 */

	Forumula2no fo2no = new Forumula2no();

	@Test
	public void test1() {

		fo2no.setA(2.0);
		fo2no.setB(1.0);

		double plus = fo2no.plus();
		double minus = fo2no.minus();
		double divide = fo2no.divide();
		double product = fo2no.product();

		double[] ex = { 3.0, 1.0, 2.0, 2.0 };
		double[] ac = { plus, minus, divide, product };

		assertArrayEquals(ex, ac, 0);
	}

	@Test
	public void test2() {

		fo2no.setA(2.0);
		fo2no.setB(2.0);

		double plus = fo2no.plus();
		double minus = fo2no.minus();
		double divide = fo2no.divide();
		double product = fo2no.product();

		double[] ex = { 4.0, 0, 1.0, 4.0 };
		double[] ac = { plus, minus, divide, product };

		assertArrayEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() {

		fo2no.setA(3.0);
		fo2no.setB(1.0);

		double plus = fo2no.plus();
		double minus = fo2no.minus();
		double divide = fo2no.divide();
		double product = fo2no.product();

		double[] ex = { 4.0, 2.0, 3.0, 3.0 };
		double[] ac = { plus, minus, divide, product };

		assertArrayEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {

		fo2no.setA(1.0);
		fo2no.setB(1.0);

		double plus = fo2no.plus();
		double minus = fo2no.minus();
		double divide = fo2no.divide();
		double product = fo2no.product();

		double[] ex = { 2.0, 0.0, 1.0, 1.0 };
		double[] ac = { plus, minus, divide, product };

		assertArrayEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {

		fo2no.setA(0.0);
		fo2no.setB(1.0);

		double plus = fo2no.plus();
		double minus = fo2no.minus();
		double divide = fo2no.divide();
		double product = fo2no.product();

		double[] ex = { 1.0, -1.0, 0, 0 };
		double[] ac = { plus, minus, divide, product };

		assertArrayEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {

		fo2no.setA(2.0);
		fo2no.setB(1.0);

		double plus = fo2no.plus();
		double minus = fo2no.minus();
		double divide = fo2no.divide();
		double product = fo2no.product();

		double[] ex = { 1.0, 1.0, 2.0, 2.0 };
		double[] ac = { plus, minus, divide, product };

		assertArrayEquals(ex, ac, 0);
	}

	@Test
	public void test7() {

		fo2no.setA(2.0);
		fo2no.setB(2.0);

		double plus = fo2no.plus();
		double minus = fo2no.minus();
		double divide = fo2no.divide();
		double product = fo2no.product();

		double[] ex = { 1.0, 0, 1.0, 4.0 };
		double[] ac = { plus, minus, divide, product };

		assertArrayEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {

		fo2no.setA(3.0);
		fo2no.setB(1.0);

		double plus = fo2no.plus();
		double minus = fo2no.minus();
		double divide = fo2no.divide();
		double product = fo2no.product();

		double[] ex = { 4.0, 2.0, 1.0, 3.0 };
		double[] ac = { plus, minus, divide, product };

		assertArrayEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {

		fo2no.setA(1.0);
		fo2no.setB(1.0);

		double plus = fo2no.plus();
		double minus = fo2no.minus();
		double divide = fo2no.divide();
		double product = fo2no.product();

		double[] ex = { 0.0, 0.0, 1.0, 1.0 };
		double[] ac = { plus, minus, divide, product };

		assertArrayEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {

		fo2no.setA(0.0);
		fo2no.setB(1.0);

		double plus = fo2no.plus();
		double minus = fo2no.minus();
		double divide = fo2no.divide();
		double product = fo2no.product();

		double[] ex = { 1.0, -1.0, 10, 0 };
		double[] ac = { plus, minus, divide, product };

		assertArrayEquals(ex, ac, 0);
	}
}
