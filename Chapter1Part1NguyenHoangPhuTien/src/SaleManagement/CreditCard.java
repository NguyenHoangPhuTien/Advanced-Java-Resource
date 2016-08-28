
package SaleManagement;

import java.sql.Date;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 28-Aug-2016 9:49:28 AM
 * Class about information credit card
 * Extend from Card class
 */
public class CreditCard extends Card implements IAuthMethod, ITypeForPay {

	private String expirationDate;
	private double maxDebt;
	private String type;

	public CreditCard(){

	}

	public CreditCard(String address, String email, String identityCardNumber, String name, String phoneNumber,
			String cardID, String dateCreated, String expirationDate, double maxDebt, String type) {
		super(address, email, identityCardNumber, name, phoneNumber, cardID, dateCreated);
		this.expirationDate = expirationDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getMaxDebt() {
		return maxDebt;
	}

	public void setMaxDebt(double maxDebt) {
		this.maxDebt = maxDebt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	/*
	 * Find authentication type of credit card
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
		return "Pay by credit card";
	}

}