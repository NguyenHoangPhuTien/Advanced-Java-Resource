package SaleManagement;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 28-Aug-2016 9:49:28 AM
 * Class about information card
 */
public class Card extends Information {

	protected String cardID;
	protected String dateCreated;

	public Card(){

	}

	public Card(String address, String email, String identityCardNumber, String name, String phoneNumber, String cardID,
			String dateCreated) {
		super(address, email, identityCardNumber, name, phoneNumber);
		this.cardID = cardID;
		this.dateCreated = dateCreated;
		
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	
}