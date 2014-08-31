import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.PreparedStatement;

import javax.jws.WebService;



@WebService
public class payService {

	
	public boolean updateStatus(int reservationid,int people) 
	{
		Connection con=getConnection();
		
			
		Statement st=null;
		String query="update flightdetails set No_Of_Seats = No_Of_Seats-"+people+ 
				" where Flight_id=(select flight_id from reservations res inner join  reservation_details details "
				+ "on res.reservation_id=details.reservation_id "
				+ "where res.reservation_id="+reservationid+")";
				
		
		try {
			st=con.createStatement();
			st.executeUpdate(query);
			System.out.println("query "+query);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		PreparedStatement prepareflight=null;
		try {
					
			prepareflight=con.prepareStatement("update reservations set status='complete' where reservation_id=?");
			prepareflight.setInt(1, reservationid);
		
			prepareflight.executeUpdate();
			System.out.println("query "+prepareflight.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally{
			if(con!=null) try{con.close();}	catch(SQLException exception) {}
			if(prepareflight!=null) try{prepareflight.close();}	catch(SQLException exception) {}
		}
		return true;
	}
	
	
		public boolean payByCredit(int reservationId,Long cardNo,String date ,int FlightID,String FlightNo,int personId,int Amt){
		
		Connection con=getConnection();
		PreparedStatement preparestatement=null;
		//Statement st=null;
		//ResultSet rs=null;
		//System.out.println("date is"+date);
		
		//String query="insert into airline.payment(ReservationId,FlightId,FlightNo,PersonId,PaymentDate,Amount,PaymentType,CardNo)"+
 //"values("+reservationId+","+FlightID+",'"+FlightNo+"',"+personId+",'"+date+"',"+Amt+",'Credit Card',"+cardNo+");";
		
	//	System.out.println("query="+query);
		
		try {
			//st=con.createStatement();
			//st.executeUpdate(query);
			preparestatement=con.prepareStatement("INSERT INTO AIRLINE.PAYMENT(ReservationId,FlightId,FlightNo,PersonId,PaymentDate,Amount,PaymentType, CardNo)"
					+ "VALUES(?,?,?,?,?,?,?,?);");
			
			preparestatement.setInt(1, reservationId);
			preparestatement.setInt(2, FlightID);
			preparestatement.setString(3, FlightNo);
			preparestatement.setInt(4, personId);
			preparestatement.setString(5, date);
			preparestatement.setInt(6, Amt);
			preparestatement.setString(7, "Credit Card");
			preparestatement.setLong(8, cardNo);
			preparestatement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
		
		finally{
			if(con!=null) try{con.close();}	catch(SQLException exception) {}
			if(preparestatement!=null) try{preparestatement.close();}	catch(SQLException exception) {}		
		}
		return true;
	}
	
	public boolean payByPoints(int miles){
		return true;
	}
	
	private Connection getConnection() {
		Connection con = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;
	}
	
	public static void main(String[] args)
	{
		/*payService pay=new payService();
		//  need to append L after the credit card no or wll gibve an error.
		Date date = new Date();
		String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
		
		System.out.println(modifiedDate); 
		pay.payByCredit(2,1234567891234567L,modifiedDate, 5, "EK450", 5, 1300);*/
	}
	
}
