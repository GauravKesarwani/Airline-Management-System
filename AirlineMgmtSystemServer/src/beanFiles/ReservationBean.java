package beanFiles;

import java.util.Date;

public class ReservationBean {
	private int reservationId;
//	private String email;
//	private String contactNo;
	private String typeOfJourney;
	private ReservationDetailBean[] reservationDtls;
	private String status;
	private Date creationDate;
	private String createdBy;
	private Date lastUpdatedAt;
	private String lastUpdated;
	private int customerId;

	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}
		
	public String getTypeOfJourney() {
		return typeOfJourney;
	}
	public void setTypeOfJourney(String typeOfJourney) {
		this.typeOfJourney = typeOfJourney;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
/*	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
*/	public ReservationDetailBean[] getReservationDtls() {
		return reservationDtls;
	}
	public void setReservationDtls(ReservationDetailBean[] reservationDtls) {
		this.reservationDtls = reservationDtls;
	}
/*	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
*/	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	
}