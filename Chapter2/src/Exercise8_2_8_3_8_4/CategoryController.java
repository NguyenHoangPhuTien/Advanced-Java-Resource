package Exercise8_2_8_3_8_4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Author: Nguyen Hoang Phu Tien
 * version: 1.0
 * date: 16/9/2016
 * Class for category controller
 */
public class CategoryController {

	Database data = new Database();
	
	/*
	 * Get all category from database and add into list
	 * Return list of category
	 */
	public List<Category> getAllCategory(){
		
		List<Category> list = new ArrayList<>();
		try(Connection con = data.connect()){
			String sql = "Select * from category";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				Category cate = new Category();
				cate.setId(rs.getInt("id"));
				cate.setName(rs.getString("name"));
				cate.setDescription(rs.getString("description"));
				list.add(cate);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
