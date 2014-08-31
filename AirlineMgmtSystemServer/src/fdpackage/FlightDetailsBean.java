package fdpackage;

public class FlightDetailsBean {
	
	private int flightId;
	private String source;
	private String destination;
	private String flightnumber;
	private String airlinename;
	private String departure;
	private String arrival;
	private String date_of_journey;
	private String date_of_return;
	private double fare;
	private String travelclass;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate_of_journey() {
		return date_of_journey;
	}
	public void setDate_of_journey(String date_of_journey) {
		this.date_of_journey = date_of_journey;
	}
	public String getDate_of_return() {
		return date_of_return;
	}
	public void setDate_of_return(String date_of_return) {
		this.date_of_return = date_of_return;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public String getAirlinename() {
		return airlinename;
	}
	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
/*	public String getFare() {
		return fare;
	}
	public void setFare(String fare) {
		this.fare = fare;
	}
*/	public String getTravelclass() {
		return travelclass;
	}
	public void setTravelclass(String travelclass) {
		this.travelclass = travelclass;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public void setFare(double fare) {
		this.fare = fare;
	} 	

}
