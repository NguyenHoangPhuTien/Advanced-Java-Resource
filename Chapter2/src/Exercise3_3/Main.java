package Exercise3_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input radius: ");
		try {
			double radius = Double.parseDouble(input.readLine());
			
			Area circle = (double x1, double x2) -> x1 * Math.pow(x2, 2);
			System.out.println("Area of circle: " + circle.calArea(3.14, radius));
			
			System.out.println("Input height of rectangle: ");
			double height = Double.parseDouble(input.readLine());
			System.out.println("Input with of rectangle: ");
			double with = Double.parseDouble(input.readLine());
			Area rectangle = (double x1, double x2) -> x1 * x2;
			System.out.println("Area of rectangle: " + rectangle.calArea(height, with));
			
			System.out.println("Input with of square: ");
			double with1 = Double.parseDouble(input.readLine());
			Area square = (double x1, double x2) -> x1 * x2;
			System.out.println("Area of square: " + square.calArea(with1, with1));
			
		} catch (NumberFormatException | IOException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
