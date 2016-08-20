package UnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import Emloyee.Employee;

public class EmployeeSalaryTaxTest {

	Employee emp = new Employee();

	/*
	 * Author : Nguyen Hoang Phu Tien. Date : 19/8/2016. Version : 1. Test for
	 * find income tax, real earning, income, personal income tax. Output :
	 * return array include income tax, real earning, income, personal income
	 * tax.
	 */
	@Test
	public void test1() {

		emp.setName("nguyen van a");
		emp.setCoefSalary(2.67);
		emp.setNumOfDepend(1);
		emp.setBonus(12000000);

		String income = String.format("%.2f", emp.findIncome());
		double incomeTax = emp.findTaxableIncome();
		double personal = emp.findPersonalIncomeTax();
		String real = String.format("%.2f", emp.findRealEarning());
		
		Object[] ac = {income, incomeTax, personal, real};
		Object[] ex = { "15364200.00", 2764200.0, 138210.0, "15225990.00"};
		
		assertArrayEquals(ex, ac);
		
	}
	
	@Test
	public void test2() {

		emp.setName("nguyen van a");
		emp.setCoefSalary(1.67);
		emp.setNumOfDepend(1);
		emp.setBonus(12000000);

		String income = String.format("%.2f", emp.findIncome());
		double incomeTax = emp.findTaxableIncome();
		double personal = emp.findPersonalIncomeTax();
		String real = String.format("%.2f", emp.findRealEarning());
		
		Object[] ac = {income, incomeTax, personal, real};
		Object[] ex = { "14104200.00", 1504200.0, 75210.0, "14028990.00"};
		
		assertArrayEquals(ex, ac);
		
	}
	
	@Test
	public void test3() {

		emp.setName("nguyen van a");
		emp.setCoefSalary(1.0);
		emp.setNumOfDepend(1);
		emp.setBonus(12000000);

		String income = String.format("%.2f", emp.findIncome());
		double incomeTax = emp.findTaxableIncome();
		double personal = emp.findPersonalIncomeTax();
		String real = String.format("%.2f", emp.findRealEarning());
		
		Object[] ac = {income, incomeTax, personal, real};
		Object[] ex = { "13260000.00", 660000.0, 33000.0, "13227000.00"};
		
		assertArrayEquals(ex, ac);
		
	}

	@Test
	public void test4() {

		emp.setName("nguyen van a");
		emp.setCoefSalary(2.0);
		emp.setNumOfDepend(1);
		emp.setBonus(12000000);

		String income = String.format("%.2f", emp.findIncome());
		double incomeTax = emp.findTaxableIncome();
		double personal = emp.findPersonalIncomeTax();
		String real = String.format("%.2f", emp.findRealEarning());
		
		Object[] ac = {income, incomeTax, personal, real};
		Object[] ex = { "14520000.00",1920000.0, 96000.0, "14424000.00"};
		
		assertArrayEquals(ex, ac);
		
	}
	@Test
	public void test5() {

		emp.setName("nguyen van a");
		emp.setCoefSalary(1.5);
		emp.setNumOfDepend(1);
		emp.setBonus(12000000);

		String income = String.format("%.2f", emp.findIncome());
		double incomeTax = emp.findTaxableIncome();
		double personal = emp.findPersonalIncomeTax();
		String real = String.format("%.2f", emp.findRealEarning());
		
		Object[] ac = {income, incomeTax, personal, real};
		Object[] ex = { "13890000.00", 1290000.0, 64500.0, "13825500.00"};
		
		assertArrayEquals(ex, ac);
		
	}
	
	@Test
	public void test6() {

		emp.setName("nguyen van a");
		emp.setCoefSalary(2.67);
		emp.setNumOfDepend(2);
		emp.setBonus(12000000);

		String income = String.format("%.2f", emp.findIncome());
		double incomeTax = emp.findTaxableIncome();
		double personal = emp.findPersonalIncomeTax();
		String real = String.format("%.2f", emp.findRealEarning());
		
		Object[] ac = {income, incomeTax, personal, real};
		Object[] ex = { "15364200.00", 2764200.0, 138210.0, "15225990.00"};
		
		assertArrayEquals(ex, ac);
		
	}
	
	@Test
	public void test7() {

		emp.setName("nguyen van a");
		emp.setCoefSalary(1.6);
		emp.setNumOfDepend(1);
		emp.setBonus(12000000);

		String income = String.format("%.2f", emp.findIncome());
		double incomeTax = emp.findTaxableIncome();
		double personal = emp.findPersonalIncomeTax();
		String real = String.format("%.2f", emp.findRealEarning());
		
		Object[] ac = {income, incomeTax, personal, real};
		Object[] ex = { "14104200.00", 1504200.0, 75210.0, "14028990.00"};
		
		assertArrayEquals(ex, ac);
		
	}
	
	@Test
	public void test8() {

		emp.setName("nguyen van a");
		emp.setCoefSalary(1.20);
		emp.setNumOfDepend(1);
		emp.setBonus(12000000);

		String income = String.format("%.2f", emp.findIncome());
		double incomeTax = emp.findTaxableIncome();
		double personal = emp.findPersonalIncomeTax();
		String real = String.format("%.2f", emp.findRealEarning());
		
		Object[] ac = {income, incomeTax, personal, real};
		Object[] ex = { "13260000.00", 660000.0, 33000.0, "13227000.00"};
		
		assertArrayEquals(ex, ac);
		
	}

	@Test
	public void test9() {

		emp.setName("nguyen van a");
		emp.setCoefSalary(2.2);
		emp.setNumOfDepend(1);
		emp.setBonus(12000000);

		String income = String.format("%.2f", emp.findIncome());
		double incomeTax = emp.findTaxableIncome();
		double personal = emp.findPersonalIncomeTax();
		String real = String.format("%.2f", emp.findRealEarning());
		
		Object[] ac = {income, incomeTax, personal, real};
		Object[] ex = { "14520000.00",1920000.0, 96000.0, "14424000.00"};
		
		assertArrayEquals(ex, ac);
		
	}
	@Test
	public void test10() {

		emp.setName("nguyen van a");
		emp.setCoefSalary(2.5);
		emp.setNumOfDepend(1);
		emp.setBonus(12000000);

		String income = String.format("%.2f", emp.findIncome());
		double incomeTax = emp.findTaxableIncome();
		double personal = emp.findPersonalIncomeTax();
		String real = String.format("%.2f", emp.findRealEarning());
		
		Object[] ac = {income, incomeTax, personal, real};
		Object[] ex = { "13890000.00", 1290000.0, 64500.0, "13825500.00"};
		
		assertArrayEquals(ex, ac);
		
	}
}
