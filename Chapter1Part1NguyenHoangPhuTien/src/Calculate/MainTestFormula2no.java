package Calculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

import Equation.LinearEquation;

public class MainTestFormula2no {

	public static void main(String[] args) {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Input value of a: ");
			double a = Double.parseDouble(buff.readLine());

			System.out.println("Input value of b: ");
			double b = Double.parseDouble(buff.readLine());
			
			Forumula2no f2n = new Forumula2no(a, b);
			int cont = 1;
			int choice = 0;
			double result = 0;
			while(cont == 1){
				System.out.println("Option for Formula 2 numbers");
				System.out.println("1.Plus");
				System.out.println("2.Minus");
				System.out.println("3.Divide");
				System.out.println("4.Product");
				System.out.println("Please choice option(1/2/3/4)");
				choice = Integer.parseInt(buff.readLine());
				switch (choice){
					case 1:
						result = f2n.plus();
						System.out.println("Result of plus: "+result);
						System.out.println("Want to continue?");
						System.out.println("1.Continue");
						System.out.println("2.Quit");
						System.out.println("Please choice(1/2");
						choice = Integer.parseInt(buff.readLine());
						break;
					case 2:
						result = f2n.minus();
						System.out.println("Result of minus: "+result);
						System.out.println("Want to continue?");
						System.out.println("1.Continue");
						System.out.println("2.Quit");
						System.out.println("Please choice(1/2");
						choice = Integer.parseInt(buff.readLine());
						break;
					case 3:
						result = f2n.divide();
						System.out.println("Result of divide: "+result);
						System.out.println("Want to continue?");
						System.out.println("1.Continue");
						System.out.println("2.Quit");
						System.out.println("Please choice(1/2");
						choice = Integer.parseInt(buff.readLine());
						break;
					case 4:
						result = f2n.product();
						System.out.println("Result of product: "+result);
						break;
					default:
						System.out.println("Please choice 1 or 2 or 3 or 4");
				}
				System.out.println("Want to continue?");
				System.out.println("1.Continue");
				System.out.println("2.Quit");
				System.out.println("Please choice(1/2");
				cont = Integer.parseInt(buff.readLine());
			}
		} catch (NumberFormatException | IOException | InputMismatchException 
				| ArithmeticException e) {

			e.printStackTrace();
		}

	}

}
