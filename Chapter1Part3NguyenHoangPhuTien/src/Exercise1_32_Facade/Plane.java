package Exercise1_32_Facade;

/*
 * Nguyen Hoang Phu Tien
 * Date : 5/9/2016
 * Version: 1.0
 * Class about information Book Plane
 * Extend form Vehicle
 */
public class Plane extends Vehicle implements IGetInformation{

	public Plane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Plane(String dateFrom, String dateTo, String location) {
		super(dateFrom, dateTo, location);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Get information about Book Plane
	 * Return result as a String type
	 */
	@Override
	public String toString() {
		return "Plane [dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ ", location=" + location + "]";
	}


	/*
	 * Compare between two objects
	 * Return result as a boolean type
	 */
	public boolean equals(Plane plane) {
		if(this.dateFrom.equals(plane.dateFrom) && this.dateTo.equals(plane.dateTo)
				 && this.location.equals(plane.location))
			return true;
		else 
			return false;
				
	}

}
