package FactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFactoryPattern {

	public static void main(String[] args) {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Square");
		
		System.out.println("Please choice option (1 or 2 or 3)");
		try {
			ShapeFactory shapeFactory = new ShapeFactory();
			Shape shape = null;
			int choice = Integer.parseInt(buff.readLine());
			switch (choice) {
			case 1:
				shape = shapeFactory.getShape("Circle");
				break;
				
			case 2:
				shape = shapeFactory.getShape("Rectangle");
				break;
			case 3:
				shape = shapeFactory.getShape("Square");
				break;
			}
			System.out.println(shape.draw());
		} catch (NumberFormatException | IOException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
