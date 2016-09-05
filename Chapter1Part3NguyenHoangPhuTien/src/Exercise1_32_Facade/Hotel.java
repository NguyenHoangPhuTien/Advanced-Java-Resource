package Exercise1_32_Facade;

/*
 * Nguyen Hoang Phu Tien
 * Date : 5/9/2016
 * Version: 1.0
 * Class about information Hotel
 */
public class Hotel implements IGetInformation{

	private String dateCheckIn;
	private String dateCheckOut;
	private String location;
	
	public Hotel() {
		super();
	}

	public Hotel(String dateCheckIn, String dateCheckOut, String location) {
		super();
		this.dateCheckIn = dateCheckIn;
		this.dateCheckOut = dateCheckOut;
		this.location = location;
	}

	public String getDateCheckIn() {
		return dateCheckIn;
	}

	public void setDateCheckIn(String dateCheckIn) {
		this.dateCheckIn = dateCheckIn;
	}

	public String getDateCheckOut() {
		return dateCheckOut;
	}

	public void setDateCheckOut(String dateCheckOut) {
		this.dateCheckOut = dateCheckOut;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	/*
	 * Get information of Hotel
	 * Return result as a String type
	 */
	@Override
	public String toString() {
		return "Hotel [dateCheckIn=" + dateCheckIn + ", dateCheckOut="
				+ dateCheckOut + ", location=" + location + "]";
	}

	/*
	 * Compare between two objects
	 * Return result as a boolean type
	 */
	public boolean equals(Hotel hotel) {
		if(this.dateCheckIn.equals(hotel.dateCheckIn) && this.dateCheckOut.equals(hotel.dateCheckOut)
				 && this.location.equals(hotel.location))
			return true;
		else 
			return false;
				
	}
	
	
	
}
