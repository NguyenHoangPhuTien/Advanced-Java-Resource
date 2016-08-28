package SaleManagement;

import java.util.List;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 28-Aug-2016 9:49:28 AM
 * Class about information Customer
 * Extent from class Information 
 */
public class Customer extends Information {

	private String customerID;
	public List<Order> list;

	public Customer(){

	}

	public Customer(String address, String email, String identityCardNumber, String name, String phoneNumber,
			String customerID, List<Order> list) {
		super(address, email, identityCardNumber, name, phoneNumber);
		this.customerID = customerID;
		this.list = list;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public List<Order> getList() {
		return list;
	}

	public void setList(List<Order> list) {
		this.list = list;
	}

}