package Exercise1_32_Facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class MainFacade {

	public static void main(String[] args) {
		
		Hotel hotel_1 = new Hotel("12/01", "13/01", "HCM");
		Hotel hotel_2 = new Hotel("18/01", "19/01", "Nha Trang");
		List<Hotel> listHotel = new ArrayList<>();
		listHotel.add(hotel_1);
		listHotel.add(hotel_2);
		
		Train train_1 = new Train("12/01", "13/01", "HCM");
		Train train_2 = new Train("11/01", "12/01", "Nha Trang");
		List<Train> listTrain = new ArrayList<>();
		listTrain.add(train_1);
		listTrain.add(train_2);
		
		Plane plane_1 = new Plane("12/01", "13/01", "HCM");
		Plane plane_2 = new Plane("14/01", "15/01", "Nha Trang");
		List<Plane> listPlane = new ArrayList<>();
		listPlane.add(plane_1);
		listPlane.add(plane_2);
		
		
		
		BookFacade book = new BookFacade(listHotel, listPlane, listTrain);
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Input date from: ");
		try {
			String fromDate = input.readLine();
			System.out.println("Input date to: ");
			String toDate = input.readLine();
			System.out.println("Input location: ");
			String location = input.readLine();
			
			List<Object> list = book.search(fromDate, toDate, location);
			for(Object object : list){
				System.out.println(object.toString());
			}
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
