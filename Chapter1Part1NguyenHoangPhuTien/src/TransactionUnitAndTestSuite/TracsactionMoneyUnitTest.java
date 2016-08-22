package TransactionUnitAndTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import ManagerBank.Money;

public class TracsactionMoneyUnitTest {

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 19/8/2016.
	 * Version : 1.0.
	 * Test for transaction money.
	 * Output : return result is a double type.
	 */
	
	Money money = new Money("001", "28/8", 1);
	
	@Test
	public void test1() {

		money.setType("USD");
		double ac = money.calMoneyBuy(1);
		double ex = 22250;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test2() {

		money.setType("USD");
		double ac = money.calMoneySell(1);
		double ex = 24568.5;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() {

		money.setType("EUR");
		double ac = money.calMoneyBuy(2);
		double ex = 24457;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {

		money.setType("EUR");
		double ac = money.calMoneySell(2);
		double ex = 27555.0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {

		money.setType("AUD");
		double ac = money.calMoneyBuy(3);
		double ex = 16530;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {

		money.setType("AUD");
		double ac = money.calMoneySell(3);
		double ex = 18948.6;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test7() {

		money.setType("USD");
		double ac = money.calMoneyBuy(1);
		double ex = 222250;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {

		money.setType("USD");
		double ac = money.calMoneySell(1);
		double ex = 124568.5;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test9() {

		money.setType("EUR");
		double ac = money.calMoneyBuy(2);
		double ex = 244571;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {

		money.setType("EUR");
		double ac = money.calMoneySell(2);
		double ex = 275551.0;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test11() {

		money.setType("AUD");
		double ac = money.calMoneyBuy(3);
		double ex = 165301;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test12() {

		money.setType("AUD");
		double ac = money.calMoneySell(3);
		double ex = 118948.6;
		assertNotEquals(ex, ac, 0);
	}
}
