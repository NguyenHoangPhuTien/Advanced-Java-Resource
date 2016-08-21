package ComputerUnitAndTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import ComputerProduct.Computer;

public class ComputerTotalMoneyTest {

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 20/8/2016.
	 * Version : 1.
	 * Test for find total money all product.
	 * Output : return result as double type.
	 */
	
	Computer computer = new Computer();
	
	@Test
	public void test1() {

		computer.setNumberProduct("001");
		computer.setManufacturer("asus");
		computer.setPrice(2);
		computer.setNumberImport(2);
		
		double ac = computer.findTotalMoney();
		double ex = 4.0;
		assertEquals(ex, ac, 0);
	}

	public void test2() {

		computer.setNumberProduct("001");
		computer.setManufacturer("asus");
		computer.setPrice(3);
		computer.setNumberImport(2);
		
		double ac = computer.findTotalMoney();
		double ex = 6.0;
		assertEquals(ex, ac, 0);
	}
	
	public void test3() {

		computer.setNumberProduct("001");
		computer.setManufacturer("asus");
		computer.setPrice(4);
		computer.setNumberImport(2);
		
		double ac = computer.findTotalMoney();
		double ex = 8.0;
		assertEquals(ex, ac, 0);
	}
	
	public void test4() {

		computer.setNumberProduct("001");
		computer.setManufacturer("asus");
		computer.setPrice(1);
		computer.setNumberImport(2);
		
		double ac = computer.findTotalMoney();
		double ex = 2.0;
		assertEquals(ex, ac, 0);
	}
	
	public void test5() {

		computer.setNumberProduct("001");
		computer.setManufacturer("asus");
		computer.setPrice(10);
		computer.setNumberImport(2);
		
		double ac = computer.findTotalMoney();
		double ex = 20.0;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {

		computer.setNumberProduct("001");
		computer.setManufacturer("asus");
		computer.setPrice(2);
		computer.setNumberImport(2);
		
		double ac = computer.findTotalMoney();
		double ex = 14.0;
		assertNotEquals(ex, ac, 0);
	}

	public void test7() {

		computer.setNumberProduct("001");
		computer.setManufacturer("asus");
		computer.setPrice(3);
		computer.setNumberImport(2);
		
		double ac = computer.findTotalMoney();
		double ex = 26.0;
		assertNotEquals(ex, ac, 0);
	}
	
	public void test8() {

		computer.setNumberProduct("001");
		computer.setManufacturer("asus");
		computer.setPrice(4);
		computer.setNumberImport(2);
		
		double ac = computer.findTotalMoney();
		double ex = 38.0;
		assertNotEquals(ex, ac, 0);
	}
	
	public void test9() {

		computer.setNumberProduct("001");
		computer.setManufacturer("asus");
		computer.setPrice(1);
		computer.setNumberImport(2);
		
		double ac = computer.findTotalMoney();
		double ex = 42.0;
		assertNotEquals(ex, ac, 0);
	}
	
	public void test10() {

		computer.setNumberProduct("001");
		computer.setManufacturer("asus");
		computer.setPrice(10);
		computer.setNumberImport(2);
		
		double ac = computer.findTotalMoney();
		double ex = 520.0;
		assertNotEquals(ex, ac, 0);
	}
}
