package ManagerBank;

public class Gold extends Transaction{
	
	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 21/8/2016.
	 * Version : 1.0.
	 * Class about information transaction by gold.
	 * This class extend by Transaction class.
	 */

	String type;

	public Gold() {
		super();
	}

	
	public Gold(String tradingCode, String day, int quantity) {
		super(tradingCode, day, quantity);
	}


	public Gold(String tradingCode, String day, int quantity, double unitPrice,
			String type) {
		super(tradingCode, day, quantity, unitPrice);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*
	 * Get all information about transaction by gold
	 * Return result as a string type.
	 */
	@Override
	public String toString() {
		return "Gold type : " + type + ", tradingCode : " + tradingCode + ", day : "
				+ day + ", quantity : " + quantity + ", unitPrice : " + unitPrice;
	}
	
	
	/*
	 * Calculate total money with type gold.
	 * Input quantity of gold.
	 * Return result as a double type.
	 */
	public double calculateMoney(int type){
		
		double money = 0;
		switch(type){
			case 1:
				money = TransactionGold.SJC9999.calMoney(quantity);
				break;
			case 2:
				money = TransactionGold.G24K.calMoney(money);
				break;				
		}
		return money;
	}
	
	public void setUnitPrice(int type){
		
		if(type == 1)
			unitPrice = TransactionGold.SJC9999.getPrice();
		else if(type == 2)
			unitPrice = TransactionGold.G24K.getPrice();
	}
}
