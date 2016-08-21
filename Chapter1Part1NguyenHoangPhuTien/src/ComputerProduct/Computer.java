package ComputerProduct;

public class Computer {

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 21/8/2016.
	 * Version : 1.
	 * Class information of Computer.
	 */
	
	String numberProduct;
	String manufacturer;
	double price;
	int numberImport;
	
	public Computer() {
		super();
	}

	public Computer(String numberProduct, String manufacturer, double price, int numberImport) {
		super();
		this.numberProduct = numberProduct;
		this.manufacturer = manufacturer;
		this.price = price;
		this.numberImport = numberImport;
	}

	public String getNumberProduct() {
		return numberProduct;
	}

	public void setNumberProduct(String numberProduct) {
		this.numberProduct = numberProduct;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumberImport() {
		return numberImport;
	}

	public void setNumberImport(int numberImport) {
		this.numberImport = numberImport;
	}

	/*
	 * Get full information of product.
	 * Return result as string type.
	 */
	@Override
	public String toString() {
		return "Computer : numberProduct : " + numberProduct + ", manufacturer : " + manufacturer + ", price : " + price
				+ ", numberImport : " + numberImport;
	}
	
	/*
	 * Get total money of product.
	 * Return result as string type.
	 */
	public double findTotalMoney(){
		
		return price * numberImport;
	}
	
}
