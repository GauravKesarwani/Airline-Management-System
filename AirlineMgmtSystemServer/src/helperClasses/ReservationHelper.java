package helperClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

import beanFiles.ActiveReservationsBean;
import beanFiles.PersonBean;
import beanFiles.ReservationBean;
import beanFiles.ReservationDetailBean;

@WebService
public class ReservationHelper {
	String travellerColumns = "traveller_id, id_type, id_no, person_id, creation_date, created_by, last_updated, last_updated_by";
	String personColumns = "person_id, id_no, id_type, first_name, last_name, middle_initial, gender, date_of_birth, " +
			"creation_date, created_by, last_updated, last_updated_by";
	String reservationColumns = "reservation_id, customer_id, no_of_people, type_of_journey, status," +
			"creation_date, created_by, last_updated, last_updated_by";
	String reservationDetailsColumns = "reservation_dtl_id, reservation_id, traveller_id, flight_id, seat_no, " +
			"price, tax, date_of_journey, travel_class, status, boarding_status," +
			"creation_date, created_by, last_updated, last_updated_by";
	String delimiter = "$";

	public ReservationBean createNewReservations(ReservationBean reservation) throws Exception {
		List<String> travellerSqlList = new ArrayList<String>();
		List<String> personSqlList = new ArrayList<String>();
		List<String> reservationDtlSqlList = new ArrayList<String>();
		List<String> idList = new ArrayList<String>();
		SimpleDateFormat dobFormat = new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		int flag=0;
		int reservationId = 0;
		System.out.println("From serviice : " +reservation.getCustomerId());
		StringBuilder exceptionMsg = new StringBuilder();
		String deleteInCheckoutSql = "update reservations r inner join reservation_details rd on r.reservation_id=rd.reservation_id" +
				" set r.status='Deleted', rd.status='Deleted'" +
				" where r.customer_id="+reservation.getCustomerId()+" and r.status='InCheckout'";
		
		StringBuilder reservationSql = new StringBuilder();
		reservationSql.append("insert into reservations (" +reservationColumns+ ") values(");
		reservationSql.append("null,");
		reservationSql.append(reservation.getCustomerId()+", ");
		reservationSql.append(reservation.getReservationDtls().length+ ",");
		reservationSql.append("'" +reservation.getTypeOfJourney()+ "',");
		reservationSql.append("'InCheckout',");
		reservationSql.append("now(),'"+reservation.getCreatedBy()+"',now(),'"+reservation.getLastUpdated()+"'");
		reservationSql.append(")");
		
		if(reservation.getReservationDtls()!=null && reservation.getReservationDtls().length>0) {
			for(ReservationDetailBean detailBean : reservation.getReservationDtls()) {
				PersonBean traveller = detailBean.getTraveller();
				
				StringBuilder personSql = new StringBuilder();
				personSql.append("insert ignore into person (" +personColumns+ ") values(");
				personSql.append("null,");
				personSql.append("'" +traveller.getId_type()+ "',");
				personSql.append("'" +traveller.getId_no()+ "',");
				personSql.append("'" +traveller.getFirst_name()+ "',");
				personSql.append("'" +traveller.getLast_name()+ "',");
				personSql.append("'" +traveller.getMiddle_initial()+ "',");
				personSql.append("'" +traveller.getGender()+ "',");
				personSql.append("'" + dobFormat.format(traveller.getDate_of_birth())+ "',");
				personSql.append("now(),'"+traveller.getCreated_by()+"',now(),'"+traveller.getLast_updated_by()+ "'");
				personSql.append(")");
				personSqlList.add(personSql.toString());
				
				StringBuilder travellerSql = new StringBuilder();
				travellerSql.append("insert ignore into traveller (" +travellerColumns+ ") values(");
				travellerSql.append("null,");
				travellerSql.append("'" +traveller.getId_type()+ "',");
				travellerSql.append("'" +traveller.getId_no()+ "',");
				travellerSql.append("personId, ");
				travellerSql.append("now(),'"+traveller.getCreated_by()+"',now(),'"+traveller.getLast_updated() +"'");
				travellerSql.append(")");
				travellerSqlList.add(travellerSql.toString());
				idList.add(traveller.getId_no() +delimiter+ traveller.getId_type());
				
				StringBuilder reservationDtlSql = new StringBuilder();
				reservationDtlSql.append("insert into reservation_details ("+reservationDetailsColumns+ ") values(");
				reservationDtlSql.append("null, reservationId, travellerId, ");
				reservationDtlSql.append("'" +detailBean.getFlightId()+ "',");
				reservationDtlSql.append("'" +detailBean.getSeatNo()+ "',");
				reservationDtlSql.append(detailBean.getPrice()+ ",");
				reservationDtlSql.append(detailBean.getTax()+ ",");
				reservationDtlSql.append("'" +dateFormat.format(detailBean.getDateOfJourney())+ "',");
				reservationDtlSql.append("'" +detailBean.getTravelClass()+ "',");
				reservationDtlSql.append("'" +detailBean.getStatus()+ "',");
				reservationDtlSql.append("'" +detailBean.getBoardingStatus()+ "',");
				reservationDtlSql.append("now(),'"+detailBean.getCreatedBy()+"',now(),'"+detailBean.getLastUpdated() +"'");
				reservationDtlSql.append(")");
				reservationDtlSqlList.add(reservationDtlSql.toString());
			}
			
		} else {
			flag=1;
			exceptionMsg.append("proper errorMessage");
			// throw Exception with proper error message.
		}
		if(isValidString(exceptionMsg.toString())) {
			System.out.println("ExceptionMsg ma gayu");
			//throw Exception with proper error message
		} else {
			// store values in database.
			try {
				reservationId = insertNewRecords(reservationDtlSqlList, travellerSqlList, personSqlList, deleteInCheckoutSql, reservationSql.toString(), idList);
			} catch (Exception e) {
				exceptionMsg.append("Error while reserving the tickets. Please try again.");
			}
		}
		if(reservationId>0) {
			reservation.setReservationId(reservationId);
			return reservation;
		}
		else
			return null;
	}
		
