package VehicleInformation;

public class MovingByFuel extends Moving{

	double fuel;

	public MovingByFuel() {
		super();
	}

	public MovingByFuel(double distance, double fuel) {
		super(distance);
		this.fuel = fuel;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
}
