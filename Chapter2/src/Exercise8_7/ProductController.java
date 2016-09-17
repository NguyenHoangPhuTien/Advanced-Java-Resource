package Exercise8_7;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Author: Nguyen Hoang Phu Tien
 * version: 1.0
 * date: 16/9/2016
 * Class for product
 */

public class ProductController {

	Database data = new Database();
	
	/*
	 * Insert new product into database
	 * param: product want to add;
	 */
	public void insertProduct(Product product){
		
		try(Connection con = data.connect()){
			String sql = "INSERT INTO `product`(`name`, `price`, `amount`, `image`, `categoryId`, `createDate`, `onSell`) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement prepare = con.prepareStatement(sql);
			prepare.setString(1, product.getName());
			prepare.setDouble(2, product.getPrice());
			prepare.setInt(3, product.getAmount());
			prepare.setString(4, product.getImage());
			prepare.setInt(5, product.getCategoryID());
			prepare.setDate(6, (Date) product.getDate());
			prepare.setInt(7, product.getOnSell());
			
			prepare.execute();
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Update product by id
	 * param: id of product want to update, price and amount want to update
	 */
	public void updateProduct(int id, double price, int amount){
		
		
		try(Connection con = data.connect()){
			
			String sql = "UPDATE `product` SET `price`= ?,`amount`= ?  WHERE id = ?";
			PreparedStatement prepare = con.prepareStatement(sql);
			prepare.setDouble(1, price);
			prepare.setInt(2, amount);
			prepare.setInt(3, id);
			
			prepare.execute();
			con.close();
			
			System.out.println("Update success!!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	/*
	 * Delete product in database
	 * param: id of product want to delete
	 */
	public void deleteProduct(int id){
		
		try(Connection con = data.connect()){
			String sql = "DELETE FROM `product` WHERE id = ?";
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setInt(1, id);
			pre.execute();
			con.close();
			System.out.println("Delete success!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
