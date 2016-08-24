package VehicleInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about ship
 */

public class Ship extends Vehicle implements iSpeed,iGetComsumptionFuel{

	double weight;
	double capacity;
	double downStreamSpeed;
	double upStreamSpeed;
	double fuelConsumptionStart;
	String fuelType;
	MovingByFuel fuel;
	MovingByTime time;
	
	public Ship() {
		super();
	}

	public Ship(String name, String manufacturer, String color, String owner,
			double weight, double capacity, double downStreamSpeed,
			double upStreamSpeed, double fuelConsumptionStart, String fuelType) {
		super(name, manufacturer, color, owner);
		this.weight = weight;
		this.capacity = capacity;
		this.downStreamSpeed = downStreamSpeed;
		this.upStreamSpeed = upStreamSpeed;
		this.fuelConsumptionStart = fuelConsumptionStart;
		this.fuelType = fuelType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getDownStreamSpeed() {
		return downStreamSpeed;
	}

	public void setDownStreamSpeed(double downStreamSpeed) {
		this.downStreamSpeed = downStreamSpeed;
	}

	public double getUpStreamSpeed() {
		return upStreamSpeed;
	}

	public void setUpStreamSpeed(double upStreamSpeed) {
		this.upStreamSpeed = upStreamSpeed;
	}

	public double getFuelConsumptionStart() {
		return fuelConsumptionStart;
	}

	public void setFuelConsumptionStart(double fuelConsumptionStart) {
		this.fuelConsumptionStart = fuelConsumptionStart;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public MovingByFuel getFuel() {
		return fuel;
	}

	public void setFuel(MovingByFuel fuel) {
		this.fuel = fuel;
	}

	public MovingByTime getTime() {
		return time;
	}

	public void setTime(MovingByTime time) {
		this.time = time;
	}

	/*
	 * Get full information of ship
	 * Return result as a string type
	 */
	@Override
	public String toString() {
		return "Ship [weight=" + weight + ", capacity=" + capacity
				+ ", downStreamSpeed=" + downStreamSpeed + ", upStreamSpeed="
				+ upStreamSpeed + ", fuelConsumptionStart="
				+ fuelConsumptionStart + ", fuelType=" + fuelType + ", name="
				+ name + ", manufacturer=" + manufacturer + ", color=" + color
				+ ", owner=" + owner + "]";
	}

	/*
	 * Get how many km with each hour
	 * Return result as double type
	 */
	@Override
	public double findConsumptionFuel() {
	
		return time.distance / time.time + upStreamSpeed - downStreamSpeed;
	}

	/*
	 * Get how many km witch each a liter of fuel
	 * Return result as double type
	 */
	@Override
	public double getSpeed() {
		return fuel.distance / (fuel.fuel - fuelConsumptionStart);
	}
	
	
}
