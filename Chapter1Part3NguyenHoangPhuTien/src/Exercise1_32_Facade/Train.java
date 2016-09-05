package Exercise1_32_Facade;

/*
 * Nguyen Hoang Phu Tien
 * Date : 5/9/2016
 * Version: 1.0
 * Class about information Book Train
 * Extend form Vehicle
 */
public class Train extends Vehicle implements IGetInformation{

	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Train(String dateFrom, String dateTo, String location) {
		super(dateFrom, dateTo, location);
		// TODO Auto-generated constructor stub
	}

	/*
	 * Get information about Book Plane
	 * Return result as a String type
	 */
	@Override
	public String toString() {
		return "Train [dateFrom=" + dateFrom + ", dateTo=" + dateTo
				+ ", location=" + location + "]";
	}


	/*
	 * Compare between two objects
	 * Return result as a boolean type
	 */
	public boolean equals(Train train) {
		if(this.dateFrom.equals(train.dateFrom) && this.dateTo.equals(train.dateTo)
				 && this.location.equals(train.location))
			return true;
		else 
			return false;
				
	}

	
	
}
