package servlets;

import helperClasses.ReservationHelperProxy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import beanFiles.ActiveReservationsBean;

/**
 * Servlet implementation class MyReservationsServlet
 */
@WebServlet("/MyReservationsServlet")
public class MyReservationsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyReservationsServlet() {
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
		ReservationHelperProxy proxy = new ReservationHelperProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineMgmtSystemServer/services/ReservationHelper?wsdl");
		System.out.println("In MyReservationsServlet");
		HttpSession session = request.getSession();
		if(session.getAttribute("person_id")==null)
			session.setAttribute("person_id", 2);
		int customerId;
		if(session.getAttribute("person_id")!=null) {
			System.out.println((Integer)session.getAttribute("person_id"));
			customerId = (Integer)session.getAttribute("person_id");
			ActiveReservationsBean[] myReservations = proxy.loadReservationsForCustomer(customerId, null);
			Map<Integer, List<ActiveReservationsBean>> reservationMap = new HashMap<Integer, List<ActiveReservationsBean>>();
			if(myReservations!=null && myReservations.length>0) {
				for(ActiveReservationsBean reservation : myReservations) {
					int reservationId = reservation.getReservationId();
					if(!reservationMap.containsKey(reservationId)) {
						reservationMap.put(reservationId, new ArrayList<ActiveReservationsBean>());
					}
					reservationMap.get(reservationId).add(reservation);
				}
			}
			if(myReservations!=null && myReservations.length>0) {
				System.out.println("Fwding reservations");
				request.setAttribute("myReservations", reservationMap);
				RequestDispatcher rd = request.getRequestDispatcher("ManageReservations.jsp");
				rd.forward(request, response);
			} else {
				request.getSession().setAttribute("noResults", "No advertisements posted.");
				response.sendRedirect("ManageReservations.jsp?errorMessage=You do not have any active reservations.");
			}
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Welcome.jsp");
			rd.include(request, response);
		}
	}

}
