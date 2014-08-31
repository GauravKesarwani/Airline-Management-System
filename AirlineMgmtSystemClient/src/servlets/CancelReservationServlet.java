package servlets;

import helperClasses.ReservationHelperProxy;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CancelReservationServlet
 */
@WebServlet("/CancelReservationServlet")
public class CancelReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancelReservationServlet() {
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
		ReservationHelperProxy proxy = new ReservationHelperProxy();
		proxy.setEndpoint("http://localhost:8080/AirlineMgmtSystemServer/services/ReservationHelper?wsdl");

		int customerId=Integer.parseInt(request.getParameter("customerId"));
		int reservationId = Integer.parseInt(request.getParameter("reservationId"));
		proxy.cancelReservation(customerId, reservationId);
		RequestDispatcher rd = request.getRequestDispatcher("/MyReservationsServlet");
		rd.forward(request, response);
	}

}
