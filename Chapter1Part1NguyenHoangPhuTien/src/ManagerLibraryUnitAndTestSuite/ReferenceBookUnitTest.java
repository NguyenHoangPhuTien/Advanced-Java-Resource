package ManagerLibraryUnitAndTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import ManagerLibrary.ReferenceBook;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 22/8/2016.
 * Version : 1.0.
 * Test for get money of reference book.
 * Return result as double type.
 */

public class ReferenceBookUnitTest {

	ReferenceBook refe = new ReferenceBook();
	
	@Test
	public void test1() {
		refe.setCode("001");
		refe.setDateImport("28/8");
		refe.setManufacturer("kim dong");
		refe.setName("tien");
		refe.setQuantity(1);
		refe.setPrice(200);
		refe.setTax(0.1);
		
		double ac = refe.findMoney();
		double ex = 220;
		
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test2() {
		refe.setCode("001");
		refe.setDateImport("28/8");
		refe.setManufacturer("kim dong");
		refe.setName("tien");
		refe.setQuantity(1);
		refe.setPrice(400);
		refe.setTax(0.1);
		
		double ac = refe.findMoney();
		double ex = 440;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() {
		refe.setCode("001");
		refe.setDateImport("28/8");
		refe.setManufacturer("kim dong");
		refe.setName("tien");
		refe.setQuantity(2);
		refe.setPrice(400);
		refe.setTax(0.1);
		
		double ac = refe.findMoney();
		double ex = 880;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		refe.setCode("001");
		refe.setDateImport("28/8");
		refe.setManufacturer("kim dong");
		refe.setName("tien");
		refe.setQuantity(2);
		refe.setPrice(100);
		refe.setTax(0.1);
		
		double ac = refe.findMoney();
		double ex = 220;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		refe.setCode("001");
		refe.setDateImport("28/8");
		refe.setManufacturer("kim dong");
		refe.setName("tien");
		refe.setQuantity(1);
		refe.setPrice(100);
		refe.setTax(0.1);
		
		double ac = refe.findMoney();
		double ex = 110;
		
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		refe.setCode("001");
		refe.setDateImport("28/8");
		refe.setManufacturer("kim dong");
		refe.setName("tien");
		refe.setQuantity(1);
		refe.setPrice(200);
		refe.setTax(0.1);
		
		double ac = refe.findMoney();
		double ex = 1220;
		
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test7() {
		refe.setCode("001");
		refe.setDateImport("28/8");
		refe.setManufacturer("kim dong");
		refe.setName("tien");
		refe.setQuantity(1);
		refe.setPrice(400);
		refe.setTax(0.1);
		
		double ac = refe.findMoney();
		double ex = 240;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {
		refe.setCode("001");
		refe.setDateImport("28/8");
		refe.setManufacturer("kim dong");
		refe.setName("tien");
		refe.setQuantity(2);
		refe.setPrice(400);
		refe.setTax(0.1);
		
		double ac = refe.findMoney();
		double ex = 480;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		refe.setCode("001");
		refe.setDateImport("28/8");
		refe.setManufacturer("kim dong");
		refe.setName("tien");
		refe.setQuantity(2);
		refe.setPrice(100);
		refe.setTax(0.1);
		
		double ac = refe.findMoney();
		double ex = 420;
		
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		refe.setCode("001");
		refe.setDateImport("28/8");
		refe.setManufacturer("kim dong");
		refe.setName("tien");
		refe.setQuantity(1);
		refe.setPrice(100);
		refe.setTax(0.1);
		
		double ac = refe.findMoney();
		double ex = 810;
		
		assertNotEquals(ex, ac, 0);
	}
}
