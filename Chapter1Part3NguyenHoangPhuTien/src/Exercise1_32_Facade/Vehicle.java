package Exercise1_32_Facade;

/*
 * Nguyen Hoang Phu Tien
 * Date : 5/9/2016
 * Version: 1.0
 * Class about information Vehicle
 */
public abstract class Vehicle {

	public String dateFrom;
	public String dateTo;
	public String location;
	
	public Vehicle() {
		super();
	}

	public Vehicle(String dateFrom, String dateTo, String location) {
		super();
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.location = location;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
