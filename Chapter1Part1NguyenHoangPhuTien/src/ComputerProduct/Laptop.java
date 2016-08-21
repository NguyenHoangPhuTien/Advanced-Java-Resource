package ComputerProduct;

public class Laptop extends Computer {

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 21/8/2016.
	 * Version : 1.
	 * Class information of Laptop.
	 * This class extend by Computer class.
	 */
	
	double weight;
	double batteryTime;
	double screenSize;
	
	public Laptop() {
		super();
	}

	public Laptop(String numberProduct, String manufacturer, double price, int numberImport, double weight,
			double batteryTime, double screenSize) {
		super(numberProduct, manufacturer, price, numberImport);
		this.weight = weight;
		this.batteryTime = batteryTime;
		this.screenSize = screenSize;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBatteryTime() {
		return batteryTime;
	}

	public void setBatteryTime(double batteryTime) {
		this.batteryTime = batteryTime;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	/*
	 * Get full information of product.
	 * Return result as string type.
	 */
	@Override
	public String toString() {
		return "Laptop weight : " + weight + ", batteryTime : " + batteryTime + ", screenSize : " + screenSize
				+ ", numberProduct : " + numberProduct + ", manufacturer : " + manufacturer + ", price : " + price
				+ ", numberImport : " + numberImport;
	}

	
	
	
}
