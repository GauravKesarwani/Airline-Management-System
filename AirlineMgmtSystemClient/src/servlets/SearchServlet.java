package servlets;

import helperClasses.SearchFlightsHelperProxy;
import fdpackage.FlightDetailsBean;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.*;
import java.sql.*;


public class SearchServlet extends HttpServlet
{
 
  public void init(ServletConfig sc) throws ServletException
    {
    }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	 {   
//				try{
				     helperClasses.SearchFlightsHelperProxy proxy = new helperClasses.SearchFlightsHelperProxy();
				     FlightDetailsBean fdBean = new FlightDetailsBean();
				     
				     HttpSession session = request.getSession();
				     String source=request.getParameter("flying_from");
				     String destination=request.getParameter("flying_to");
				    if(request.getParameter("adult")!=null) {
				    	int noOfPassengers = Integer.parseInt(request.getParameter("adult"));
				    	request.setAttribute("noOfPassengers", noOfPassengers);
				    } else {
				    	request.setAttribute("noOfPassengers", 1);
				    }
				     fdBean.setSource(source);
				     fdBean.setDestination(destination);
				     
				     //System.out.println("Source " + source);
				     //System.out.println("dest " + destination);
				     String ddate[] = request.getParameter("ddate").split("[/]");
				     fdBean.setDate_of_journey(ddate[2]+"-"+ddate[0]+"-"+ddate[1]);
				     if(request.getParameter("rdate")!=null) {
				    	 String rdate[] = request.getParameter("rdate").split("[/]");
				    	 fdBean.setDate_of_return(rdate[2]+"-"+rdate[0]+"-"+rdate[1]);
//				    	 fdBean.setDate_of_return("return");
				     }
				     
				     FlightDetailsBean[] flightdetails= null;
				     String mapKey = fdBean.getSource()+"-"+fdBean.getDestination()+"$"+fdBean.getDate_of_journey();
				     if(FlightCaching.getJourneyToFlightsMap()!=null && FlightCaching.getJourneyToFlightsMap().size()>0
				    		 && FlightCaching.getJourneyToFlightsMap().containsKey(mapKey) && 
				    		 FlightCaching.getJourneyToFlightsMap().get(mapKey)!=null) {
				    	 //System.out.println("Fetching from map");
				    	 flightdetails = FlightCaching.getJourneyToFlightsMap().get(mapKey);
				     } else {
				    	 flightdetails=proxy.searchOneWayFlight(fdBean);
				    	 if(flightdetails!=null) {
				    		 FlightCaching.storeDataInCache(mapKey, flightdetails);
				    	 }
				     }
//				     System.out.println(flightdetails.length);
				     session.setAttribute("flightdetails",flightdetails);
				     if(flightdetails!=null && flightdetails.length>0) {
					     for(FlightDetailsBean bean : flightdetails) {
					   // 	 System.out.println(bean.toString());
					   // 	 System.out.println(bean.getFlightId());
					     }
				     } 
				     RequestDispatcher rd=request.getRequestDispatcher("/JSP/searchresult.jsp");
				     rd.forward(request,response);              
				     //  }catch(SQLException e){ System.out.println("SQLException caught");}  
	 }

	}

}
