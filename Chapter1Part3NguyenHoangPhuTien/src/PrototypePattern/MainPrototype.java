package PrototypePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;




public class MainPrototype {
	
	public static void main(String[] args) {
		
		ShapeCache.loadCache();
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
		System.out.println("3.Square");
		
		System.out.println("Please choice option (1 or 2 or 3)");
		try {
			Shape shape = null;
			int choice = Integer.parseInt(buff.readLine());
			switch (choice) {
			case 1:
				shape = (Shape) ShapeCache.getShape("1");
				break;
				
			case 2:
				shape = (Shape) ShapeCache.getShape("2");
				break;
			case 3:
				shape = (Shape) ShapeCache.getShape("3");
				break;
			}
			System.out.println(shape.getType());
		} catch (NumberFormatException | IOException | InputMismatchException e) {
			System.out.println(e.getMessage());
		}

	}

}
