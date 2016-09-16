package Exercise8_2_8_3_8_4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Author: Nguyen Hoang Phu Tien
 * version: 1.0
 * date: 16/9/2016
 * Class for control user
 */
public class UserController {

	Database data = new Database();
	
	/*
	 * Get user from database
	 * param: name and password
	 * Return user
	 */
	public User loginUser(String username, String password){
		
		User user = null;
		try (Connection con = data.connect()){
			 Statement statement = (Statement) con.createStatement();
			 String sql = "Select * FROM `user` WHERE username like '" + username +"' and password like '" + password + "'";
			 ResultSet resultSet = statement.executeQuery(sql);
			 while(resultSet.next()){
				 user = new User();
				 user.setUsername(resultSet.getString("username"));
				 user.setPassword(resultSet.getString("password"));
				 break;
			 }
			 con.close();
			 
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		} 
		return user;
	}
	
	/*
	 * Add new user into database
	 * param: user
	 */
	public void addUser(User user){
		
		try(Connection con = data.connect()){
			
			String sql = "INSERT INTO `user`(`username`, `password`) VALUES (?,?)";
			PreparedStatement prepare = con.prepareStatement(sql);
			prepare.setString(1, user.getUsername());
			prepare.setString(2, user.getPassword());
			prepare.execute();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
