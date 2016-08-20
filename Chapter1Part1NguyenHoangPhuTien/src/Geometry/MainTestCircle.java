package Geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.InputMismatchException;


public class MainTestCircle {
	

	public static void main(String[] args) {
		
				BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
				
				
				try {
					System.out.println("Enter point A of O coordinate: ");
					int pointA = Integer.parseInt(buff.readLine());
					
					System.out.println("Enter point B of O coordinate: ");
					int pointB = Integer.parseInt(buff.readLine());
					
					
					System.out.println("Enter point A of R coordinate: ");
					int pointA_1 = Integer.parseInt(buff.readLine());
					
					System.out.println("Enter point B of R coordinate: ");
					int pointB_1 = Integer.parseInt(buff.readLine());
					
					Coordinate o = new Coordinate(pointA,pointB);
					Coordinate r = new Coordinate(pointA_1,pointB_1);
					
					Distance distance = new Distance(o, r);
					Circle circle = new Circle(distance);
					
					double perimiter = circle.findPerimeter();
					double area = circle.findArea();
					
					System.out.println("Peremiter of circle : "+perimiter);
					System.out.println("Area of circle : "+area);
					
				} catch (NumberFormatException | IOException | NullPointerException 
						| InputMismatchException e) {
					
					e.printStackTrace();
				}

	}

}
