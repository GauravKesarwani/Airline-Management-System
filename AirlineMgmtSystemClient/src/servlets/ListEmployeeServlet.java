package servlets;

import helperClasses.EmployeeHelperProxy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beanFiles.PersonBean;

/**
 * Servlet implementation class ListEmployee
 */
@WebServlet("/ListEmployeeServlet")
public class ListEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeHelperProxy proxy;
		
		public void init() throws ServletException{
			proxy = new EmployeeHelperProxy();
			proxy.setEndpoint("http://localhost:8080/AirlineMgmtSystemServer/services/EmployeeHelper?wsdl");
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		PersonBean empObj = new PersonBean();
		empObj.setEmployee_id(request.getParameter("EmployeeId"));
		
		PersonBean[] msg = proxy.listEmployee();		
        
		out.println("<html>	<head>"
				+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">"
				+ "<title>Employee List</title>"
				+ "<link href=\"assets/css/lib/bootstrap.min.css\" rel=\"stylesheet\">"
				+ "<link href=\"assets/css/lib/bootstrap-responsive.min.css\" rel=\"stylesheet\">"
				+ "<link href=\"assets/css/custom.css\" rel=\"stylesheet\">"
				+ "</head><body> <br />"
				+ "<form class=\"form-horizontal\" action=\"Employee.jsp\">"
				+ "<fieldset>"
				+ "<div class=\"control-group\">"
				+ "<div class=\"controls\">"
				+ "<div class=\"control-group\"><center><img alt=\"header\" src=\"top.gif\"></center><legend>EMPLOYEE</legend></div>");
		
		if(msg == null)
		{
			out.println("No Employees to display !!! ");
		}
		else {
			request.getSession().setAttribute("count", msg.length);

			out.println("Employee Details ");
			out.println("<br/><br/>");
			
			out.println("<table border=\"1\">");
			out.println("<tr>"
					+ "<th>Employee ID</th>"
					+ "<th>Name</th>"
					+ "<th>DOB</th>"
					+ "<th>Address</th>"
					+ "<th>Contact #</th>"
					+ "<th>Position</th>"
					+ "<th>WorkDescription</th>"
					+ "<th>Hire Date</th>"
					+ "<th>Email ID</th>"
					+ "</tr>");
			for(int i=0; i< msg.length; i++)
			{
				PersonBean cur = msg[i];
				
				out.println("<tr><td>"
						+ cur.getEmployee_id()
						+ "</td><td>"
						+ cur.getFirst_name() + " " + cur.getMiddle_initial() + " " + cur.getLast_name()
						+ "</td><td>"
						+ cur.getDate_of_birth().getTime().toString()
						+ "</td><td>"
						+ cur.getAddress() + ", " + cur.getCity() + ", "+cur.getState()+", "+cur.getZipcode()
						+ "</td><td>"
						+ cur.getContact_no()
						+ "</td><td>"
						+ cur.getPosition()
						+ "</td><td>"
						+ cur.getWork_description()
						+ "</td><td>"
						+ cur.getHire_date().getTime().toString()
						+ "</td><td>"
						+ cur.getEmail().toString()
						+ "</td></tr>");
				System.out.println(cur.getEmail().toString());
			}
			out.println("</table>");
		}
		out.println("</div></div>"
				+ "<div class=\"control-group\">"
				+ "<label class=\"control-label\" for=\"ListButton\"></label>"
				+ "<div class=\"controls\">"
				+ "<button type=\"submit\" id=\"ListButton\" name=\"ListButton\" class=\"btn btn-primary\">Go Back</button>"
				+ "</div></div></fieldset></form>");

		out.println("</html> </body>");
		
	}

}
