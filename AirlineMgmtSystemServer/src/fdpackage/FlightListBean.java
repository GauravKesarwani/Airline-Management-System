package fdpackage;

public class FlightListBean {
	
	private int Flight_id;
	private String Flight_Number;
	private String Airline_Name;
	private String Depart_date;
	private String Flight_Source;
	private String Flight_Destination;
	private String Flight_Depart_Time;
	private String Flight_Arr_Time;
	private float Flight_fare;
	private int No_of_seats;
	private int Crew_Count;
	public int getFlight_id() {
		return Flight_id;
	}
	public void setFlight_id(int flight_id) {
		Flight_id = flight_id;
	}
	public String getAirline_Name() {
		return Airline_Name;
	}
	public void setAirline_Name(String airline_Name) {
		Airline_Name = airline_Name;
	}
	public String getDepart_date() {
		return Depart_date;
	}
	public void setDepart_date(String depart_date) {
		Depart_date = depart_date;
	}
	public String getFlight_Source() {
		return Flight_Source;
	}
	public void setFlight_Source(String flight_Source) {
		Flight_Source = flight_Source;
	}
	public String getFlight_Destination() {
		return Flight_Destination;
	}
	public void setFlight_Destination(String flight_Destination) {
		Flight_Destination = flight_Destination;
	}
	public String getFlight_Depart_Time() {
		return Flight_Depart_Time;
	}
	public void setFlight_Depart_Time(String flight_Depart_Time) {
		Flight_Depart_Time = flight_Depart_Time;
	}
	public String getFlight_Arr_Time() {
		return Flight_Arr_Time;
	}
	public void setFlight_Arr_Time(String flight_Arr_Time) {
		Flight_Arr_Time = flight_Arr_Time;
	}
	public float getFlight_fare() {
		return Flight_fare;
	}
	public void setFlight_fare(float flight_fare) {
		Flight_fare = flight_fare;
	}
	public int getNo_of_seats() {
		return No_of_seats;
	}
	public void setNo_of_seats(int no_of_seats) {
		No_of_seats = no_of_seats;
	}
	public int getCrew_Count() {
		return Crew_Count;
	}
	public void setCrew_Count(int crew_Count) {
		Crew_Count = crew_Count;
	}
	public String getFlight_Number() {
		return Flight_Number;
	}
	public void setFlight_Number(String flight_Number) {
		Flight_Number = flight_Number;
	}
}
