package MusicInformation;

/**
 * @author Nguyen Hoang Phu Tien
 * Class about information instrument
 * Version 1.0.
 */

public abstract class Instrument{

	String name;
	String manufacturer;
	
	public Instrument() {
		super();
	}

	public Instrument(String name, String manufacturer) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
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
	
	public abstract String play();
}
