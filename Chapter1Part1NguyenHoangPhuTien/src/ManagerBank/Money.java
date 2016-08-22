package ManagerBank;

public class Money extends Transaction{

	/*
	 * Author : Nguyen Hoang Phu Tien.
	 * Date : 21/8/2016.
	 * Version : 1.0.
	 * Class about information transaction by money.
	 * This class extend by Transaction class.
	 */
	
	String type;
	double priceSell;
	double priceBuy;

	
	public Money() {
		super();
	}

	public Money(String tradingCode, String day, int quantity,
			double unitPrice, String type) {
		super(tradingCode, day, quantity, unitPrice);
		this.type = type;
	}

	
	public Money(String tradingCode, String day, int quantity) {
		super(tradingCode, day, quantity);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public double getPriceSell() {
		return priceSell;
	}

	public void setPriceSell(double priceSell) {
		this.priceSell = priceSell;
	}

	public double getPriceBuy() {
		return priceBuy;
	}

	public void setPriceBuy(double priceBuy) {
		this.priceBuy = priceBuy;
	}
	
	public void setPriceSell(int type) {
		if(type == 1)
			priceSell = TransactionMoney.USD.getPriceSell();
		else if(type == 2)
			priceSell = TransactionMoney.EUR.getPriceSell();
		else if(type == 3)
			priceSell = TransactionMoney.AUD.getPriceSell();
	}
	
	public void setPriceBuy(int type) {
		if(type == 1)
			priceBuy = TransactionMoney.USD.getPriceSell();
		else if(type == 2)
			priceBuy = TransactionMoney.EUR.getPriceSell();
		else if(type == 3)
			priceBuy = TransactionMoney.AUD.getPriceSell();
	}
	
	/*
	 * Get all information about transaction by money.
	 * Return result as a string type.
	 */
	@Override
	public String toString() {
		return "Money type : " + type + ", priceSell : " + priceSell
				+ ", priceBuy : " + priceBuy + ", tradingCode : " + tradingCode
				+ ", day=" + day + ", quantity : " + quantity;
	}
	
	
	/*
	 * Calculate buy total money with type money.
	 * Input quantity of money.
	 * Return result as a double type.
	 */
	public double calMoneyBuy(int type){
		
		double money = 0;
		switch(type){
			
			case 1:
				money = TransactionMoney.USD.calMoneyBuy(quantity);
				break;
			case 2:
				money = TransactionMoney.EUR.calMoneyBuy(quantity);
				break;
			case 3:
				money = TransactionMoney.AUD.calMoneyBuy(quantity);
				break;
		}
		return money;
	}
	
	/*
	 * Calculate sell total money with type money.
	 * Input quantity of money.
	 * Return result as a double type.
	 */
	public double calMoneySell(int type){
		double money = 0;
		switch(type){
		
		case 1:
			money = TransactionMoney.USD.calMoneySell(quantity);
			break;
		case 2:
			money = TransactionMoney.EUR.calMoneySell(quantity);
			break;
		case 3:
			money = TransactionMoney.AUD.calMoneySell(quantity);
			break;
		}
		return money;
		
	}
}
