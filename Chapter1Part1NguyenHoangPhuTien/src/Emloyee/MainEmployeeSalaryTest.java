package Emloyee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class MainEmployeeSalaryTest {

	public static void main(String[] args) {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Input employee name: ");
		try {
			String name = buff.readLine();
			System.out.println("Input coefficients salary of employee: ");
			double coefSalary = Double.parseDouble(buff.readLine());
			if (coefSalary < 0)
				System.out.println("coefficients salary can not be less 0");
			else {
				System.out.println("Input number of person depend: ");
				int number = Integer.parseInt(buff.readLine());
				if (number < 0)
					System.out.println("number of person can not be less 0");
				else {
					System.out.println("Input bonus salary of employee: ");
					double bonus = Double.parseDouble(buff.readLine());
					if (bonus < 0)
						System.out.println("bonus of salary can not be less 0");
					else {
						Employee employee = new Employee(name, coefSalary, number, bonus);
						System.out.println(String.format("Income: %.2f", employee.findIncome()));
						System.out.println("Taxable income: " + employee.findTaxableIncome());
						System.out.println("Personal income tax: " + employee.findPersonalIncomeTax());
						System.out.println(String.format("Real earning: %.2f", employee.findRealEarning()));
					}
				}
			}
		} catch (IOException | NumberFormatException | InputMismatchException | NullPointerException e) {
			e.printStackTrace();
		}

	}
}
