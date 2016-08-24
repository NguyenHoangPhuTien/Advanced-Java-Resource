package GameWarUnitAndTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import WarGame.Infantryman;
import WarGame.Trooper;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 20/8/2016.
 * Version : 1.
 * Test method fight of class Infantryman.
 */

public class InfantrymanTest {

	
	
	Infantryman infi = new Infantryman();
	
	@Test
	public void test1() {
		infi.setName("nguyen van a");
		infi.setPower(10);
		infi.setWeapon("gun");
		
		infi.fight();
		int ac = infi.getPower();
		int ex = 8;
		assertEquals(ex, ac);
	}

	@Test
	public void test2() {
		infi.setName("nguyen van a");
		infi.setPower(7);
		infi.setWeapon("gun");
		
		infi.fight();
		int ac = infi.getPower();
		int ex = 5;
		assertEquals(ex, ac);
	}

	@Test
	public void test3() {
		infi.setName("nguyen van a");
		infi.setPower(3);
		infi.setWeapon("gun");
		
		infi.fight();
		int ac = infi.getPower();
		int ex = 1;
		assertEquals(ex, ac);
	}

	@Test
	public void test4() {
		infi.setName("nguyen van a");
		infi.setPower(0);
		infi.setWeapon("gun");
		
		infi.fight();
		int ac = infi.getPower();
		int ex = -2;
		assertEquals(ex, ac);
	}

	@Test
	public void test5() {
		infi.setName("nguyen van a");
		infi.setPower(12);
		infi.setWeapon("gun");
		
		infi.fight();
		int ac = infi.getPower();
		int ex = 10;
		assertEquals(ex, ac);
	}

	@Test
	public void test6() {
		infi.setName("nguyen van a");
		infi.setPower(10);
		infi.setWeapon("gun");
		
		infi.fight();
		int ac = infi.getPower();
		int ex = 17;
		assertNotEquals(ex, ac);
	}

	@Test
	public void test7() {
		infi.setName("nguyen van a");
		infi.setPower(7);
		infi.setWeapon("gun");
		
		infi.fight();
		int ac = infi.getPower();
		int ex = 3;
		assertNotEquals(ex, ac);
	}

	@Test
	public void test8() {
		infi.setName("nguyen van a");
		infi.setPower(3);
		infi.setWeapon("gun");
		
		infi.fight();
		int ac = infi.getPower();
		int ex = 11;
		assertNotEquals(ex, ac);
	}

	@Test
	public void test9() {
		infi.setName("nguyen van a");
		infi.setPower(0);
		infi.setWeapon("gun");
		
		infi.fight();
		int ac = infi.getPower();
		int ex = -13;
		assertNotEquals(ex, ac);
	}

	@Test
	public void test10() {
		infi.setName("nguyen van a");
		infi.setPower(12);
		infi.setWeapon("gun");
		
		infi.fight();
		int ac = infi.getPower();
		int ex = 91;
		assertNotEquals(ex, ac);
	}
}