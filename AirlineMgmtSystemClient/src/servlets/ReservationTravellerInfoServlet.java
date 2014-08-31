
package servlets;

import helperClasses.ReservationHelperProxy;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beanFiles.PersonBean;
import beanFiles.ReservationBean;
import beanFiles.ReservationDetailBean;

/**
 * Servlet implementation class ReservationTravellerInfoServlet
 */
@WebServlet("/ReservationTravellerInfoServlet")
public class ReservationTravellerInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservationTravellerInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] firstNameList = request.getParameterValues("firstName");
		String[] middleNameList = request.getParameterValues("middleName");
		String[] lastNameList = request.getParameterValues("lastName");
		String[] genderList = request.getParameterValues("gender");
		String[] dobList = request.getParameterValues("dob");
		String[] idNoList = request.getParameterValues("idNo");
		String[] idTypeList = request.getParameterValues("idType");
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		int noOfTravellers = firstNameList.length;
		
		ReservationHelperProxy proxy = new ReservationHelperProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineMgmtSystemServer/services/ReservationHelper?wsdl");
		ReservationBean reservationBean = new ReservationBean();
		ReservationDetailBean[] detailBeans = new ReservationDetailBean[noOfTravellers];
		
		for(int i=0;i<noOfTravellers; i++) {
			PersonBean personBean = new PersonBean();
			personBean.setFirst_name(firstNameList[i]);
			personBean.setMiddle_initial(middleNameList[i]);
			personBean.setLast_name(lastNameList[i]);
			personBean.setId_type(idTypeList[i]);
			personBean.setId_no(idNoList[i]);
			try{
				cal2.setTime(format.parse(request.getParameter("dateOfJourney")));
				cal.setTime(format.parse(dobList[i]));
			} catch(Exception e) {
				System.out.println("Error in parsing. Date not in right format");
			}
			personBean.setPerson_id(1);
			personBean.setDate_of_birth(cal);
			personBean.setGender(genderList[i]);
			personBean.setCreation_date(Calendar.getInstance());
			personBean.setLast_updated(Calendar.getInstance());
			personBean.setCreated_by("Birva");
			personBean.setLast_updated_by("Birva");
			detailBeans[i] = new ReservationDetailBean();
			detailBeans[i].setTraveller(personBean);
			detailBeans[i].setFlightId(request.getParameter("flightId"));
			detailBeans[i].setDateOfJourney(cal2);
			detailBeans[i].setStatus("InCheckout");
			detailBeans[i].setPrice(Double.parseDouble(request.getParameter("price")));
			detailBeans[i].setTax(Double.parseDouble(request.getParameter("price"))*0.1);
			detailBeans[i].setBoardingStatus("NotBoarded");
			detailBeans[i].setCreatedBy("Birva");
			detailBeans[i].setLastUpdated("Birva");
			detailBeans[i].setCreationDate(Calendar.getInstance());
			detailBeans[i].setLastUpdatedAt(Calendar.getInstance());
		}
/*		reservationBean.setEmail("birvaj@gmail.com");
		reservationBean.setContactNo("+91-948911441");
*/		reservationBean.setStatus("InCheckout");
		reservationBean.setTypeOfJourney("one-way");
		reservationBean.setReservationDtls(detailBeans);
		reservationBean.setCreatedBy("Birva");
		reservationBean.setLastUpdated("Birva");
		reservationBean.setCreationDate(Calendar.getInstance());
		reservationBean.setLastUpdatedAt(Calendar.getInstance());
		if(request.getSession().getAttribute("person_id")!=null) {
			reservationBean.setCustomerId((Integer)request.getSession().getAttribute("person_id"));
			System.out.println(request.getSession().getAttribute("person_id") + "-" + reservationBean.getCustomerId());
		}
		ReservationBean newReservation = proxy.createNewReservations(reservationBean);
		if(newReservation!=null) {
			request.setAttribute("reservationId", newReservation.getReservationId());
			request.getSession().setAttribute("reservationId", newReservation.getReservationId());
			// Over to payment page from here!
			response.sendRedirect("/AirlineMgmtSystemClient/Payment.jsp");
		} else {
//			response.sendRedirect("/AirlineMgmtSystemClient/servlets/SearchServlet?errorMessage=We faced a problem creating the purchase. Please try again.");
			response.sendRedirect("/AirlineMgmtSystemClient/JSP/index.html?errorMessage=We faced a problem creating the purchase. Please try again.");
		}
	}
}
