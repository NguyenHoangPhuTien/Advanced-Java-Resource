package ManagerBank;

public enum TransactionMoney {

	USD(22250, 22335),
	EUR(24457, 25050),
	AUD(16530, 17226);
	
	public double priceBuy;
	public double priceSell;
	
	private TransactionMoney(double priceBuy, double priceSell) {
		this.priceBuy = priceBuy;
		this.priceSell = priceSell;
	}

	public double getPriceBuy() {
		return priceBuy;
	}

	public void setPriceBuy(double priceBuy) {
		this.priceBuy = priceBuy;
	}

	public double getPriceSell() {
		return priceSell;
	}

	public void setPriceSell(double priceSell) {
		this.priceSell = priceSell;
	}
	
	/*
	 * Calculate buy total money with type money.
	 * Input quantity of money.
	 * Return result as a double type.
	 */
	public double calMoneyBuy(int quantity){
		return this.getPriceBuy() * quantity;
	}
	
	/*
	 * Calculate sell total money with type money.
	 * Input quantity of money.
	 * Return result as a double type.
	 */
	public double calMoneySell(int quantity){
		return this.getPriceSell() * quantity + (quantity * this.getPriceSell()) * 0.1;
	}
}
