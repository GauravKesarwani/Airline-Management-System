package beanFiles;

import java.util.Date;

public class ReservationDetailBean {
	private int reservationDtlId;
	private int reservationId;
	private PersonBean traveller;
	private String flightId;
	private String seatNo;
	private double price;
	private double tax;
	private Date dateOfJourney;
	private String travelClass;
	private String status;
	private String boardingStatus;
	private Date creationDate;
	private String createdBy;
	private Date lastUpdatedAt;
	private String lastUpdated;
	
	public int getReservationDtlId() {
		return reservationDtlId;
	}
	public void setReservationDtlId(int reservationDtlId) {
		this.reservationDtlId = reservationDtlId;
	}
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
/*	public int getTravellerId() {
		return travellerId;
	}
	public void setTravellerId(int travellerId) {
		this.travellerId = travellerId;
	}
*/	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public Date getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(Date dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public String getTravelClass() {
		return travelClass;
	}
	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBoardingStatus() {
		return boardingStatus;
	}
	public void setBoardingStatus(String boardingStatus) {
		this.boardingStatus = boardingStatus;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getLastUpdatedAt() {
		return lastUpdatedAt;
	}
	public void setLastUpdatedAt(Date lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
/*	public PersonBean[] getTravellerList() {
		return travellerList;
	}
	public void setTravellerList(PersonBean[] travellerList) {
		this.travellerList = travellerList;
	}
*/
	public PersonBean getTraveller() {
		return traveller;
	}
	public void setTraveller(PersonBean traveller) {
		this.traveller = traveller;
	}
	
}
