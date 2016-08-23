package ShapeInformation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class MainShape {

	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("1.Circle");
			System.out.println("2.Rectangle");
			System.out.println("3.Square");
			System.out.println("Please choice 1 or 2 or 3");
			int choice = Integer.parseInt(buff.readLine());
			switch(choice){
				case 1:
					System.out.println("Input radius");
					double radius = Double.parseDouble(buff.readLine());
					Circle circle = new Circle(radius);
					System.out.println("Perimeter: " + circle.perimeter());
					System.out.println("Area: " + circle.area());
					break;
				case 2:
					System.out.println("Input weight: ");
					double weight = Double.parseDouble(buff.readLine());
					System.out.println("Input height: ");
					double height = Double.parseDouble(buff.readLine());
					Rectangle  rectangle = new Rectangle(weight, height);
					System.out.println("Perimeter: " + rectangle.perimeter());
					System.out.println("Area: " + rectangle.area());
					break;
				case 3:
					System.out.println("Input weight: ");
					double heightSquare = Double.parseDouble(buff.readLine());
					Square square = new Square(heightSquare);
					System.out.println("Perimeter: " + square.perimeter());
					System.out.println("Area: " + square.area());
					break;
				default:
					System.out.println("Please choice 1 or 2 or 3");
			}
		} catch (NumberFormatException | IOException | InputMismatchException e) {
			
			System.out.println(e.getMessage());
		}
		
	}
}
