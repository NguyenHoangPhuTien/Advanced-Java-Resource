package ManagerBank;

public class Transaction {

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 22/8/2016.
	 * Version : 1.0.
	 * Class about transaction in bank.
	 */
	
	String tradingCode;
	String day;
	int quantity;
	double unitPrice;
	
	public Transaction() {
		super();
	}

	public Transaction(String tradingCode, String day, int quantity) {
		super();
		this.tradingCode = tradingCode;
		this.day = day;
		this.quantity = quantity;
	}

	public Transaction(String tradingCode, String day, int quantity,
			double unitPrice) {
		super();
		this.tradingCode = tradingCode;
		this.day = day;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getTradingCode() {
		return tradingCode;
	}

	public void setTradingCode(String tradingCode) {
		this.tradingCode = tradingCode;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	/*
	 * Get all information about transaction
	 * Return result as a string type.
	 */
	@Override
	public String toString() {
		return "Transaction tradingCode : " + tradingCode + ", day : " + day
				+ ", quantity : " + quantity + ", unitPrice : " + unitPrice;
	}

}
