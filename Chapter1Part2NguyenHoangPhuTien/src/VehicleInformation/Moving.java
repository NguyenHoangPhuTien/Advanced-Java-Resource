package VehicleInformation;

public abstract class Moving {

	double distance;
	
	public Moving() {
		super();
	}

	public Moving(double distance) {
		super();
		this.distance = distance;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
}
