package Emloyee;

public enum EnumRateTax {
	
	LEVEL1(0.05,5000000, 250000),
	LEVEL2(0.1, 10000000, 500000),
	LEVEL3(0.15, 18000000, 1200000),
	LEVEL4(0.2, 32000000, 2800000),
	LEVEL5(0.25, 52000000, 5000000),
	LEVEL6(0.3, 80000000, 8400000),
	LEVEL7(0.35, 80000001, 99999999);
	
	private double salaryTax;
	private double rangeTax;
	private double maxOfTax;
	
	private EnumRateTax(double salaryTax, double rangeTax, double maxOfTax) {
		this.salaryTax = salaryTax;
		this.rangeTax = rangeTax;
		this.maxOfTax = maxOfTax;
	}

	public double getSalaryTax() {
		return salaryTax;
	}

	public void setSalaryTax(double salaryTax) {
		this.salaryTax = salaryTax;
	}

	public double getRangeTax() {
		return rangeTax;
	}

	public void setRangeTax(double rangeTax) {
		this.rangeTax = rangeTax;
	}

	public double getMaxOfTax() {
		return maxOfTax;
	}

	public void setMaxOfTax(double maxOfTax) {
		this.maxOfTax = maxOfTax;
	}
	
	
	
	
}
