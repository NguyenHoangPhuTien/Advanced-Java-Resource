package VehicleInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about car
 */

public class Car extends Vehicle implements iSpeed,iGetComsumptionFuel{

	String gearType;
	String carType;
	MovingByTime time;
	MovingByFuel fuel;
	
	public Car() {
		super();
	}

	public Car(String name, String manufacturer, String color, String owner,
			String gearType, String carType) {
		super(name, manufacturer, color, owner);
		this.gearType = gearType;
		this.carType = carType;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public MovingByTime getTime() {
		return time;
	}

	public void setTime(MovingByTime time) {
		this.time = time;
	}

	public MovingByFuel getFuel() {
		return fuel;
	}

	public void setFuel(MovingByFuel fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Car gearType=" + gearType + ", carType=" + carType + ", name="
				+ name + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", owner=" + owner;
	}

	/*
	 * Get how many km with each hour
	 * Return result as double type
	 */
	@Override
	public double findConsumptionFuel() {
		return time.distance / time.time;
	}

	/*
	 * Get how many km witch each a liter of fuel
	 * Return result as double type
	 */
	@Override
	public double getSpeed() {
		return fuel.distance / fuel.fuel;
	}

	
	
}
