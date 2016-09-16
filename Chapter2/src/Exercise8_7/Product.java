package Exercise8_7;

import java.util.Date;

/*
 * Author: Nguyen Hoang Phu Tien
 * version: 1.0
 * date: 16/9/2016
 * Class for product
 */
public class Product {

	int id;
	String name;
	double price;
	int amount;
	String image;
	int categoryID;
	Date date;
	int onSell;
	
	public Product() {
		super();
	}

	public Product(int id, String name, double price, int amount, String image, int categoryID, Date date, int onSell) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.image = image;
		this.categoryID = categoryID;
		this.date = date;
		this.onSell = onSell;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getOnSell() {
		return onSell;
	}

	public void setOnSell(int onSell) {
		this.onSell = onSell;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", amount=" + amount + ", image=" + image
				+ ", categoryID=" + categoryID + ", date=" + date + ", onSell=" + onSell + "]";
	}
	
	
}
