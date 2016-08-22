package ManagerLibrary;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 21/8/2016.
 * Version : 1.0.
 * Class about information book.
 */

public class Book {

	String code;
	String name;
	String dateImport;
	double price;
	int quantity;
	String manufacturer;
	
	public Book() {
		super();
	}

	public Book(String code, String name, String dateImport, double price,
			int quantity, String manufacturer) {
		super();
		this.code = code;
		this.name = name;
		this.dateImport = dateImport;
		this.price = price;
		this.quantity = quantity;
		this.manufacturer = manufacturer;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateImport() {
		return dateImport;
	}

	public void setDateImport(String dateImport) {
		this.dateImport = dateImport;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	
	
}
