package VehicleInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Version 1.0.
 * Date : 23/8/2016
 * Class about vehicle
 */
public abstract class Vehicle {

	String name;
	String manufacturer;
	String color;
	String owner;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String name, String manufacturer, String color, String owner) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.color = color;
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public abstract String toString();
	
	
}
