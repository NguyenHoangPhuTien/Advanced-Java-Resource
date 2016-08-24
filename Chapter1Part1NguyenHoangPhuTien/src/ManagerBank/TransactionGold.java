package ManagerBank;

/*
 * Author : Nguyen Hoang Phu Tien.
 * Date : 22/8/2016.
 * Version : 1.0.
 * Enum include price of type gold.
 */

public enum TransactionGold {

	SJC9999(3550000),
	G24K(3514100);
	
	public double price;

	private TransactionGold(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	/*
	 * Calculate total money with type gold.
	 * Input quantity of gold.
	 * Return result as a double type.
	 */
	public double calMoney(double quantity){
		
		return this.price * quantity;
	}
}
