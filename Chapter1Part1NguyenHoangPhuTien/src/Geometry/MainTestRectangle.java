package Geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;


public class MainTestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			System.out.println("Enter point A of A coordinate: ");
			int pointA = Integer.parseInt(buff.readLine());
			
			System.out.println("Enter point B of A coordinate: ");
			int pointB = Integer.parseInt(buff.readLine());
			
			
			System.out.println("Enter point A of C coordinate: ");
			int pointA_1 = Integer.parseInt(buff.readLine());
			
			
			System.out.println("Enter point B of C coordinate: ");
			int pointB_1 = Integer.parseInt(buff.readLine());
			
			if(pointB == pointB_1)
				System.out.println("This is not rectangle");
			else{
				Coordinate a = new Coordinate(pointA,pointB);
				Coordinate c = new Coordinate(pointA_1,pointB_1);
				
				Rectangle rec = new Rectangle(a, c);
				
				double perimiter = rec.findPerimeter();
				double area = rec.findArea();
				
				System.out.println("Peremiter of rectangle : "+perimiter);
				System.out.println("Area of rectangle : "+area);
			}
			
		} catch (NumberFormatException | IOException | NullPointerException 
				| InputMismatchException e) {
			
			e.printStackTrace();
		}
	}

}
