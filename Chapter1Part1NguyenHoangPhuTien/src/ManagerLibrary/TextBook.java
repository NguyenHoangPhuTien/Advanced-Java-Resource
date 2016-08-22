package ManagerLibrary;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 21/8/2016.
 * Version : 1.0.
 * Class about information text book.
 * This class extend by book class.
 */

public class TextBook extends Book{
	
	String status;
	
	public TextBook() {
		super();
	}

	public TextBook(String code, String name, String dateImport, double price,
			int quantity, String manufacturer, String status) {
		super(code, name, dateImport, price, quantity, manufacturer);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	/*
	 * Get money of text book.
	 * Return result as double type.
	 */
	public double findMoney(){
		
		double money = 0;
		String status = this.getStatus().toLowerCase();
		if(status.equals("new")){
			money = quantity * price;
		}
		else
			money = quantity * price * 0.5;
		return money;
	}

	/*
	 * Get full information of textbook.
	 * Return result as a string type.
	 */
	@Override
	public String toString() {
		return "TextBook status : " + status + ", code : " + code + ", name : "
				+ name + ", dateImport : " + dateImport + ", price : " + price
				+ ", quantity : " + quantity + ", manufacturer : " + manufacturer
				+ "]";
	}
	
	
}
