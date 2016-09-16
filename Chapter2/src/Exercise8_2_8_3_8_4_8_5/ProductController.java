package Exercise8_2_8_3_8_4_8_5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Author: Nguyen Hoang Phu Tien
 * version: 1.0
 * date: 16/9/2016
 * Class for product controller
 */
public class ProductController {

	Database data = new Database();
	/*
	 * insert new product into database
	 * param : product want to insert
	 */
	public void insertProduct(Product product){
		
		try(Connection con = data.connect()){
			
			String sql = "INSERT INTO `product`(`id`, `name`, `price`, `amount`, `categoryid`) VALUES (NULL,?,?,?,?)";
			PreparedStatement prepare = con.prepareStatement(sql);
			prepare.setString(1, product.getName());
			prepare.setDouble(2, product.getPrice());
			prepare.setInt(3, product.getAmount());
			prepare.setInt(4, product.getCategoryID());
			prepare.execute();
			con.close();
			System.out.println("Insert success!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Get products by name and add into list
	 * Return list of product
	 */
	public List<Product> searchProduct(String name){
		List<Product> list = new ArrayList<>();
		try(Connection con = data.connect()){
			
			String sql = "SELECT * FROM `product` WHERE name LIKE '%" + name + "%'";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				Product product = new Product();
				product.setName(rs.getString("name"));
				product.setPrice(rs.getDouble("price"));
				product.setAmount(rs.getInt("amount"));
				product.setCategoryID(rs.getInt("categoryid"));
				product.setId(rs.getInt("id"));
				list.add(product);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	/*
	 * Update product in database
	 * param: product want to update
	 */
	public void updateProduct(Product product){
		
		try(Connection con = data.connect()){
			
			String sql = "UPDATE `product` SET `name`= ?,`price`= ?,`amount`= ?,`categoryid`= ? WHERE id = ?";
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, product.getName());
			pre.setDouble(2, product.getPrice());
			pre.setInt(3, product.getAmount());
			pre.setInt(4, product.getCategoryID());
			pre.setInt(5, product.getId());
			
			pre.execute();
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
