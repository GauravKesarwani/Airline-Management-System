
import java.sql.Date;
public class Ticketbean {

	private String firstName;
	private String LastName;
	private String flightNo;
	private String Departuredate;
	private int amount;
	private Date payment;
	private String type;
	
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
	public String getDeparturedate() {
		return Departuredate;
	}
	public void setDeparturedate(String departuredate) {
		Departuredate = departuredate;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getPayment() {
		return payment;
	}
	public void setPayment(Date payment) {
		this.payment = payment;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
