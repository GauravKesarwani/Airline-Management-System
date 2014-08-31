import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class FlightStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightStatus fs=new FlightStatus();
		System.out.println(fs.getInfo(1)); 

	}
	
	public String getInfo(int flightId){
		Connection con=getConnection();
		PreparedStatement preparestatement=null;
		ResultSet rs=null;
		String info=null;
		try
		{
			preparestatement = con.prepareStatement("select Depart_date,Flight_Depart_Time From airline.flightdetails where Flight_id=?");
			preparestatement.setInt(1, flightId);
			rs=preparestatement.executeQuery();
			while(rs.next())
			{
				info="Flight is Departing on "+rs.getString("Depart_date")+" at "+rs.getString("Flight_Depart_Time");
				//System.out.println(rs.getString("Depart_date"));
				//System.out.println(rs.getString("Flight_Depart_Time"));
			}
			
		} 
		catch (SQLException e)
		{
		
			e.printStackTrace();
		}
		return info;
	}
	
	private Connection getConnection() {
		Connection con = null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			try
			{
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/marketplace", "root","install");
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}

		return con;
	}

}
