package ticket;

import java.io.Serializable;


public class TicketBean implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String LastName;
	private String flightNo;
	private String Departuredate;
	private int amount;
	private String type;
	private String source; 
	private String destination; 
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	public String getDeparturedate() {
		return Departuredate;
	}
	public void setDeparturedate(String departuredate) {
		Departuredate = departuredate;
	}
	
}
