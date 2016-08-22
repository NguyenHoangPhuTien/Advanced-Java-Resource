package EmployeeSalaryUnitAndTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import Emloyee.TradeEmployee;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 22/8/2016.
 * Version : 1.0.
 * Test for get bonus salary of Trade employee.
 * Output : return result area of circle as double type.
 */

public class TradeEmployeeUnitTest {

	TradeEmployee trade = new TradeEmployee();
	
	@Test
	public void test1() {
		trade.setTradeSalary(100);
		trade.setRateSalary(0.1);
		
		double ac = trade.findBonusSalary();
		double ex = 10;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() {
		trade.setTradeSalary(200);
		trade.setRateSalary(0.2);
		
		double ac = trade.findBonusSalary();
		double ex = 40;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() {
		trade.setTradeSalary(300);
		trade.setRateSalary(0.1);
		
		double ac = trade.findBonusSalary();
		double ex = 30;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		trade.setTradeSalary(100);
		trade.setRateSalary(0.2);
		
		double ac = trade.findBonusSalary();
		double ex = 20;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		trade.setTradeSalary(1000);
		trade.setRateSalary(0.1);
		
		double ac = trade.findBonusSalary();
		double ex = 100;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		trade.setTradeSalary(100);
		trade.setRateSalary(0.1);
		
		double ac = trade.findBonusSalary();
		double ex = 110;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test7() {
		trade.setTradeSalary(200);
		trade.setRateSalary(0.2);
		
		double ac = trade.findBonusSalary();
		double ex = 240;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test8() {
		trade.setTradeSalary(300);
		trade.setRateSalary(0.1);
		
		double ac = trade.findBonusSalary();
		double ex = 310;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		trade.setTradeSalary(100);
		trade.setRateSalary(0.2);
		
		double ac = trade.findBonusSalary();
		double ex = 220;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		trade.setTradeSalary(1000);
		trade.setRateSalary(0.1);
		
		double ac = trade.findBonusSalary();
		double ex = 200;
		assertNotEquals(ex, ac, 0);
	}
}
