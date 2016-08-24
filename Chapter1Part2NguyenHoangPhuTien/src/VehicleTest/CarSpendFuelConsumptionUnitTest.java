package VehicleTest;

import static org.junit.Assert.*;

import org.junit.Test;

import VehicleInformation.Car;
import VehicleInformation.MovingByFuel;
import VehicleInformation.MovingByTime;

/*
 * Nguyen Hoang Phu Tien
 * Version 1.0
 * 24/8/2016
 * Test for speed and fuel consumption.
 */

public class CarSpendFuelConsumptionUnitTest {

	Car car = new Car();
	MovingByFuel fuel = new MovingByFuel();
	MovingByTime time = new MovingByTime();
	
	@Test
	public void test1() {
		car.setName("tien");
		car.setCarType("Honda");
		car.setOwner("Tien");
		car.setManufacturer("Honda");
		car.setColor("red");
		
		fuel.setDistance(1);
		fuel.setFuel(1);
		
		car.setFuel(fuel);
		car.setTime(time);
		
		double ac = car.findConsumptionFuel();
		double ex = 1;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test2() {
		car.setName("tien");
		car.setCarType("Honda");
		car.setOwner("Tien");
		car.setManufacturer("Honda");
		car.setColor("red");
		
		fuel.setDistance(2);
		fuel.setFuel(1);
		
		car.setFuel(fuel);
		car.setTime(time);
		
		double ac = car.findConsumptionFuel();
		double ex = 2;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test3() {
		car.setName("tien");
		car.setCarType("Honda");
		car.setOwner("Tien");
		car.setManufacturer("Honda");
		car.setColor("red");
		
		fuel.setDistance(3);
		fuel.setFuel(1);
		
		car.setFuel(fuel);
		
		double ac = car.findConsumptionFuel();
		double ex = 3;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test4() {
		car.setName("tien");
		car.setCarType("Honda");
		car.setOwner("Tien");
		car.setManufacturer("Honda");
		car.setColor("red");
		
		time.setDistance(1);
		time.setTime(1);
		
		car.setTime(time);
		
		double ac = car.getSpeed();
		double ex = 1;
		assertEquals(ex, ac, 0);
	}

	@Test
	public void test5() {
		car.setName("tien");
		car.setCarType("Honda");
		car.setOwner("Tien");
		car.setManufacturer("Honda");
		car.setColor("red");
		
		time.setDistance(2);
		time.setTime(1);
		
		car.setTime(time);
		
		double ac = car.getSpeed();
		double ex = 2;
		assertEquals(ex, ac, 0);
	}
	
	@Test
	public void test6() {
		car.setName("tien");
		car.setCarType("Honda");
		car.setOwner("Tien");
		car.setManufacturer("Honda");
		car.setColor("red");
		
		fuel.setDistance(1);
		fuel.setFuel(1);
		
		car.setFuel(fuel);
		car.setTime(time);
		
		double ac = car.findConsumptionFuel();
		double ex = 10;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test7() {
		car.setName("tien");
		car.setCarType("Honda");
		car.setOwner("Tien");
		car.setManufacturer("Honda");
		car.setColor("red");
		
		fuel.setDistance(2);
		fuel.setFuel(1);
		
		car.setFuel(fuel);
		car.setTime(time);
		
		double ac = car.findConsumptionFuel();
		double ex = 21;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test8() {
		car.setName("tien");
		car.setCarType("Honda");
		car.setOwner("Tien");
		car.setManufacturer("Honda");
		car.setColor("red");
		
		fuel.setDistance(3);
		fuel.setFuel(1);
		
		car.setFuel(fuel);
		
		double ac = car.findConsumptionFuel();
		double ex = 30;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test9() {
		car.setName("tien");
		car.setCarType("Honda");
		car.setOwner("Tien");
		car.setManufacturer("Honda");
		car.setColor("red");
		
		time.setDistance(1);
		time.setTime(12);
		
		car.setTime(time);
		
		double ac = car.getSpeed();
		double ex = 1;
		assertNotEquals(ex, ac, 0);
	}

	@Test
	public void test10() {
		car.setName("tien");
		car.setCarType("Honda");
		car.setOwner("Tien");
		car.setManufacturer("Honda");
		car.setColor("red");
		
		time.setDistance(2);
		time.setTime(10);
		
		car.setTime(time);
		
		double ac = car.getSpeed();
		double ex = 2;
		assertNotEquals(ex, ac, 0);
	}
}
