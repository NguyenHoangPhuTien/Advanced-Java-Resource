package Geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;


public class MainTestCoordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.println("Enter point A of first coordinate: ");
			int pointA = Integer.parseInt(buff.readLine());
			
			System.out.println("Enter point B of first coordinate: ");
			int pointB = Integer.parseInt(buff.readLine());
			
			
			System.out.println("Enter point A of second coordinate: ");
			int pointA_1 = Integer.parseInt(buff.readLine());
			
			System.out.println("Enter point B of second coordinate: ");
			int pointB_1 = Integer.parseInt(buff.readLine());
			
			Coordinate firstCoordinate = new Coordinate(pointA,pointB);
			Coordinate secondCoordinate = new Coordinate(pointA_1,pointB_1);
			
			Distance distance = new Distance(firstCoordinate,secondCoordinate);
			double result = distance.getDistance2Point();
			
			System.out.println("Distance of 2 coordinate: "+result);
		} catch (NumberFormatException | IOException | NullPointerException 
				| InputMismatchException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
