package Exercise8_2_8_3_8_4_8_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/*
 * Author: Nguyen Hoang Phu Tien
 * version: 1.0
 * date: 16/9/2016
 * Class for database of MyStore
 */
public class Database {

	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mystore?useUnicode=true&characterEncoding=UTF-8";
	private static final String JDBC_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "";
	
	public Connection connect() throws ClassNotFoundException, SQLException{
		
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL,JDBC_USERNAME,JDBC_PASSWORD);
		return conn;
		
	}
}
