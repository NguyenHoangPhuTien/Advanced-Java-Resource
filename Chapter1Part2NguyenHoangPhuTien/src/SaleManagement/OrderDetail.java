package SaleManagement;

/**
 * @author Nguyen Hoang Phu Tien
 * @version 1.0
 * @created 28-Aug-2016 9:49:28 AM
 * Class about information order detail
 */
public class OrderDetail {

	private int quantity;
	public Product m_Product;

	public OrderDetail(){

	}

	public OrderDetail(int quantity, Product m_Product) {
		super();
		this.quantity = quantity;
		this.m_Product = m_Product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getM_Product() {
		return m_Product;
	}

	public void setM_Product(Product m_Product) {
		this.m_Product = m_Product;
	}

	/*
	 * Find money of order detail
	 * Return result as a double type
	 */
	public double calLineTotal(){
		return m_Product.getPrice() * quantity;
	}

	/*
	 * Get full information of order detail
	 * Return result as a String type
	 */
	@Override
	public String toString() {
		
		return m_Product.toString() + " quantity: " + quantity;
	}
}