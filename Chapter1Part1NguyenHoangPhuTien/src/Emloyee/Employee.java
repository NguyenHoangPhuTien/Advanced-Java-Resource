package Emloyee;
import java.text.DecimalFormat;


public class Employee implements iSalary{

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 19/8/2016.
	 * Version : 1.
	 * Class of employee.
	 */
	
	String name;
	double coefSalary;
	int numOfDepend; // Number person depend 
	double bonus;
	final double BASESALARY = 1260000;
	final double DEFAULT_1 = 9000000;
	final double DEFAULT_2 = 3600000;
	
	DecimalFormat df = new DecimalFormat("#.000");
	
	public Employee() {
		super();
	}

	public Employee(String name, double coefSalary, int numOfDepend,
			double bonus) {
		super();
		this.name = name;
		this.coefSalary = coefSalary;
		this.numOfDepend = numOfDepend;
		this.bonus = bonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCoefSalary() {
		return coefSalary;
	}

	public void setCoefSalary(double coefSalary) {
		this.coefSalary = coefSalary;
	}

	public int getNumOfDepend() {
		return numOfDepend;
	}

	public void setNumOfDepend(int numOfDepend) {
		this.numOfDepend = numOfDepend;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	/*
	 * Find income of employee.
	 * Return income of employee as double type
	 */
	@Override
	public double findIncome() {
		
		double income = this.getCoefSalary() * this.BASESALARY + this.getBonus();
		return income;
	}

	/*
	 * Find taxable income of employee.
	 * Return taxable income of employee as double type
	 */
	@Override
	public double findTaxableIncome() {
		
		double taxableIncome = this.findIncome() - DEFAULT_1 - this.getNumOfDepend() * DEFAULT_2;
		return taxableIncome;
	}

	/*
	 * Find personal income tax of employee.
	 * Return personal income tax of employee as double type
	 */
	@Override
	public double findPersonalIncomeTax() {
		
		double taxIncome = this.findTaxableIncome();
		double result = 0;
		
		if(taxIncome < EnumRateTax.LEVEL1.getRangeTax())
			result = taxIncome * EnumRateTax.LEVEL1.getSalaryTax();
		else if(taxIncome < EnumRateTax.LEVEL2.getRangeTax())
			result = (taxIncome - EnumRateTax.LEVEL1.getRangeTax()) * EnumRateTax.LEVEL2.getSalaryTax()
						+ EnumRateTax.LEVEL1.getMaxOfTax();
		else if(taxIncome < EnumRateTax.LEVEL3.getRangeTax())
			result = (taxIncome - EnumRateTax.LEVEL2.getRangeTax()) * EnumRateTax.LEVEL3.getSalaryTax()
						+ EnumRateTax.LEVEL2.getMaxOfTax() + EnumRateTax.LEVEL1.getMaxOfTax();
		else if(taxIncome < EnumRateTax.LEVEL4.getRangeTax())
			result = (taxIncome - EnumRateTax.LEVEL3.getRangeTax()) * EnumRateTax.LEVEL4.getSalaryTax()
						+ EnumRateTax.LEVEL3.getMaxOfTax() + EnumRateTax.LEVEL2.getMaxOfTax()
						+ EnumRateTax.LEVEL1.getMaxOfTax();
		else if(taxIncome < EnumRateTax.LEVEL5.getRangeTax())
			result = (taxIncome - EnumRateTax.LEVEL4.getRangeTax()) * EnumRateTax.LEVEL5.getSalaryTax()
						+ EnumRateTax.LEVEL4.getMaxOfTax() + EnumRateTax.LEVEL3.getMaxOfTax()
						+ EnumRateTax.LEVEL2.getMaxOfTax() + EnumRateTax.LEVEL1.getMaxOfTax();
		else if(taxIncome < EnumRateTax.LEVEL6.getRangeTax())
			result = (taxIncome - EnumRateTax.LEVEL5.getRangeTax()) * EnumRateTax.LEVEL6.getSalaryTax()
						+ EnumRateTax.LEVEL5.getMaxOfTax() + EnumRateTax.LEVEL4.getMaxOfTax()
						+ EnumRateTax.LEVEL3.getMaxOfTax() + EnumRateTax.LEVEL2.getMaxOfTax()
						+ EnumRateTax.LEVEL1.getMaxOfTax();
		else
			result = (taxIncome - EnumRateTax.LEVEL7.getRangeTax()) * EnumRateTax.LEVEL7.getSalaryTax()
						+ EnumRateTax.LEVEL6.getMaxOfTax() + EnumRateTax.LEVEL1.getMaxOfTax()
						+ EnumRateTax.LEVEL5.getMaxOfTax() + EnumRateTax.LEVEL4.getMaxOfTax()
						+ EnumRateTax.LEVEL3.getMaxOfTax() + EnumRateTax.LEVEL2.getMaxOfTax();
						
		return result;
	}

	/*
	 * Find real earning of employee.
	 * Return real earning of employee as double type
	 */
	@Override
	public double findRealEarning() {
		// TODO Auto-generated method stub
		double result = this.findIncome() - this.findPersonalIncomeTax();
		return result;
	}
	
	
	
}
