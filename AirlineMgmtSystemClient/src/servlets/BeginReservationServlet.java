package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BeginReservationServlet
 */
@WebServlet("/BeginReservationServlet")
public class BeginReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeginReservationServlet() {
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
		String[] flightIds = request.getParameterValues("flightId");
		int noOfPassengers = Integer.parseInt(request.getParameter("noOfPassengers"));
		String[] price = request.getParameterValues("price");
		String[] dateOfJourney = request.getParameterValues("dateOfJourney");
		request.setAttribute("price", price);
		request.setAttribute("dateOfJourney", dateOfJourney);
		request.setAttribute("flightId", flightIds);
		request.setAttribute("noOfPassengers", noOfPassengers);
		HttpSession session = request.getSession();
		session.setAttribute("noOfPassengers", noOfPassengers);
		System.out.println("Forwarding to reservation.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Reservation.jsp");
		dispatcher.forward(request, response);
	}

}
