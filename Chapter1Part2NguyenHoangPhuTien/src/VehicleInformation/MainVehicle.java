package VehicleInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MainVehicle {

	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int cont = 1;
			Car[] listCar = new Car[0];
			Ship[] listShip = new Ship[0];
			while(cont == 1){
				System.out.println("Input name: ");
				String name = buff.readLine();
				System.out.println("Input owner: ");
				String owner = buff.readLine();
				System.out.println("Input manufacturer: ");
				String manufacturer = buff.readLine();
				System.out.println("Input color: ");
				String color = buff.readLine();
				System.out.println("Input distance: ");
				double distance = Double.parseDouble(buff.readLine());
				System.out.println("Input fuel consumption: ");
				double fuelConsumption = Double.parseDouble(buff.readLine());
				System.out.println("Input time: ");
				double time = Double.parseDouble(buff.readLine());
				MovingByFuel moveFuel = new MovingByFuel(distance, fuelConsumption);
				MovingByTime moveTime = new MovingByTime(distance, time);
				System.out.println("1.Car");
				System.out.println("2.Ship");
				System.out.println("Please choice 1 or 2");
				int choice = Integer.parseInt(buff.readLine());
				switch (choice) {
					case 1:
						System.out.println("Input gear type: ");
						String gear = buff.readLine();
						System.out.println("Input type of car: ");
						String type = buff.readLine();
						Car car = new Car(name, manufacturer, color, owner, gear, type);
						car.setTime(moveTime);
						car.setFuel(moveFuel);
						listCar = Arrays.copyOf(listCar, listCar.length + 1);
						listCar[listCar.length - 1] = car;
						break;
					case 2:
						System.out.println("Input weight: ");
						double weight = Double.parseDouble(buff.readLine());
						System.out.println("Input capacity: ");
						double capacity = Double.parseDouble(buff.readLine());
						System.out.println("Input downStream: ");
						double downStream = Double.parseDouble(buff.readLine());
						System.out.println("Input upStream: ");
						double upStream = Double.parseDouble(buff.readLine());
						System.out.println("Input fuel consumption start: ");
						double fuelStart = Double.parseDouble(buff.readLine());
						System.out.println("Input fuel type: ");
						String fuelTye = buff.readLine();
						Ship ship = new Ship(name, manufacturer, color, owner, weight, capacity, downStream, upStream, fuelStart, fuelTye);
						ship.setTime(moveTime);
						ship.setFuel(moveFuel);
						listShip = Arrays.copyOf(listShip, listShip.length + 1);
						listShip[listShip.length - 1] = ship;
						break;
						
					default:
						System.out.println("Please choice 1 or 2");
				}
				System.out.println("1.Continue");
				System.out.println("2.Quit");
				System.out.println("Please choice 1 or 2");
				int choiceCont = Integer.parseInt(buff.readLine());
				if(choiceCont != 1)
					cont = 0;
			}
			if(listCar.length > 0){
				for(Car car : listCar){
					System.out.println("Speed of car: " + car.getSpeed());
					System.out.println("Fuel consumption: " + car.findConsumptionFuel());
				}
			}
			if(listShip.length > 0){
				for(Ship ship : listShip){
					System.out.println("Speed of ship: " + ship.getSpeed());
					System.out.println("Fuel consumption: " + ship.findConsumptionFuel());
				}
			}
		} catch (IOException | NumberFormatException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
