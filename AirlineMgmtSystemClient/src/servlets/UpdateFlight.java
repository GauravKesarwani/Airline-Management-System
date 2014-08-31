
package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import helperClasses.SearchFlightsHelperProxy;
import fdpackage.FlightDetailsBean;
import fdpackage.FlightListBean;


/**
 * Servlet implementation class UpdateFlight
 */
@WebServlet("/UpdateFlight")
public class UpdateFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFlight() {
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
		
		SearchFlightsHelperProxy proxy = new SearchFlightsHelperProxy();
		FlightListBean bean = new FlightListBean();
	//	System.out.println("flightid"+ request.getParameter())
		System.out.println("flight_depart_time" + request.getParameter("departtime"));
		System.out.println("Crew Count"+ request.getParameter("crew_count"));

		bean.setFlight_id(Integer.parseInt(request.getParameter("flightid")));
		bean.setFlight_Number(request.getParameter("flight_number"));
		bean.setAirline_Name(request.getParameter("airline_name"));
		bean.setDepart_date(request.getParameter("departdate"));
		bean.setFlight_Source(request.getParameter("source"));
		bean.setFlight_Destination(request.getParameter("destination"));
		bean.setFlight_Depart_Time(request.getParameter("departtime"));
		bean.setFlight_Arr_Time(request.getParameter("arrivaltime"));
		bean.setFlight_fare(Float.parseFloat(request.getParameter("fare")));
		bean.setNo_of_seats(Integer.parseInt(request.getParameter("no_of_seats")));
		bean.setCrew_Count(Integer.parseInt(request.getParameter("crew_count")));
		boolean flag = proxy.updateFlight(bean);
		if (flag)
		{ 
			String oldKey = request.getParameter("oldKey");
			String newKey = bean.getFlight_Source() + "-" + bean.getFlight_Destination() + "$"+ bean.getDepart_date();
			FlightDetailsBean beanDtl = mapNewBean(bean);
			FlightCaching.updateCache(oldKey, newKey, beanDtl);
			System.out.println("flight updated");
			PrintWriter out = response.getWriter();
			out.println("Flight updated");
		//	out.println("<a href=\""+"/JSP/ListAllFlights.jsp\">" + "ListAllFlights</a>");
			RequestDispatcher rd=request.getRequestDispatcher("/servlets/listservlet");
			rd.forward(request, response);
		}
	}
	
	private FlightDetailsBean mapNewBean(FlightListBean newBean) {
		FlightDetailsBean bean = new FlightDetailsBean();
		bean.setFlightId(newBean.getFlight_id());
		bean.setDate_of_journey(newBean.getDepart_date());
		bean.setAirlinename(newBean.getAirline_Name());
		bean.setSource(newBean.getFlight_Source());
		bean.setDestination(newBean.getFlight_Destination());
		bean.setArrival(newBean.getFlight_Arr_Time());
		bean.setDeparture(newBean.getFlight_Depart_Time());
		bean.setFare(newBean.getFlight_fare());
		bean.setFlightId(newBean.getFlight_id());
		bean.setFlightnumber(newBean.getFlight_Number());
		return bean;
	}
}
