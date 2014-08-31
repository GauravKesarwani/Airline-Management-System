import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebService;


@WebService
public class ticketInfo {
	
	
	public static void main(String [] args)
	{
		ticketInfo tk=new ticketInfo();
		//System.out.println(tk.getdata(1));
		System.out.println(tk.getdata(1));
		System.out.println("\n");
		System.out.println(tk.getdata(1));
		System.out.println("\n");
		System.out.println(tk.getdata(1));
		System.out.println("\n");
		System.out.println(tk.getdata(1));
		System.out.println("\n");
		System.out.println(tk.getdata(1));
		System.out.println("\n");
		System.out.println(tk.getdata(1));
		System.out.println("\n");
	}
	

public String getdata(int personid){
		
		Connection con=getConnection();
		PreparedStatement preparestatement=null;
		ResultSet rs=null;
		Ticketbean tk=new Ticketbean();
		String strReturn=null;
		try {
			preparestatement=con.prepareStatement("select p.first_name,p.last_name,pay.FlightNo,pay.PaymentType,pay.PaymentDate,pay.Amount"
					+ " from airline.person p "
					+ "inner join airline.payment pay "
					+ "on p.person_id=pay.PersonId "
					+ "where person_id=?");
			
			preparestatement.setInt(1, personid);
			
			rs=preparestatement.executeQuery();
			while(rs.next())
			{
			    tk.setFirstName(rs.getString("first_name"));
				tk.setLastName(rs.getString("last_name"));
				tk.setFlightNo(rs.getString("FlightNo"));
				tk.setType(rs.getString("PaymentType"));  
				tk.setPayment(rs.getDate("PaymentDate"));
				tk.setAmount(rs.getInt("Amount"));
				
			}
		strReturn=tk.getFirstName()+","+tk.getLastName()+","+tk.getFlightNo()+","+tk.getType()+","+tk.getPayment()+","+tk.getAmount();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			/*if(con!=null)try{con.close();}catch(SQLException e) {}*/
			if(preparestatement!=null)try{preparestatement.close();}catch(SQLException e) {}
			if(rs!=null)try{rs.close();}catch(SQLException e) {}
			ConnectionPool.addConnectionToPool(con);
		}
		//return tk;
		return strReturn;
	}




	
private Connection getConnection() {
	Connection con = null;
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		con=ConnectionPool.getConnection("jdbc:mysql://localhost:3306/airline", "root", "root");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return con;
}

}
