package Exercise1_32_Facade;

import java.util.ArrayList;
import java.util.List;

/*
 * Nguyen Hoang Phu Tien
 * Date : 5/9/2016
 * Version: 1.0
 * Class about information Hotel
 */
public class BookFacade {

	List<Hotel> listHotel;
	List<Plane> listPlane;
	List<Train> listTrain;

	public BookFacade() {
		super();
	}

	public BookFacade(List<Hotel> listHotel, List<Plane> listPlane,
			List<Train> listTrain) {
		super();
		this.listHotel = listHotel;
		this.listPlane = listPlane;
		this.listTrain = listTrain;
	}

	public List<Hotel> getListHotel() {
		return listHotel;
	}

	public void setListHotel(List<Hotel> listHotel) {
		this.listHotel = listHotel;
	}

	public List<Plane> getListPlane() {
		return listPlane;
	}

	public void setListPlane(List<Plane> listPlane) {
		this.listPlane = listPlane;
	}

	public List<Train> getListTrain() {
		return listTrain;
	}

	public void setListTrain(List<Train> listTrain) {
		this.listTrain = listTrain;
	}

	/*
	 * Get a list contain objects have states same as input value
	 * Return result as a list of Object
	 */
	public List<Object> search(String from, String to, String location){
		
		List<Object> list = new ArrayList<Object>();
		for(Hotel hotel : listHotel){
			
			Hotel hotelDemo = new Hotel(from, to, location);
			if(hotel.equals(hotelDemo) == true)
				list.add(hotel);
		}
		
		for(Plane plane : listPlane){
			Plane planeDemo = new Plane(from, to, location);
			if(plane.equals(planeDemo) == true)
				list.add(plane);
		}
		
		for(Train train : listTrain){
			Train trainDemo = new Train(from, to, location);
			if(train.equals(trainDemo)  == true)
				list.add(train);
		}
		return list;
		
	}

	
}
