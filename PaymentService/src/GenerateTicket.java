import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.jws.WebService;

import ticket.TicketBean;

@WebService
public class GenerateTicket {
	
	
		
	public TicketBean[] ticketInfo(int reservationid)
	{
		TicketBean[] tkArray=null;
		Connection con=getConnection();
		PreparedStatement preparestatement=null;
		ResultSet rs=null;
		int size=0;
		try {
						
			preparestatement=con.prepareStatement("select r.reservation_id, rd.reservation_dtl_id, rd.flight_id, "
					+ "f.Depart_date,f.flight_number, f.flight_source,f.flight_destination,p.first_name, r.status, "
					+ "rd.boarding_status, p.last_name, rd.price+rd.tax price from reservations r "
					+ "inner join reservation_details rd on r.reservation_id=rd.reservation_id and r.reservation_id= ? "
					+ "inner join flightdetails f on f.flight_id=rd.flight_id inner join traveller t "
					+ "on t.traveller_id=rd.traveller_id inner join person p "
					+ "on p.person_id=t.person_id;");
			
			preparestatement.setInt(1, reservationid);
			rs=preparestatement.executeQuery();
						
			if(rs.last())
			{
				size=rs.getRow();
				rs.beforeFirst();
			}
			tkArray=new TicketBean[size];
			int i=0;
			while(rs.next())
			{  
				
			   TicketBean tbean=new TicketBean();
			   tbean.setFirstName(rs.getString("first_name"));
			   
			   tbean.setLastName(rs.getString("last_name"));
			   tbean.setFlightNo(rs.getString("flight_number"));
			   tbean.setType("Credit Card");  
			   tbean.setAmount(rs.getInt("price"));
			   tbean.setSource(rs.getString("flight_source"));
			   tbean.setDestination(rs.getString("flight_destination"));
			   tbean.setDeparturedate(rs.getString("Depart_date"));
			   tkArray[i]=tbean;
				i++;
			}
				
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{

			if(preparestatement!=null)try{preparestatement.close();}catch(SQLException e) {}
			if(rs!=null)try{rs.close();}catch(SQLException e) {}
			ConnectionPool.addConnectionToPool(con);
		}

		return tkArray;
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
