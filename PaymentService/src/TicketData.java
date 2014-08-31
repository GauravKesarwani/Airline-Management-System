import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebService;

@WebService
public class TicketData {
	
	public Ticketbean getdata(int personid){
	
		Connection con=getConnection();
		PreparedStatement preparestatement=null;
		ResultSet rs=null;
		Ticketbean tk=new Ticketbean();
		try {
			preparestatement=con.prepareStatement("select p.first_name,p.last_name,pay.FlightNo,pay.PaymentType,pay.PaymentDate,pay.Amount"
					+ " from airline.person p "
					+ "inner join airline.payment pay "
					+ "on p.person_id=pay.PersonId "
					+ "where person_id=?");
			
			preparestatement.setInt(1, personid);
			rs=preparestatement.executeQuery();
			while(rs!=null)
			{
				tk.setFirstName(rs.getString("first_name"));
				tk.setLastName(rs.getString("last_name"));
				tk.setFlightNo(rs.getString("FlightNo"));
				tk.setType(rs.getString("PaymentType"));  
				tk.setPayment(rs.getDate("PaymentDate"));
				tk.setAmount(rs.getInt("Amount"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(con!=null)try{con.close();}catch(SQLException e) {}
			if(preparestatement!=null)try{preparestatement.close();}catch(SQLException e) {}
			if(rs!=null)try{rs.close();}catch(SQLException e) {}
		}
		return tk;
	}
	
	
	private Connection getConnection() {
		Connection con = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/airline", "root",
						"root");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;
	}

}
