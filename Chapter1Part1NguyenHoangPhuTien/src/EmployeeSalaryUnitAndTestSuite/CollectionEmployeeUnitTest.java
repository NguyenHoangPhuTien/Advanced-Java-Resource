package EmployeeSalaryUnitAndTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import Emloyee.CollectionEmployee;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 22/8/2016.
 * Version : 1.0.
 * Test for get bonus salary of Trade employee.
 * Output : return result area of circle as double type.
 */

public class CollectionEmployeeUnitTest {

	CollectionEmployee collect = new CollectionEmployee();
	
	@Test
	public void test1() {
		collect.setLimitProduct(2);
		collect.setQuantityProduct(1);
		collect.setRateBonusSalary(2);
		
		double ac = collect.findBonusSalary();
		double ex = 0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() {
		collect.setLimitProduct(2);
		collect.setQuantityProduct(3);
		collect.setRateBonusSalary(2);
		
		double ac = collect.findBonusSalary();
		double ex = 2;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() {
		collect.setLimitProduct(1);
		collect.setQuantityProduct(3);
		collect.setRateBonusSalary(2);
		
		double ac = collect.findBonusSalary();
		double ex = 4;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		collect.setLimitProduct(0);
		collect.setQuantityProduct(3);
		collect.setRateBonusSalary(2);
		
		double ac = collect.findBonusSalary();
		double ex = 6;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		collect.setLimitProduct(0);
		collect.setQuantityProduct(1);
		collect.setRateBonusSalary(2);
		
		double ac = collect.findBonusSalary();
		double ex = 2;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		collect.setLimitProduct(2);
		collect.setQuantityProduct(1);
		collect.setRateBonusSalary(2);
		
		double ac = collect.findBonusSalary();
		double ex = 10;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test7() {
		collect.setLimitProduct(2);
		collect.setQuantityProduct(3);
		collect.setRateBonusSalary(2);
		
		double ac = collect.findBonusSalary();
		double ex = 22;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test8() {
		collect.setLimitProduct(1);
		collect.setQuantityProduct(3);
		collect.setRateBonusSalary(2);
		
		double ac = collect.findBonusSalary();
		double ex = 14;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		collect.setLimitProduct(0);
		collect.setQuantityProduct(3);
		collect.setRateBonusSalary(2);
		
		double ac = collect.findBonusSalary();
		double ex = 16;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		collect.setLimitProduct(0);
		collect.setQuantityProduct(1);
		collect.setRateBonusSalary(2);
		
		double ac = collect.findBonusSalary();
		double ex = 12;
		assertNotEquals(ex, ac, 0);
	}
}
