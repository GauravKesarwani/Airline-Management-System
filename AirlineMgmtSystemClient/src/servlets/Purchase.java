package servlets;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import ticket.TicketBean;
import DefaultNamespace.GenerateTicket;
import DefaultNamespace.GenerateTicketProxy;
import DefaultNamespace.PayServiceProxy;




/**
 * Servlet implementation class Purchase
 */
public class Purchase extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		if(request.getParameter("buy")!=null)
		{
			PayServiceProxy pay=new PayServiceProxy();
			
			
			pay.setEndpoint("http://localhost:8080/PaymentService/services/payService?wsdl");
			HttpSession session=request.getSession();
			//String reservationId=session.getAttribute("reservationId").toString();
			/// take reservationId,FlightNO,flightId,personId and amount from session.
			long CardNo= Long.parseLong(request.getParameter("credit"));
			System.out.println("credit card"+CardNo);
			Date date = new Date();
			String todaysDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
			
			pay.payByCredit(6, CardNo, todaysDate, 6, "Ek856", 2, 1500);
			
			GenerateTicketProxy tkd=new GenerateTicketProxy();
			//TicketInfoProxy tkd=new TicketInfoProxy();
			tkd.setEndpoint("http://localhost:8080/PaymentService/services/GenerateTicket?wsdl");
			// below is the code for getting the ticketbean which contains all the ticketing formation
			// input parameter is from session where you'll get person id .... Temp passing personid=1
			int reservationId=(Integer) request.getSession().getAttribute("reservationId");
			
			System.out.println("reservation id = "+reservationId);
			
			/*String ticketdata=tkd.getdata(reservationId);
			System.out.println("ticketdata "+ticketdata);
			String[] data=ticketdata.split(",");
			Ticketbean ticketinfo=new Ticketbean();
			ticketinfo.setFirstName(data[0].toString());
			ticketinfo.setLastName(data[1].toString());
			ticketinfo.setFlightNo(data[2].toString());
			ticketinfo.setType(data[3].toString());
			java.util.Date dt=null;
			DateFormat dateformatter=new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date paydate=null;
			try
			{
				dt=dateformatter.parse(data[7].toString());
				paydate=new java.sql.Date(dt.getTime());
			}
			catch(java.text.ParseException exception){
				exception.printStackTrace();
			}
			//ticketinfo.setPayment(paydate);
			ticketinfo.setDeparturedate(paydate);
			ticketinfo.setAmount(Integer.parseInt(data[4]));
			ticketinfo.setSource(data[5].toString());
			ticketinfo.setDestination(data[6].toString());
			request.getSession().setAttribute("TicketInfo", ticketinfo);*/
			
			TicketBean[] tkarray=tkd.ticketInfo(reservationId);
			
			
			System.out.println("now lets set session");
			
			request.getSession().setAttribute("TicketInfo", tkarray);
			
			System.out.println("now session is set lets forward");
			
			// input parameter is from session where you'll get person id .... Temp passing personid=1
			//Ticketbean ticketInfo= tkd.getdata(1);
			//request.getSession().setAttribute("TicketInfo", ticketInfo);
			response.sendRedirect("/AirlineMgmtSystemClient/TicketConfirmation.jsp");
		}
		else if(request.getParameter("cancel")!=null)
		{
			// redirect to flight selection screen.....
			response.sendRedirect("/AirlineMgmtSystemClient/Reservation.jsp");
		}
		else if(request.getParameter("back")!=null){
			// redirect to list flight page
			response.sendRedirect("/AirlineMgmtSystemClient/JSP/index.html");
		}
		else if(request.getParameter("logout")!=null){
			// session invalidate
			HttpSession session=request.getSession();
			session.invalidate();
			// redirect to login page.
		}
	}

}
