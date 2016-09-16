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
}
