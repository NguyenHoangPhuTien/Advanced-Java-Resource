package SaleManagement;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 28-Aug-2016 9:49:28 AM
 * Class about information product
 */
public class Product {

	private String name;
	private double price;

	public Product(){

	}

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*
	 * Get full information of product 
	 * Return result as a String type
	 */
	@Override
	public String toString() {
		
		return String.format("name: %s price: %.2f", name, price);
	}
}