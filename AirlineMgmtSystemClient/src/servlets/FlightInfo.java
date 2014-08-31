package servlets;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fdpackage.FlightListBean;
import beanFiles.ActiveReservationsBean;
import DefaultNamespace.*;
import helperClasses.*;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FlightInfo
 */
@WebServlet("/FlightInfo")
public class FlightInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		FlightListBean bean = new FlightListBean();
		FlightListBean returnbean = new FlightListBean();
		bean.setFlight_Number(null);
		bean.setFlight_id(Integer.parseInt(request.getParameter("flightid")));
		bean.setAirline_Name(null);
		bean.setCrew_Count(0);
		bean.setDepart_date(null);
		bean.setFlight_Arr_Time(null);
		bean.setFlight_Depart_Time(null);
		bean.setFlight_Source(null);
		bean.setFlight_Destination(null);
		bean.setFlight_fare(0);
		bean.setCrew_Count(0);
		bean.setNo_of_seats(0);
		
		SearchFlightsHelperProxy proxy = new SearchFlightsHelperProxy();
		returnbean = proxy.getFlightInfo(bean);
		HttpSession session = request.getSession();
		
		System.out.println("Return Bean"+ returnbean);
		session.setAttribute("flightinfobean", returnbean);
	/*	
		ReservationHelperProxy proxy1 = new ReservationHelperProxy();
		
		System.out.println("Airline name "+ returnbean.getAirline_Name());
		System.out.println("Airline name "+ returnbean.getCrew_Count());
		System.out.println("Airline name "+ returnbean.getDepart_date());
		
		ActiveReservationsBean[] activeReservations = proxy1.loadReservationsForFlight(Integer.parseInt(request.getParameter("flightid")));
		
		for(int i=0;i<activeReservations.length;i++)
		System.out.println("Active Reservations "+ activeReservations[i].getFirstName()); */
		RequestDispatcher rd = request.getRequestDispatcher("/JSP/flightdetail.jsp");
		rd.forward(request, response);
		
	}

}
