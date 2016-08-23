package VehicleInformation;

public class MovingByTime extends Moving{

	double time;

	public MovingByTime() {
		super();
	}
	
	public MovingByTime(double distance, double time) {
		super(distance);
		this.time = time;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	
}
