package TransactionUnitAndTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import ManagerBank.Gold;

public class TransactionGoldUnitTest {

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 19/8/2016.
	 * Version : 1.0.
	 * Test for transaction gold.
	 * Output : return result is a double type.
	 */
	
	Gold gold = new Gold("001", "28/8",1);
	
	@Test
	public void test1() {
		
		gold.setType("SJC9999");
		double ac = gold.calculateMoney(1);
		double ex = 3550000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() {
		
		gold.setType("SJC9999");
		gold.setQuantity(2);
		double ac = gold.calculateMoney(1);
		double ex = 7100000;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() {
		
		gold.setType("SJC9999");
		gold.setQuantity(3);
		double ac = gold.calculateMoney(1);
		double ex = 10650000;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test4() {
		
		gold.setType("24K");
		gold.setQuantity(1);
		double ac = gold.calculateMoney(2);
		double ex = 3514100;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		
		gold.setType("24K");
		gold.setQuantity(2);
		double ac = gold.calculateMoney(2);
		double ex = 7028200;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test6() {
		
		gold.setType("SJC9999");
		double ac = gold.calculateMoney(1);
		double ex = 350000;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test7() {
		
		gold.setType("SJC9999");
		gold.setQuantity(2);
		double ac = gold.calculateMoney(1);
		double ex = 100000;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {
		
		gold.setType("SJC9999");
		gold.setQuantity(3);
		double ac = gold.calculateMoney(1);
		double ex = 1650000;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test9() {
		
		gold.setType("24K");
		gold.setQuantity(1);
		double ac = gold.calculateMoney(2);
		double ex = 35141000;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		
		gold.setType("24K");
		gold.setQuantity(2);
		double ac = gold.calculateMoney(2);
		double ex = 17028200;
		assertNotEquals(ex, ac, 0);
	}
}