	private int insertNewRecords(List<String> reservationDtls, List<String> travellersList, 
			List<String> personList, String deleteInCheckoutSql, String reservation, List<String> idList) throws Exception{
		int insertedRecords = 0;
		int reservationId = 1;
		System.out.println("Inserting records");
		Connection conn = null;
		try {
			conn = DBHelper.getConnection();
			System.out.println("Connection done");
			Statement stmt = conn.createStatement();
			System.out.println("Before setting autoCommit");
			Statement deleteInCheckoutStmt = conn.createStatement();
			deleteInCheckoutStmt.executeUpdate(deleteInCheckoutSql);
			conn.setAutoCommit(false);
			System.out.println("Reservation : " +reservation);
			stmt.executeUpdate(reservation, Statement.RETURN_GENERATED_KEYS);
			
			ResultSet keys = stmt.getGeneratedKeys();
			while(keys.next()) {
				reservationId = keys.getInt(1);
			}
			for(int i=0; i<reservationDtls.size(); i++) {
				Statement sPerson = conn.createStatement();
				int travellerId =1;
				System.out.println(personList.get(i));
				int newPerson = sPerson.executeUpdate(personList.get(i), Statement.RETURN_GENERATED_KEYS);
				if(newPerson>0) {
					int personId = 1;
					ResultSet personIdKey = sPerson.getGeneratedKeys();
					while(personIdKey.next()) {
						personId = personIdKey.getInt(1);
					}
					String travellerSql = travellersList.get(i);
					Statement sTraveller = conn.createStatement();
					System.out.println(travellerSql.replaceAll("personId", String.valueOf(personId)));
					int newTraveller = sTraveller.executeUpdate(travellerSql.replaceAll("personId", String.valueOf(personId)), 
							Statement.RETURN_GENERATED_KEYS);
					
					ResultSet travellerIdKey = sTraveller.getGeneratedKeys();
					while(travellerIdKey.next()) {
						travellerId = travellerIdKey.getInt(1);
					}
				} else {
					System.out.println(idList.get(i));
					String[] idArray = idList.get(i).split("["+delimiter+"]");
					System.out.println(idArray.length);
					String idNo = idArray[0];
					String idType = idArray[1];
					PreparedStatement getTravellerId = conn.prepareStatement("select traveller_id from traveller where id_no=? and id_type=?");
					getTravellerId.setString(1, idNo);
					getTravellerId.setString(2, idType);
					ResultSet travellerIdSet = getTravellerId.executeQuery();
					while(travellerIdSet.next()) 
						travellerId=travellerIdSet.getInt(1);
				}
				Statement reservationDtlStmt = conn.createStatement();
				System.out.println(reservationDtls.get(i).replace("travellerId", String.valueOf(travellerId))
						.replace("reservationId", String.valueOf(reservationId)));
				int rdRows = reservationDtlStmt.executeUpdate(reservationDtls.get(i).replace("travellerId", String.valueOf(travellerId))
						.replace("reservationId", String.valueOf(reservationId)));
				insertedRecords+=insertedRecords;
			}
			conn.commit();
			conn.setAutoCommit(true);
		} catch(Exception e) {
			e.printStackTrace();
			if(!conn.getAutoCommit()) {
				System.out.println("Rolled back");
				conn.rollback();
				conn.setAutoCommit(true);
			}
		} finally {
			if(conn!=null)
				ConnectionPool.addConnectionToPool(conn);
		}
		return reservationId;
	}

	public ActiveReservationsBean[] cancelReservation(int customerId, int reservationId) throws Exception{
		StringBuilder cancelResSql = new StringBuilder();
		cancelResSql.append("update reservations r inner join reservation_details rd on r.reservation_id=rd.reservation_id" +
				" set r.status='Cancelled', rd.status='Cancelled' where r.reservation_id="+reservationId);
		StringBuilder updateNoOfSeats = new StringBuilder();
		updateNoOfSeats.append("update flightdetails f inner join reservation_details rd on rd.flight_id=f.Flight_Id set f.No_Of_Seats = f.No_Of_Seats+1 where rd.reservation_id="+reservationId);
		Connection conn = null;
		try {
			conn = DBHelper.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(cancelResSql.toString());
			stmt.executeUpdate(updateNoOfSeats.toString());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(conn!=null) {
				ConnectionPool.addConnectionToPool(conn);;
			}
		}
		return loadReservationsForCustomer(customerId, "Active");
	}
	
