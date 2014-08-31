package helperClasses;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.jws.WebService;

import beanFiles.ActiveReservationsBean;

import java.util.Date;
//import java.sql.Connection;




import fdpackage.*;

@WebService
public class SearchFlightsHelper {
//	Connection connection=null;
	String flightdetails = " f.Flight_Number,f.Airline_Name,f.Flight_Source,f.Flight_Destination,"
			+ "f.Flight_Depart_Time,f.Flight_Arr_Time,f.Flight_Fare,f.No_Of_Seats,f.Crew_count,f.Flight_Id,"
			+ "f.Depart_date ";
	PreparedStatement prstmt1,prstmt2,prstmt3,prstmt4,prstmt5,prstmt6,prstmt7,prstmt8,prstmt9,prstmt10,prstmt11,prstmt12,prstmt13;
	PreparedStatement cprstmt1,cprstmt2,cprstmt3;
	static ResultSet rs1,rs2,rs3,rs4,rs5,rs6,rs7,rs8,rs9,rs10,rs11,rs12,rs13;
	static ResultSet count_rs1,count_rs2;
	Statement stmt;
	
	public SearchFlightsHelper(){
	//	connection = DBHelper.getConnection();
	}

	// To search one-way flight for a customer
	public FlightDetailsBean[] searchOneWayFlight(FlightDetailsBean flightdetails){
	
		int count=0;
		FlightDetailsBean[] matchedflights=null;
		try{
		Connection  connection = DBHelper.getConnection();
	//	Connection connection = getConnection();
		
		
		String csearchQuery="Select count(*) From flightdetails where Flight_Source ='"+ flightdetails.getSource() + "' and Flight_Destination ='"
		 + flightdetails.getDestination() +"' and Depart_date between DATE_SUB('" +flightdetails.getDate_of_journey()+ "', INTERVAL 5 DAY) and DATE_ADD('"+flightdetails.getDate_of_journey()+"', INTERVAL 5 DAY)";
		Statement stmt=connection.createStatement();
	
		
		ResultSet count_rs1 = stmt.executeQuery(csearchQuery);	
		
		while(count_rs1.next()){
			count = Integer.parseInt(count_rs1.getString(1));
		}
		
		matchedflights = new FlightDetailsBean[count];			
		
		
		String searchQuery="Select"
				+ flightdetails
				+ " From flightdetails f where Flight_Source = ? and Flight_Destination = ?"
				+ " and Depart_date between DATE_SUB(?,INTERVAL 5 DAY) and DATE_ADD(?,INTERVAL 5 DAY)";
		prstmt1 = connection.prepareStatement(searchQuery);
		prstmt1.setString(1,flightdetails.getSource());
		prstmt1.setString(2,flightdetails.getDestination());
		prstmt1.setString(3, flightdetails.getDate_of_journey());	
		prstmt1.setString(4, flightdetails.getDate_of_journey());	
		rs1 = prstmt1.executeQuery();		
		int i=0;
		while (rs1.next() && i < count){ 
			matchedflights[i] = new FlightDetailsBean();
			matchedflights[i].setFlightId(rs1.getInt("f.Flight_Id"));
			matchedflights[i].setDate_of_journey(rs1.getString("f.Depart_date"));
			matchedflights[i].setFlightnumber(rs1.getString("f.Flight_Number"));
			matchedflights[i].setAirlinename(rs1.getString("f.Airline_Name"));			
			matchedflights[i].setSource(rs1.getString("f.Flight_Source"));			
			matchedflights[i].setDestination(rs1.getString("f.Flight_Destination"));		
			matchedflights[i].setDeparture(rs1.getString("f.Flight_Depart_Time"));
			matchedflights[i].setArrival(rs1.getString("f.Flight_Arr_Time"));	
			System.out.println(" Fare " + rs1.getDouble("f.Flight_fare"));
			matchedflights[i].setFare(rs1.getDouble(7));
			matchedflights[i].setTravelclass("Economy");
			matchedflights[i].setDate_of_return("");
			i+=1;
		//	System.out.println("setting values");
			}//end while
		}catch(SQLException e){ e.printStackTrace();}
		catch(Exception e){e.printStackTrace();}
		return matchedflights; 		

	}
	
	// To Search Return Flight for a customer
	public FlightDetailsBean[] searchReturnFlight(FlightDetailsBean flightdetails){
		FlightDetailsBean[] matchflightdetails = new FlightDetailsBean[500];
		return matchflightdetails; 		
	}
	
	// To search and return all the cancelled flights at any date
	public FlightDetailsBean[] searchCancelledFlights(Date date){
		FlightDetailsBean[] cancelledFlights = new FlightDetailsBean[100];
		return cancelledFlights; 			
	}
	
	// To search a already booked flight by booking reference id provided by customer
	public FlightDetailsBean searchFlightByBookingId(FlightDetailsBean flightdetails){
		FlightDetailsBean matchedflightId = new FlightDetailsBean();
		return matchedflightId;
	}
	
	//To search a customer by booking referenceId or emailId 
	public CustomerBean searchCustomerByBookingIdRef(CustomerBean cust) {
		CustomerBean customer = new CustomerBean();
		return customer;
	} 
	
	public FlightListBean[] getFlightlist(){
		//FlightListBean[] flightlist = new FlightListBean[1000];
		FlightListBean[] flightlist = connection.getFlightList();
		return flightlist;
	}
	
	public boolean updateFlight(FlightListBean flight)
	{
		boolean flag = connection.updateFlight(flight);
		return flag;
	}
	
	public FlightListBean getFlightInfo(FlightListBean flbean) {
		FlightListBean flightinfobean = new FlightListBean();
		flightinfobean = connection.getFlightInfo(flbean);
		return flightinfobean;
	}
	
	public ActiveReservationsBean[] loadReservationsForFlight(int flightId) throws Exception 
	{
		ActiveReservationsBean[] activereservations = connection.loadReservationsForFlight(flightId);
		return activereservations;
		
		
	}
}
