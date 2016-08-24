package GameWarUnitAndTestSuite;

import static org.junit.Assert.*;

import org.junit.Test;

import WarGame.Trooper;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 20/8/2016.
 * Version : 1.
 * Test method fight of class Trooper.
 */

public class TrooperTest {
	
	Trooper troop = new Trooper();
	
	@Test
	public void test1() {
		troop.setName("nguyen van a");
		troop.setPower(10);
		troop.setWeapon("gun");
		
		troop.fight();
		int ac = troop.getPower();
		int ex = 7;
		assertEquals(ex, ac);
	}

	@Test
	public void test2() {
		troop.setName("nguyen van a");
		troop.setPower(7);
		troop.setWeapon("gun");
		
		troop.fight();
		int ac = troop.getPower();
		int ex = 4;
		assertEquals(ex, ac);
	}

	@Test
	public void test3() {
		troop.setName("nguyen van a");
		troop.setPower(3);
		troop.setWeapon("gun");
		
		troop.fight();
		int ac = troop.getPower();
		int ex = 0;
		assertEquals(ex, ac);
	}

	@Test
	public void test4() {
		troop.setName("nguyen van a");
		troop.setPower(0);
		troop.setWeapon("gun");
		
		troop.fight();
		int ac = troop.getPower();
		int ex = -3;
		assertEquals(ex, ac);
	}

	@Test
	public void test5() {
		troop.setName("nguyen van a");
		troop.setPower(12);
		troop.setWeapon("gun");
		
		troop.fight();
		int ac = troop.getPower();
		int ex = 9;
		assertEquals(ex, ac);
	}

	@Test
	public void test6() {
		troop.setName("nguyen van a");
		troop.setPower(10);
		troop.setWeapon("gun");
		
		troop.fight();
		int ac = troop.getPower();
		int ex = 17;
		assertNotEquals(ex, ac);
	}

	@Test
	public void test7() {
		troop.setName("nguyen van a");
		troop.setPower(7);
		troop.setWeapon("gun");
		
		troop.fight();
		int ac = troop.getPower();
		int ex = 3;
		assertNotEquals(ex, ac);
	}

	@Test
	public void test8() {
		troop.setName("nguyen van a");
		troop.setPower(3);
		troop.setWeapon("gun");
		
		troop.fight();
		int ac = troop.getPower();
		int ex = 1;
		assertNotEquals(ex, ac);
	}

	@Test
	public void test9() {
		troop.setName("nguyen van a");
		troop.setPower(0);
		troop.setWeapon("gun");
		
		troop.fight();
		int ac = troop.getPower();
		int ex = -13;
		assertNotEquals(ex, ac);
	}

	@Test
	public void test10() {
		troop.setName("nguyen van a");
		troop.setPower(12);
		troop.setWeapon("gun");
		
		troop.fight();
		int ac = troop.getPower();
		int ex = 91;
		assertNotEquals(ex, ac);
	}
}
