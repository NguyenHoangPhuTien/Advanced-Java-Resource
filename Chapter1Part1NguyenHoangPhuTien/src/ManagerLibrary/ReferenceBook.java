package ManagerLibrary;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 21/8/2016.
 * Version : 1.0.
 * Class about information reference book.
 * This class extend by book class.
 */

public class ReferenceBook extends Book{
	
	double tax;

	public ReferenceBook() {
		super();
	}

	public ReferenceBook(String code, String name, String dateImport,
			double price, int quantity, String manufacturer, double tax) {
		super(code, name, dateImport, price, quantity, manufacturer);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	/*
	 * Get full information of reference book.
	 * Return result as a string type.
	 */
	@Override
	public String toString() {
		return "ReferenceBook tax : " + tax + ", code : " + code + ", name : "
				+ name + ", dateImport : " + dateImport + ", price : " + price
				+ ", quantity : " + quantity + ", manufacturer : " + manufacturer;
	}
	
	public double findMoney(){
		
		double money = 0;
		money = (quantity * price) + (quantity * price)* tax;
		return money;
	}
}
