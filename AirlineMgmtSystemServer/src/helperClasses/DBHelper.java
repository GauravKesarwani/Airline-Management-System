package helperClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBHelper {
	
	public static Connection getConnection() throws Exception {
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();			
			/*conn = ConnectionPool.getConnection("jdbc:mysql://localhost:3306/airline","root","root");*/
			conn = ConnectionPool.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
		} catch(Exception e) {
			System.out.println("Exception in connecting to DB : ");
			e.printStackTrace();
			throw e;
		}
		return conn;
	}
	
	public static ResultSet getResults(String query) throws Exception{
		Connection conn = getConnection();
		ResultSet results = null;
		if(!conn.isClosed()) {
			Statement stmt = conn.createStatement();
			results = stmt.executeQuery(query);
		}
		return results;
	}
	
	public static int executeQuery(String query) throws Exception{
		Connection conn = getConnection();
		int updatedRows = 0;
		if(!conn.isClosed()) {
			Statement stmt = conn.createStatement();
			updatedRows = stmt.executeUpdate(query);
		}
		return updatedRows;
	}

}
