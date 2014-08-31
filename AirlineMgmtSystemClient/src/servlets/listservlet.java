package servlets;
import fdpackage.FlightListBean;

import java.io.IOException;
import helperClasses.SearchFlightsHelperProxy;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import fdpackage.FlightDetailsBean;

/**
 * Servlet implementation class listservlet
 */
@WebServlet("/listservlet")
public class listservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try{
			  HttpSession session = request.getSession();
			  SearchFlightsHelperProxy proxy = new SearchFlightsHelperProxy();
			  FlightListBean[] flightlist = proxy.getFlightlist();
			  session.setAttribute("flightlist", flightlist);
			  
			  System.out.println("flightlist length"+ flightlist.length);
			  
			  for (int i=0;i<flightlist.length; i++){
				  System.out.println(flightlist[i].getFlight_id());
		   }
			     
			  RequestDispatcher rd=request.getRequestDispatcher("../JSP/ListFlights.jsp");
			  rd.forward(request,response); 		       

			}catch(Exception e){}
		}
}
