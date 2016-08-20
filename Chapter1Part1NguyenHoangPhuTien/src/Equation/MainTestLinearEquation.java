package Equation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class MainTestLinearEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Input value of a: ");
			double a = Double.parseDouble(buff.readLine());

			System.out.println("Input value of b: ");
			double b = Double.parseDouble(buff.readLine());

			LinearEquation le = new LinearEquation(a, b);

			double root = le.findRoot();

			if (root == 999999)
				System.out.println("Result has infinity");
			else if (root == -999999)
				System.out.println("Result has no more");
			else
				System.out.println("Result has " + root);
		} catch (NumberFormatException | IOException | InputMismatchException e) {

			e.printStackTrace();
		}

	}

}
