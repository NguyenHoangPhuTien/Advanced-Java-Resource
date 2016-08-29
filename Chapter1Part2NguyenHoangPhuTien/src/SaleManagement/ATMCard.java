package SaleManagement;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 28-Aug-2016 9:49:28 AM
 * Class about information ATM card
 * Extend from Card class
 */
public class ATMCard extends Card implements IAuthMethod, ITypeForPay {

	private double balance;

	public ATMCard(){

	}

	public ATMCard(String address, String email, String identityCardNumber, String name, String phoneNumber,
			String cardID, String dateCreated, double balance) {
		super(address, email, identityCardNumber, name, phoneNumber, cardID, dateCreated);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/*
	 * Find authentication type of atm card
	 * Return result as a String type
	 */
	public String getAuthMethod(){
		return "authentication by phone";
	}

	/*
	 * Find type for pay
	 * Return result as a String type
	 */
	@Override
	public String typeForPay() {
		
		return "Pay by ATM";
	}

}