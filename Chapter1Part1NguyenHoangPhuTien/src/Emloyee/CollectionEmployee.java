package Emloyee;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 22/8/2016.
 * Version : 1.0.
 * Class information of collection employee.
 * This class extend by Employee class
 */

public class CollectionEmployee extends Employee{

	int quantityProduct;
	int limitProduct;
	double rateBonusSalary;
	
	public CollectionEmployee() {
		super();
	}

	public CollectionEmployee(String name, double coefSalary, int numOfDepend,
			double bonus, int quantityProduct, int limitProduct,
			double rateBonusSalary) {
		super(name, coefSalary, numOfDepend, bonus);
		this.quantityProduct = quantityProduct;
		this.limitProduct = limitProduct;
		this.rateBonusSalary = rateBonusSalary;
	}

	/*
	 * Get full information of collection employee.
	 * Return result as a string type.
	 */
	@Override
	public String toString() {
		return "CollectionEmployee quantityProduct : " + quantityProduct
				+ ", limitProduct : " + limitProduct + ", name : " + name
				+ ", coefSalary : " + coefSalary + ", numOfDepend : " + numOfDepend
				+ ", bonus : " + bonus + ", BASESALARY : " + BASESALARY
				+ ", DEFAULT_1 : n" + DEFAULT_1 + ", DEFAULT_2 : " + DEFAULT_2 + ",rateBonusSalary : " + rateBonusSalary;
	}
	
	/*
	 * Find bonus salary of collection employee.
	 * Return result as a double type.
	 */
	public double findBonusSalary(){
		
		double money = 0;
		if(quantityProduct > limitProduct)
			money = (quantityProduct - limitProduct) * rateBonusSalary;
		return money;
	}

	/*
	 * Find income of collection employee.
	 * Return income of employee as double type
	 */
	@Override
	public double findIncome() {
		
		return super.findIncome() + this.findBonusSalary();
	}
	
	
}
