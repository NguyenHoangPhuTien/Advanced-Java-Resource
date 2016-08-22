package ManagerLibraryUnitAndTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import ManagerLibrary.TextBook;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 22/8/2016.
 * Version : 1.0.
 * Test for get money of text book.
 * Return result as double type.
 */

public class TextBookUnitTest {

	TextBook text = new TextBook();
	
	@Test
	public void test1() {
		text.setCode("001");
		text.setManufacturer("kim dong");
		text.setDateImport("28/8");
		text.setName("abc");
		text.setPrice(200);
		text.setQuantity(1);
		text.setStatus("New");
		
		double ac = text.findMoney();
		double ex = 200;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test2() {
		text.setCode("001");
		text.setManufacturer("kim dong");
		text.setDateImport("28/8");
		text.setName("abc");
		text.setPrice(200);
		text.setQuantity(2);
		text.setStatus("New");
		
		double ac = text.findMoney();
		double ex = 400;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test3() {
		text.setCode("001");
		text.setManufacturer("kim dong");
		text.setDateImport("28/8");
		text.setName("abc");
		text.setPrice(200);
		text.setQuantity(1);
		text.setStatus("Old");
		
		double ac = text.findMoney();
		double ex = 100;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test4() {
		text.setCode("001");
		text.setManufacturer("kim dong");
		text.setDateImport("28/8");
		text.setName("abc");
		text.setPrice(200);
		text.setQuantity(2);
		text.setStatus("Old");
		
		double ac = text.findMoney();
		double ex = 200;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test5() {
		text.setCode("001");
		text.setManufacturer("kim dong");
		text.setDateImport("28/8");
		text.setName("abc");
		text.setPrice(200);
		text.setQuantity(3);
		text.setStatus("Old");
		
		double ac = text.findMoney();
		double ex = 300;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		text.setCode("001");
		text.setManufacturer("kim dong");
		text.setDateImport("28/8");
		text.setName("abc");
		text.setPrice(200);
		text.setQuantity(1);
		text.setStatus("New");
		
		double ac = text.findMoney();
		double ex = 1200;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test7() {
		text.setCode("001");
		text.setManufacturer("kim dong");
		text.setDateImport("28/8");
		text.setName("abc");
		text.setPrice(200);
		text.setQuantity(2);
		text.setStatus("New");
		
		double ac = text.findMoney();
		double ex = 1400;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test8() {
		text.setCode("001");
		text.setManufacturer("kim dong");
		text.setDateImport("28/8");
		text.setName("abc");
		text.setPrice(200);
		text.setQuantity(1);
		text.setStatus("Old");
		
		double ac = text.findMoney();
		double ex = 1100;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test9() {
		text.setCode("001");
		text.setManufacturer("kim dong");
		text.setDateImport("28/8");
		text.setName("abc");
		text.setPrice(200);
		text.setQuantity(2);
		text.setStatus("Old");
		
		double ac = text.findMoney();
		double ex = 1200;
		assertNotEquals(ex, ac, 0);
	}
	
	@Test
	public void test10() {
		text.setCode("001");
		text.setManufacturer("kim dong");
		text.setDateImport("28/8");
		text.setName("abc");
		text.setPrice(200);
		text.setQuantity(3);
		text.setStatus("Old");
		
		double ac = text.findMoney();
		double ex = 600;
		assertNotEquals(ex, ac, 0);
	}
}
