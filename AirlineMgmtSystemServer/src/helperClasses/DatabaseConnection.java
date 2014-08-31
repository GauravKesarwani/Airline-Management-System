package helperClasses;

//package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import beanFiles.ActiveReservationsBean;
import fdpackage.FlightDetailsBean;
import fdpackage.FlightListBean;

public class DatabaseConnection {
	static Connection connection; 
	static String url; 
	static String URL ="jdbc:mysql://localhost/airline:3306";
	static String username= "root" ;
	static String password = "root";
	static ResultSet rs1,rs2,rs3,rs4,rs5,rs6,rs7,rs8,rs9,rs10,rs11,rs12,rs13;
	static ResultSet count_rs1,count_rs2;
	PreparedStatement prstmt1,prstmt2,prstmt3,prstmt4,prstmt5,prstmt6,prstmt7,prstmt8,prstmt9,prstmt10,prstmt11,prstmt12,prstmt13;
	PreparedStatement cprstmt1,cprstmt2,cprstmt3;
	Statement stmt;
	Map<String, String> errorMsg = new HashMap<String, String>();
	
	public static Connection getConnection() 
	{ 
		try
		{
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connection=DriverManager.getConnection(URL,username,password);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	//	log.info("Exit from getConnection in DataBaseConnection");
		
		return connection;
	}
	/*
	public FlightDetailsBean[] searchOneWayFlight(FlightDetailsBean flightdetails){
		
		int count=0;
		FlightDetailsBean[] matchedflights=null;
		Connection connection = getConnection();
		
		try{
		String csearchQuery="Select count(*) From flightdetails where Flight_Source ='"+ flightdetails.getSource() + "' and Flight_Destination ='"
		 + flightdetails.getDestination() +"' and Depart_date between DATE_SUB('" +flightdetails.getDate_of_journey()+ "', INTERVAL 5 DAY) and DATE_ADD('"+flightdetails.getDate_of_journey()+"', INTERVAL 5 DAY)";
		stmt=connection.createStatement();
		
		//cprstmt1.setString(1,flightdetails.getSource());
		//cprstmt1.setString(2,flightdetails.getDestination());
		
		ResultSet count_rs1 = stmt.executeQuery(csearchQuery);	
		
		while(count_rs1.next()){
			count = Integer.parseInt(count_rs1.getString(1));
		}
		
		System.out.println("Value of C"+ count);
		matchedflights = new FlightDetailsBean[count];			
		
		
		String searchQuery="Select f.Flight_Number,f.Airline_Name,f.Flight_Source,f.Flight_Destination,f.Flight_Depart_Time,f.Flight_Arr_Time,"
				+ "f.Flight_Fare,f.No_Of_Seats,f.Crew_count,f.Flight_Id, f.Depart_date "
				+ " From flightdetails f where Flight_Source = ? and Flight_Destination = ? "
				+ "and Depart_date between DATE_SUB(?,INTERVAL 5 DAY) and DATE_ADD(?,INTERVAL 5 DAY)";
		System.out.println("2 "+ flightdetails.getDestination());
		prstmt1 = connection.prepareStatement(searchQuery);
		prstmt1.setString(1,flightdetails.getSource());
		prstmt1.setString(2,flightdetails.getDestination());
		System.out.println(" date "+ flightdetails.getDate_of_journey());
		prstmt1.setString(3, flightdetails.getDate_of_journey());	
		prstmt1.setString(4, flightdetails.getDate_of_journey());	
		rs1 = prstmt1.executeQuery();		
		System.out.println(searchQuery);
	//	FlightDetailsBean[] matchflightdetails = new FlightDetailsBean[500];
		int i=0;
		while (rs1.next() && i < count){ 
			System.out.println("Start setting");
			matchedflights[i] = new FlightDetailsBean();
		//	 System.out.println("flight details "+ i + rs1.getString(1));
			matchedflights[i].setFlightId(rs1.getInt(10));
			matchedflights[i].setDate_of_journey(rs1.getString(11));
			matchedflights[i].setFlightnumber(rs1.getString(1));
			matchedflights[i].setAirlinename(rs1.getString(2));			
			matchedflights[i].setSource(rs1.getString(3));			
			matchedflights[i].setDestination(rs1.getString(4));		
			matchedflights[i].setDeparture(rs1.getString(5));
			matchedflights[i].setArrival(rs1.getString(6));			
			matchedflights[i].setFare(rs1.getDouble(7));
			matchedflights[i].setTravelclass("Economy");
			matchedflights[i].setDate_of_return("");
	//		matchedflights[i].setDate_of_journey(flightdetails.getDate_of_journey());
	//		matchedflights[i].setDate_of_return(null);
	//		matchedflights[i].setDeparture(rs1.getString(7));			
	//		matchedflights[i].setArrival(rs1.getString(8));			
			i+=1;
			System.out.println("setting values");
			}//end while
	//	i=0;
	//	while(i<count) {
	//		System.out.println(matchedflights[i].toString());
	//	}
		}catch(SQLException e){ e.printStackTrace();}
		return matchedflights; 		
	}

*/
public FlightListBean[] getFlightList() {

	FlightListBean[] flightlist=null;
	int count=0;
	Connection connection = getConnection();
	
	try{
		Statement stmt = connection.createStatement();
		
		count_rs2= stmt.executeQuery("Select count(*) from flightdetails");
		
		 
		
		while(count_rs2.next()){
			count = Integer.parseInt(count_rs2.getString(1));
			
		}
		
		System.out.println("count"+ count);
		flightlist = new FlightListBean[count];
		
		rs2 = stmt.executeQuery("Select f.Flight_Id,f.Flight_Number,f.Airline_Name,f.Depart_date,f.Flight_Source,f.Flight_Destination,"
				+ "f.Flight_Depart_Time,f.Flight_Arr_Time,f.Flight_fare,f.No_Of_Seats,f.Crew_count from flightdetails f");
		
		int i=0;
		while(rs2.next() && i< count){
			System.out.println(" Setting flight details" + i);
		//	System.out.println(rs2.getInt(1));
		//	System.out.println(rs2.getString(2));
		//	System.out.println(rs2.getString(3));
		//	System.out.println(rs2.getString(4));
		//	System.out.println(rs2.getString(5));
		//	System.out.println(rs2.getString(6));
		//	System.out.println(rs2.getString(7));
		//	System.out.println(rs2.getString(8));
		//	System.out.println(rs2.getString(9));
		//	System.out.println(rs2.getString(10));
		//	System.out.println(rs2.getString(11));
		//	System.out.println(" Setting flight details");
			int flight_id = rs2.getInt(1);
			flightlist[i] = new FlightListBean();
			flightlist[i].setFlight_id(flight_id);
		//	System.out.println("Flight details set1");
			flightlist[i].setFlight_Number(rs2.getString(2));
			flightlist[i].setAirline_Name(rs2.getString(3));
		//	System.out.println("Flight details set1");
			flightlist[i].setDepart_date(rs2.getString(4));
			flightlist[i].setFlight_Source(rs2.getString(5));
		//	System.out.println("Flight details set2");
			flightlist[i].setFlight_Destination(rs2.getString(6));
			flightlist[i].setFlight_Depart_Time(rs2.getString(7));
			flightlist[i].setFlight_Arr_Time(rs2.getString(8));
			flightlist[i].setFlight_fare(rs2.getFloat(9));
		//	System.out.println("Flight details set3");
			flightlist[i].setNo_of_seats(rs2.getInt(10));
			flightlist[i].setCrew_Count(rs2.getInt(11));
		//	flightlist[i].setCrew_Count(rs2.getInt(12));
			System.out.println("Flight details set");
			System.out.println("Crew count "+ i+ flightlist[i].getCrew_Count());
			i++;
		}
	}catch(SQLException e){ System.out.println("SQL Exception"+ e);}
     return flightlist;	
}

public boolean updateFlight(FlightListBean flight)
{
	boolean updateflag = false;
	try{
		int flightid = flight.getFlight_id();
		Connection connection = getConnection();
		Statement stmt = connection.createStatement();
		ResultSet rs3 = stmt.executeQuery("Select * from flightdetails where flightdetails.flight_id ="+ flightid);
		
		while(rs3.next())
		{
		  if (rs3.getString(2) != flight.getFlight_Number() || rs3.getString(3) != flight.getAirline_Name() || rs3.getString(4) != flight.getDepart_date() ||
			  rs3.getString(4)!= flight.getFlight_Source() || rs3.getString(5) != flight.getFlight_Destination() || rs3.getString(7) != flight.getFlight_Depart_Time()
			  || rs3.getString(8) != flight.getFlight_Arr_Time() || rs3.getFloat(9) != flight.getFlight_fare() || rs3.getInt(10) != flight.getNo_of_seats() ||
			   rs3.getInt(11) != flight.getCrew_Count())
				
			  updateflag=true;
				
		}
		
		System.out.println(""+updateflag);
		
		if (updateflag)
		{
		//	String updatequery="UPDATE airline_final.flightdetails f SET f.Flight_Number = flight.getFlight_Number(),f.Airline_Name=flight.getAirline_Name(),f.Depart_date=flight.getDepart_date(),f.Flight_Source=flight.getFlight_Source(),"
		//			+"f.Flight_Destination=flight.getFlight_Destination(),f.Flight_Depart_Time=flight.getFlight_Depart_Time(),f.Flight_Arr_Time=flight.getFlight_Arr_Time(),f.Flight_fare=flight.getFlight_fare(),f.No_Of_Seats=flight.getNo_of_seats(),"
		//			+"f.Crew_count=flight.getCrew_Count() where f.Flight_Id= flight.getFlight_id()";
			
			//int flightno = Integer.parseInt(flight)
			String updatequery="UPDATE airline.flightdetails f SET f.Flight_Number ='"+ flight.getFlight_Number() +"',f.Airline_Name='"+ flight.getAirline_Name()
					+ "', f.Depart_date='"+ flight.getDepart_date() + "', f.Flight_Source='"+flight.getFlight_Source()+
					"', f.Flight_Destination='"+flight.getFlight_Destination()+"', f.Flight_Depart_Time='"+ flight.getFlight_Depart_Time() +
					"', f.Flight_Arr_Time='"+flight.getFlight_Arr_Time()+"', f.Flight_fare='"+ flight.getFlight_fare() +
					"', f.No_Of_Seats='"+flight.getNo_of_seats()+"', f.Crew_count='"+ flight.getCrew_Count() +
					"' where f.Flight_Id ='"+ flight.getFlight_id()+"'";
			Statement stmt1 = connection.createStatement();
			stmt1.executeUpdate(updatequery);
			
			System.out.println("Flight updated");
			
		}
	}catch(SQLException e){ System.out.println("SQL Exception"+ e);
}
	
	return updateflag;
}

public FlightListBean getFlightInfo(FlightListBean bean)
{
	FlightListBean flightlist=null;
	try{
	Connection connection = getConnection();
	Statement stmt = connection.createStatement();
	
	String flightinfoq = "Select f.Flight_Id, f.Flight_Number,f.Airline_Name,f.Depart_date,f.Flight_Source,"
			+ "f.Flight_Destination,f.Flight_Depart_Time,f.Flight_Arr_Time,f.Flight_fare,"
			+ "f.No_Of_Seats,f.Crew_count from flightdetails f where f.Flight_Id = ?";
	

	prstmt3 = connection.prepareStatement(flightinfoq);
	prstmt3.setInt(1, bean.getFlight_id());
	ResultSet rs3=prstmt3.executeQuery(flightinfoq);

	while(rs3.next()){
		
		flightlist = new FlightListBean();
		flightlist.setFlight_id(rs3.getInt(1));
		System.out.println("Flight details set1");
		flightlist.setFlight_Number(rs3.getString(2));
		flightlist.setAirline_Name(rs3.getString(3));
		System.out.println("Flight details set1");
		flightlist.setDepart_date(rs3.getString(4));
		flightlist.setFlight_Source(rs3.getString(5));
		System.out.println("Flight details set2");
		flightlist.setFlight_Destination(rs3.getString(6));
		flightlist.setFlight_Depart_Time(rs3.getString(7));
		flightlist.setFlight_Arr_Time(rs3.getString(8));
		flightlist.setFlight_fare(rs3.getFloat(9));
		System.out.println("Flight details set3");
		flightlist.setNo_of_seats(rs3.getInt(10));
		flightlist.setCrew_Count(rs3.getInt(11));
	//	flightlist[i].setCrew_Count(rs2.getInt(12));
		System.out.println("Flight details set");
	//	i++;
		
		
	}

//	ResultSet rs3 = stmt.executeQuery(flightinfoq);
	}catch(SQLException e){ System.out.println("SQL Exception" + e); }
	
	return flightlist;

}

public ActiveReservationsBean[] loadReservationsForFlight(int flightId) throws Exception{
	ActiveReservationsBean[] activeReservations = null;
	StringBuilder loadReservations = new StringBuilder();
	loadReservations.append("select r.reservation_id, rd.reservation_dtl_id, rd.flight_id, rd.date_of_journey, f.flight_no, f.source, f.destination," +
			"p.first_name, r.status, rd.boarding_status, p.last_name, rd.price+rd.tax price" +
			" from reservations r inner join reservation_details rd on r.reservation_id=rd.reservation_id" +
			" and r.status='Complete' " +
			" and rd.flight_id=" +flightId+ 
			" inner join flight f on f.flight_id=rd.flight_id " +
			" inner join traveller t on t.traveller_id=rd.traveller_id " +
			" inner join person p on p.person_id=t.person_id");
	System.out.println(loadReservations);
	Connection conn = null;
	try {
		conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet results = stmt.executeQuery(loadReservations.toString());
		int size = 0;
		if(results.last()) {
			size = results.getRow();
			results.beforeFirst();
		}
		activeReservations = new ActiveReservationsBean[size];
		int i=0;
		while(results.next()) {
			activeReservations[i] = new ActiveReservationsBean();
			activeReservations[i].setFlightId(results.getInt("rd.flight_id"));
			activeReservations[i].setFlightNo(results.getString("f.flight_no"));
			activeReservations[i].setSource(results.getString("f.source"));
			activeReservations[i].setDestination(results.getString("f.destination"));
			activeReservations[i].setFirstName(results.getString("p.first_name"));
			activeReservations[i].setLastName(results.getString("p.last_name"));
			activeReservations[i].setPrice(results.getDouble("price"));
			activeReservations[i].setDateOfJourney(results.getString("rd.date_of_journey"));
			activeReservations[i].setReservationDtlId(results.getInt("rd.reservation_dtl_id"));
			activeReservations[i].setReservationId(results.getInt("r.reservation_id"));
			activeReservations[i].setStatus(results.getString("r.status"));
			activeReservations[i].setBoardingStatus(results.getString("rd.boarding_status"));
			i++;
		}
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		if(conn!=null) {
			conn.close();
		}
	}
	return activeReservations;
}
/*
public FlightDetailsBean[] searchReturnFlight(FlightDetailsBean flightdetails){
	
	int count=0;
	FlightDetailsBean[] matchedflights=null;
	Connection connection = getConnection();
	
	try{
	String csearchQuery="Select count(*) From flightdetails where Flight_Source ='"+ flightdetails.getDestination() + "' and Flight_Destination ='"
	 + flightdetails.getSource() +"' and Depart_date between DATE_SUB('" +flightdetails.getDate_of_return()+ "', INTERVAL 5 DAY) and DATE_ADD('"+flightdetails.getDate_of_return()+"', INTERVAL 5 DAY)";
	stmt=connection.createStatement();
	
	//cprstmt1.setString(1,flightdetails.getSource());
	//cprstmt1.setString(2,flightdetails.getDestination());
	
	ResultSet count_rs1 = stmt.executeQuery(csearchQuery);	
	
	while(count_rs1.next()){
		count = Integer.parseInt(count_rs1.getString(1));
	}
	
	System.out.println("Value of C"+ count);
	matchedflights = new FlightDetailsBean[count];			
	
	
	String searchQuery="Select f.Flight_Number,f.Airline_Name,f.Flight_Source,f.Flight_Destination,f.Flight_Depart_Time,f.Flight_Arr_Time,"
			+ "f.Flight_Fare,f.No_Of_Seats,f.Crew_count,f.Flight_Id, f.Depart_date "
			+ " From flightdetails f where Flight_Source = ? and Flight_Destination = ? "
			+ "and Depart_date between DATE_SUB(?,INTERVAL 5 DAY) and DATE_ADD(?,INTERVAL 5 DAY)";
	System.out.println("2 "+ flightdetails.getDestination());
	prstmt1 = connection.prepareStatement(searchQuery);
	prstmt1.setString(1,flightdetails.getDestination());
	prstmt1.setString(2,flightdetails.getSource());
	System.out.println(" date "+ flightdetails.getDate_of_journey());
	prstmt1.setString(3, flightdetails.getDate_of_return());	
	prstmt1.setString(4, flightdetails.getDate_of_return());	
	rs1 = prstmt1.executeQuery();		
	System.out.println(searchQuery);
//	FlightDetailsBean[] matchflightdetails = new FlightDetailsBean[500];
	int i=0;
	while (rs1.next() && i < count){
		System.out.println("Start setting");
		matchedflights[i] = new FlightDetailsBean();
	//	System.out.println("flight details "+ i + rs1.getString(1));
		matchedflights[i].setFlightid(rs1.getInt(10));
		matchedflights[i].setDate_of_return(rs1.getString(11));
		matchedflights[i].setFlightnumber(rs1.getString(1));
		matchedflights[i].setAirlinename(rs1.getString(2));			
		matchedflights[i].setSource(rs1.getString(3));			
		matchedflights[i].setDestination(rs1.getString(4));		
		matchedflights[i].setDeparture(rs1.getString(5));
		matchedflights[i].setArrival(rs1.getString(6));			
		matchedflights[i].setFare(rs1.getDouble(7));
		matchedflights[i].setTravelclass("Economy");
		matchedflights[i].setDate_of_return("");
//		matchedflights[i].setDate_of_journey(flightdetails.getDate_of_journey());
//		matchedflights[i].setDate_of_return(null);
//		matchedflights[i].setDeparture(rs1.getString(7));			
//		matchedflights[i].setArrival(rs1.getString(8));			
		i+=1;
		System.out.println("setting values");
		}//end while
//	i=0;
//	while(i<count) {
//		System.out.println(matchedflights[i].toString());
//	}
	}catch(SQLException e){ e.printStackTrace();}
	return matchedflights; 		
}
*/
}	

	
	
	


/*
//package Connection;
import java.sql.*;
import java.util.*;

//import viewPackage.BoughtItems;
import fdpackage.FlightDetailsBean;

public class DatabaseConnection {
	static Connection connection; 
	static String url; 
	//static String URL ="jdbc:mysql://localhost/airline";
	
	static String URL ="jdbc:mysql://localhost:3306/airline";
	static String username= "root" ;
	static String password = "root";
	static String password = "root";
	static ResultSet rs1,rs2,rs3,rs4,rs5,rs6,rs7,rs8,rs9,rs10,rs11,rs12,rs13;
	static ResultSet count_rs1,count_rs2;
	PreparedStatement prstmt1,prstmt2,prstmt3,prstmt4,prstmt5,prstmt6,prstmt7,prstmt8,prstmt9,prstmt10,prstmt11,prstmt12,prstmt13;
	PreparedStatement cprstmt1,cprstmt2,cprstmt3;
	Statement stmt;
	Map<String, String> errorMsg = new HashMap<String, String>();
	
	public static Connection getConnection() 
	{ 
		
		try
		{
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			connection=DriverManager.getConnection(URL,username,password);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	//	log.info("Exit from getConnection in DataBaseConnection");
		
		return connection;
	}
	
	public FlightDetailsBean[] searchOneWayFlight(FlightDetailsBean flightdetails){
		
		int count=0;
		FlightDetailsBean[] matchedflights=null;
		Connection connection = getConnection();
		
		try{
		String csearchQuery="Select count(*) From flightdetails where Flight_Source ='"+ flightdetails.getSource() + "' and Flight_Destination ='"
		 + flightdetails.getDestination() +"' and Depart_date between DATE_SUB('" +flightdetails.getDate_of_journey()+ "', INTERVAL 5 DAY) and DATE_ADD('"+flightdetails.getDate_of_journey()+"', INTERVAL 5 DAY)";
		stmt=connection.createStatement();
		System.out.println(csearchQuery);
		//cprstmt1.setString(1,flightdetails.getSource());
		//cprstmt1.setString(2,flightdetails.getDestination());
		
		ResultSet count_rs1 = stmt.executeQuery(csearchQuery);	
		
		while(count_rs1.next()){
			count = Integer.parseInt(count_rs1.getString(1));
		}
		
		System.out.println("Value of C"+ count);
		matchedflights = new FlightDetailsBean[count];			
		
		
		String searchQuery="Select f.Flight_Number,f.Airline_Name,f.Flight_Source,f.Flight_Destination,f.Flight_Depart_Time,f.Flight_Arr_Time,"
				+ "f.Flight_Fare,f.No_Of_Seats,f.Crew_count,f.Flight_Id, f.Depart_date "
				+ " From flightdetails f where Flight_Source = ? and Flight_Destination = ? "
				+ "and Depart_date between DATE_SUB(?,INTERVAL 5 DAY) and DATE_ADD(?,INTERVAL 5 DAY)";
		System.out.println("2 "+ flightdetails.getDestination());
		prstmt1 = connection.prepareStatement(searchQuery);
		prstmt1.setString(1,flightdetails.getSource());
		prstmt1.setString(2,flightdetails.getDestination());
		prstmt1.setString(3, flightdetails.getDate_of_journey());	
		prstmt1.setString(4, flightdetails.getDate_of_journey());	
		rs1 = prstmt1.executeQuery();		
		System.out.println(searchQuery);
	//	FlightDetailsBean[] matchflightdetails = new FlightDetailsBean[500];
		int i=0;
		while (rs1.next()){
			System.out.println("Start setting");
			matchedflights[i] = new FlightDetailsBean();
		//	System.out.println("flight details "+ i + rs1.getString(1));
			matchedflights[i].setFlightId(rs1.getInt(10));
			matchedflights[i].setDate_of_journey(rs1.getString(11));
			matchedflights[i].setFlightnumber(rs1.getString(1));
			matchedflights[i].setAirlinename(rs1.getString(2));			
			matchedflights[i].setSource(rs1.getString(3));			
			matchedflights[i].setDestination(rs1.getString(4));		
			matchedflights[i].setDeparture(rs1.getString(5));
			matchedflights[i].setArrival(rs1.getString(6));			
			matchedflights[i].setFare(rs1.getDouble(7));
			matchedflights[i].setTravelclass("Economy");
			matchedflights[i].setDate_of_return("");
	//		matchedflights[i].setDate_of_journey(flightdetails.getDate_of_journey());
	//		matchedflights[i].setDate_of_return(null);
	//		matchedflights[i].setDeparture(rs1.getString(7));			
	//		matchedflights[i].setArrival(rs1.getString(8));			
			i+=1;
			System.out.println("setting values");
			}//end while
		i=0;
		while(i<count) {
			System.out.println(matchedflights[i].toString());
		}
		}catch(SQLException e){ e.printStackTrace();}
		return matchedflights; 		
	}

}	
	
	
	
*/