	public ActiveReservationsBean[] cancelReservationDtl(int customerId, int[] reservationDtlId) throws Exception{
		StringBuilder cancelResSql = new StringBuilder();
		cancelResSql.append("update reservation_details rd " +
				" set rd.status='Cancelled', rd.boarding_status='Cancelled' where rd.reservation_dtl_id in("+Arrays.toString(reservationDtlId)+")");
		Connection conn = null;
		try {
			conn = DBHelper.getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(cancelResSql.toString());
			Statement updateSeatsSql = conn.createStatement();
			updateSeatsSql.executeUpdate("update flightdetails f inner join reservation_details rd " +
					"on rd.flight_id=f and rd.reservation_dtl_id in ("+cancelResSql.toString()+") " +
					"set noOfSeats=noOfSeats+1");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(conn!=null) {
				ConnectionPool.addConnectionToPool(conn);;
			}
		}
		return loadReservationsForCustomer(customerId, "Active");
	}
	
	public ActiveReservationsBean[] loadReservationsForCustomer(int customerId, String status) throws Exception{
		ActiveReservationsBean[] activeReservations = null;
		StringBuilder loadReservations = new StringBuilder();
		loadReservations.append("select r.reservation_id, rd.reservation_dtl_id, rd.flight_id, rd.date_of_journey, f.Flight_Number, f.Flight_Source, f.Flight_Destination," +
				"p.first_name, r.status, rd.boarding_status, p.last_name, rd.price+rd.tax price" +
				" from reservations r inner join reservation_details rd on r.reservation_id=rd.reservation_id" +
				(status!=null? " and r.status='Complete'" : " and r.status in('Complete','Cancelled') ") + //and rd.status='Confirmed'" : " and r.status in('Complete', 'Cancelled')")+
				" and r.customer_id=" +customerId+ 
				" inner join flightdetails f on f.Flight_Id=rd.flight_id " +
				" inner join traveller t on t.traveller_id=rd.traveller_id " +
				" inner join person p on p.person_id=t.person_id");
		System.out.println(loadReservations);
		Connection conn = null;
		try {
			conn = DBHelper.getConnection();
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
				activeReservations[i].setFlightNo(results.getString("f.Flight_Number"));
				activeReservations[i].setSource(results.getString("f.Flight_Source"));
				activeReservations[i].setDestination(results.getString("f.Flight_Destination"));
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
				ConnectionPool.addConnectionToPool(conn);
			}
		}
		return activeReservations;
	}
	
	private boolean isValidString(String str) {
		if(str==null || str.length()<=0)
			return false;
		else
			return true;
	}
	
	public ActiveReservationsBean[] loadReservationsForFlight(int flightId) throws Exception{
		ActiveReservationsBean[] activeReservations = null;
		StringBuilder loadReservations = new StringBuilder();
		loadReservations.append("select r.reservation_id, rd.reservation_dtl_id, rd.flight_id, rd.date_of_journey, f.Flight_Number, f.Flight_Source, f.Flight_Destination," +
				"p.first_name, r.status, rd.boarding_status, p.last_name, rd.price+rd.tax price" +
				" from reservations r inner join reservation_details rd on r.reservation_id=rd.reservation_id" +
				" and r.status='Complete' " +
				" and rd.flight_id=" +flightId+ 
				" inner join flightdetails f on f.Flight_Id=rd.flight_id " +
				" inner join traveller t on t.traveller_id=rd.traveller_id " +
				" inner join person p on p.person_id=t.person_id");
		System.out.println(loadReservations);
		Connection conn = null;
		try {
			conn = DBHelper.getConnection();
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
				activeReservations[i].setFlightNo(results.getString("f.Flight_Number"));
				activeReservations[i].setSource(results.getString("f.Flight_Source"));
				activeReservations[i].setDestination(results.getString("f.Flight_Destination"));
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
				ConnectionPool.addConnectionToPool(conn);;
			}
		}
		return activeReservations;
	}
	
/*	public ReservationBean[] cancelReservations(int[] ticketIds) {
		ReservationDetailBean[] reservations = new ReservationDetailBean[ticketIds.length];
		return getReservationsByReservationIds(ticketIds);
	}
	
	public ReservationBean[] updateReservations(ReservationBean[] reservations) {
		ReservationBean[] updatedTickets = new ReservationBean[reservations.length];
		return updatedTickets;
	}
	
	public ReservationBean[] getReservationsByReservationIds(int reservationIds[]) {
		ReservationBean[] reservations = new ReservationBean[reservationIds.length];
		return reservations;
	}
	
	public ReservationBean[] getAllReservations() {
		int size=0;
		return (new ReservationBean[size]);
	}*/
}
