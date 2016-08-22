package Emloyee;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 22/8/2016.
 * Version : 1.0.
 * Class information of trade employee.
 * This class extend by Employee class
 */

public class TradeEmployee extends Employee{
	
	double tradeSalary;
	double rateSalary;
	
	public TradeEmployee() {
		super();
	}

	public TradeEmployee(String name, double coefSalary, int numOfDepend,
			double bonus, double tradeSalary, double rateSalary) {
		super(name, coefSalary, numOfDepend, bonus);
		this.tradeSalary = tradeSalary;
		this.rateSalary = rateSalary;
	}

	/*
	 * Get full information of trade employee.
	 * Return result as a string type.
	 */
	@Override
	public String toString() {
		return "TradeEmployee tradeSalary : " + tradeSalary + ", rateSalary : "
				+ rateSalary + ", name : " + name + ", coefSalary : " + coefSalary
				+ ", numOfDepend : " + numOfDepend + ", bonus : " + bonus
				+ ", BASESALARY : " + BASESALARY + ", DEFAULT_1 : " + DEFAULT_1
				+ ", DEFAULT_2 : " + DEFAULT_2;
	}
	
	/*
	 * Find bonus salary of trade employee.
	 * Return result as a double type.
	 */
	public double findBonusSalary(){
		
		return this.tradeSalary * this.rateSalary;
	}

	/*
	 * Find income of trade employee.
	 * Return income of employee as double type
	 */
	@Override
	public double findIncome() {
		
		return super.findIncome() + this.findBonusSalary();
	}
	
}
