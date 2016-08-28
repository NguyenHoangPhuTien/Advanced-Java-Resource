package SaleManagement;

import java.sql.Date;
import java.util.List;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 28-Aug-2016 9:49:28 AM
 * Class about information order of customer
 */
public class Order {

	private String orderDate;
	private String status;
	private boolean printtax;
	ITypeForPay iTypeForPay;
	public List<OrderDetail> list;

	public Order(){

	}

	public Order(String orderDate, String status, List<OrderDetail> list, boolean tax, ITypeForPay iTypeForPay) {
		super();
		this.orderDate = orderDate;
		this.status = status;
		this.list = list;
		this.printtax = tax;
		this.iTypeForPay = iTypeForPay;
	}
	
	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isPrintTax() {
		return printtax;
	}

	public void setTax(boolean tax) {
		this.printtax = tax;
	}

	public List<OrderDetail> getList() {
		return list;
	}

	public void setList(List<OrderDetail> list) {
		this.list = list;
	}

	public boolean isPrinttax() {
		return printtax;
	}

	public void setPrinttax(boolean printtax) {
		this.printtax = printtax;
	}

	public ITypeForPay getiTypeForPay() {
		return iTypeForPay;
	}

	public void setiTypeForPay(ITypeForPay iTypeForPay) {
		this.iTypeForPay = iTypeForPay;
	}

	/*
	 * Find money of list of detail order
	 * Return result as a double type
	 */
	public double calSubTotal(){

		double money = 0;
		for(OrderDetail detail : list){
			money += detail.calLineTotal();
		}
		return money;
	}

	/*
	 * Find tax of list of detail order
	 * Return result as a double type
	 */
	public double calTax(){
		double money = 0;
		if(printtax)
			money = calSubTotal() * 0.1;
		return money;
	}

	/*
	 * Find total of money customer must be pay
	 * Return result as a double type
	 */
	public double calTotalAmount(){
		return calTax() + calSubTotal();
	}

	/*
	 * Get full information of order
	 * Return result as a String type
	 */
	@Override
	public String toString() {
		
		String resutl = "";
		for(OrderDetail detail : list){
			resutl += detail.toString() + "\n";
		}
		resutl += "Order date: " + orderDate + "\n";
		resutl += "Status: " + status + "\n";
		resutl += "Order date: " + orderDate + "\n";
		resutl += "Print order: " + printtax + "\n";
		resutl += "Sub total: " + calSubTotal() + "\n";
		resutl += "Tax: " + calTax() + "\n";
		resutl += "total money: " + calTotalAmount() + "\n";
		resutl += iTypeForPay.typeForPay();
		return resutl;
	}
}