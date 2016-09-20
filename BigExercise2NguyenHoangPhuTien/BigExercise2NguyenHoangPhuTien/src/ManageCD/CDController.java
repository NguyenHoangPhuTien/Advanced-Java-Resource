package ManageCD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * Nguyen Hoang Phu Tien
 * version: 1.0
 * date: 19/9/2016
 * Class for database of cdstore.sql
 */
public class CDController {

	Database database = new Database();
	
	/*
	 * Get all cd from database and add into list
	 * return list of cd
	 */
	public List<CD> findAllCD(){
		
		List<CD> list = new ArrayList<>();
		
		try(Connection con = database.connect()){
			String sql = "SELECT * FROM `cd`";
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				CD cd = new CD();
				cd.setId(rs.getInt("id"));
				cd.setName(rs.getString("name"));
				cd.setSinger(rs.getString("singer"));
				cd.setNumberSongs(rs.getInt("numbersongs"));
				cd.setPrice(rs.getDouble("price"));
				
				list.add(cd);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	/*
	 * Insert new cd into database
	 * param: cd want to insert
	 */
	public void insertNewCD(CD cd){
		
		try(Connection con = database.connect()){
			String sql = "INSERT INTO `cd`(`name`, `singer`, `numbersongs`, `price`) VALUES (?,?,?,?)";
			
			PreparedStatement prepare = con.prepareStatement(sql);
			prepare.setString(1, cd.getName());
			prepare.setString(2, cd.getSinger());
			prepare.setInt(3, cd.getNumberSongs());
			prepare.setDouble(4, cd.getPrice());
			
			prepare.execute();
			con.close();
			System.out.println("Insert success!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Get cd by name and add into list
	 * Return list of product
	 */
	public List<CD> searchCDByName(String name){
		List<CD> list = new ArrayList<>();
		try(Connection con = database.connect()){
			
			String sql = "SELECT * FROM `cd` WHERE name LIKE '%" + name + "%'";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				CD cd = new CD();
				cd.setId(rs.getInt("id"));
				cd.setName(rs.getString("name"));
				cd.setSinger(rs.getString("singer"));
				cd.setNumberSongs(rs.getInt("numbersongs"));
				cd.setPrice(rs.getDouble("price"));
				list.add(cd);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	/*
	 * Update cd by id
	 * param: id of cd want to update, price and number songs want to update
	 */
	public void updateProduct(int id, double price, int amount){
		
		
		try(Connection con = database.connect()){
			
			String sql = "UPDATE `cd` SET `price`= ?,`numbersongs`= ?  WHERE id = ?";
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
	 * Delete cd in database
	 * param: id of cd want to delete
	 */
	public void deleteProduct(int id){
		
		try(Connection con = database.connect()){
			String sql = "DELETE FROM `cd` WHERE id = ?";
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setInt(1, id);
			pre.execute();
			con.close();
			System.out.println("Delete success!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * Get cd by singer and add into list
	 * Return list of cd
	 */
	public List<CD> searchCDBySinger(String name){
		List<CD> list = new ArrayList<>();
		try(Connection con = database.connect()){
			
			String sql = "SELECT * FROM `cd` WHERE singer LIKE '" + name + "'";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				CD cd = new CD();
				cd.setId(rs.getInt("id"));
				cd.setName(rs.getString("name"));
				cd.setSinger(rs.getString("singer"));
				cd.setNumberSongs(rs.getInt("numbersongs"));
				cd.setPrice(rs.getDouble("price"));
				list.add(cd);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	/*
	 * Get cd by number songs by distance
	 * Return list of cd
	 */
	public List<CD> searchCDByNumberSongs(int start, int end){
		List<CD> list = new ArrayList<>();
		try(Connection con = database.connect()){
			
			String sql = "SELECT * FROM `cd` WHERE `numbersongs` BETWEEN " + start + " and " + end + "";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				CD cd = new CD();
				cd.setId(rs.getInt("id"));
				cd.setName(rs.getString("name"));
				cd.setSinger(rs.getString("singer"));
				cd.setNumberSongs(rs.getInt("numbersongs"));
				cd.setPrice(rs.getDouble("price"));
				list.add(cd);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	/*
	 * Get cd by price by distance
	 * Return list of cd
	 */
	public List<CD> searchCDByPrice(double start, double end){
		List<CD> list = new ArrayList<>();
		try(Connection con = database.connect()){
			
			String sql = "SELECT * FROM `cd` WHERE `price` BETWEEN " + start + " and " + end + "";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				CD cd = new CD();
				cd.setId(rs.getInt("id"));
				cd.setName(rs.getString("name"));
				cd.setSinger(rs.getString("singer"));
				cd.setNumberSongs(rs.getInt("numbersongs"));
				cd.setPrice(rs.getDouble("price"));
				list.add(cd);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	/*
	 * Get cd by number songs
	 * Return list of cd
	 */
	public List<CD> searchCDByNumberSongs(int amount){
		List<CD> list = new ArrayList<>();
		try(Connection con = database.connect()){
			
			String sql = "SELECT * FROM `cd` WHERE `numbersongs` = " + amount + "";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				CD cd = new CD();
				cd.setId(rs.getInt("id"));
				cd.setName(rs.getString("name"));
				cd.setSinger(rs.getString("singer"));
				cd.setNumberSongs(rs.getInt("numbersongs"));
				cd.setPrice(rs.getDouble("price"));
				list.add(cd);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
	
	/*
	 * Get cd by price
	 * Return list of cd
	 */
	public List<CD> searchCDByPrice(double price){
		List<CD> list = new ArrayList<>();
		try(Connection con = database.connect()){
			
			String sql = "SELECT * FROM `cd` WHERE `price` = " + price + "";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()){
				CD cd = new CD();
				cd.setId(rs.getInt("id"));
				cd.setName(rs.getString("name"));
				cd.setSinger(rs.getString("singer"));
				cd.setNumberSongs(rs.getInt("numbersongs"));
				cd.setPrice(rs.getDouble("price"));
				list.add(cd);
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
