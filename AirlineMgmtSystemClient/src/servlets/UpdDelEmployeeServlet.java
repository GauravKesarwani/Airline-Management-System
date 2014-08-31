package servlets;

import helperClasses.EmployeeHelperProxy;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.axis.session.Session;

import beanFiles.PersonBean;

/**
 * Servlet implementation class UpdateDeleteEmployee
 */
@WebServlet("/UpdDelEmployeeServlet")
public class UpdDelEmployeeServlet extends HttpServlet {
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

		if(request.getParameter("DeleteButton") != null){
			String emp = request.getParameter("EmployeeId");
			request.getSession().setAttribute("empOriginalID", emp);

			boolean status = proxy.updDeleteEmployee(empObj, emp, false);
			String msg; 
			if(status == true){
				msg = "You have deleted the employee.";
			}
			else{
				msg = "Could not delete the employee! Try again.";

			}
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/UpdateDeleteEmployee.jsp");
			out.println("<h3>" +msg +"</h3>");
			rd.include(request, response);
		}
		else {
			String emp = request.getParameter("EmployeeId");
			request.getSession().setAttribute("empOriginalID", emp);
			PersonBean[] msg = proxy.searchEmployee(empObj);
			out.println("<html>	<head>"
					+ "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">"
					+ "<title>Employee List</title>"
					+ "<link href=\"assets/css/lib/bootstrap.min.css\" rel=\"stylesheet\">"
					+ "<link href=\"assets/css/lib/bootstrap-responsive.min.css\" rel=\"stylesheet\">"
					+ "<link href=\"assets/css/custom.css\" rel=\"stylesheet\">"
					+ "</head><body> <br />");
			if(msg == null)
			{
				out.println("No Employees to Update !!! ");
			}
			else { 
			out.println("<form class=\"form-horizontal\" action=\"UpdateEmployeeServlet\" method=\"post\">"
					+ "<fieldset>"
					+ "<div class=\"control-group\">"
					+ "<div class=\"controls\">"
					+ "<div class=\"control-group\"><img alt=\"header\" src=\"top.gif\"><legend>EMPLOYEE</legend></div>");

				out.println("Employee Details ");
				out.println("<br/><br/>");
				
				out.println("<table border=\"1\">");
				out.println("<tr>"
						+ "<th>Employee ID</th>"
						+ "<th>First Name</th>"
						+ "<th>Middle Initial</th>"
						+ "<th>Last Name</th>"
						+ "<th>DOB</th>"
						+ "<th>Address</th>"
						+ "<th>City</th>"
						+ "<th>State</th>"
						+ "<th>Zip</th>"
						+ "<th>Contact #</th>"
						+ "<th>Position</th>"
						+ "<th>WorkDescription</th>"
						+ "<th>Start Date</th>"
						+ "<th>Email ID</th>"
						+ "</tr>");
				for(int i=0; i< msg.length; i++)
				{
					PersonBean cur = msg[i];
					
					DateFormat df = new SimpleDateFormat("MMM dd, yyyy");
					String dob = df.format(cur.getDate_of_birth().getTime());
					String hireDate = df.format(cur.getHire_date().getTime());
					
					out.println("<tr><td><input type=\"text\" name=\"EmployeeId\" pattern=\"[0-9]{3}-[0-9]{2}-[0-9]{4}\" title=\"SSN format Employee ID\" value=\""
							+ cur.getEmployee_id() + "\">"
							+ "</td><td><input type=\"text\" name=\"FirstName\" pattern=\"[A-Za-z]{0,45}\" title=\"Upper or lower case alphabets only\" value=\""
							+ cur.getFirst_name() + "\">"
							+ "</td><td><input type=\"text\" name=\"MiddleInitial\" pattern=\"[A-Za-z]{0,1}\" maxlength=\"1\" value=\"" 
							+ cur.getMiddle_initial() + "\">"
							+ "</td><td><input type=\"text\" name=\"LastName\" pattern=\"[A-Za-z]{0,45}\" title=\"Upper or lower case alphabets only\" value=\"" 
							+ cur.getLast_name()+ "\">"
							+ "</td><td><input type=\"text\" name=\"DOB\" pattern=\"[a-zA-Z]{3} [0-9]{1,2}, [0-9]{4}\" title=\"DOB in format MMM DD,YYYY\" value=\""
							+ dob+ "\">"
							+ "</td><td><input type=\"text\" name=\"Address\" value=\""
							+ cur.getAddress() + "\">"
							+ "</td><td><input type=\"text\" name=\"City\" value=\"" 
							+ cur.getCity() + "\">"
							+ "</td><td><input type=\"text\" name=\"State\" value=\""
							+cur.getState()+ "\">"
							+"</td><td><input type=\"text\" name=\"Zip\" pattern=\"[0-9]{5}\" title=\"5 digit valid zip code\" value=\""
							+cur.getZipcode()+ "\">"
							+ "</td><td><input type=\"text\" name=\"contactNum\" pattern=\"[0-9]{10}\" value=\""
							+ cur.getContact_no()+ "\">"
							+ "</td><td><input type=\"text\" name=\"Position\" value=\""
							+ cur.getPosition()+ "\">"
							+ "</td><td><input type=\"text\" name=\"workDescription\" value=\""
							+ cur.getWork_description()+ "\">"
							+ "</td><td><input type=\"text\" name=\"Email ID\" pattern=\"[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,20}.[a-zA-Z0-9]{1,10}\" value=\""
							+ cur.getEmail()+ "\">"
							+ "</td><td><input type=\"text\" name=\"HireDate\" value=\""
							+ hireDate+ "\">"
							+ "</td></tr>");
				}
				out.println("</table>");
				out.println("</div></div>"
						+ "<div class=\"control-group\">"
						+ "<label class=\"control-label\" for=\"ListButton\"></label>"
						+ "<div class=\"controls\">"
						+ "<button type=\"submit\" id=\"ListButton\" name=\"ListButton\" class=\"btn btn-success\">Update</button>"
						+ "</div></div></fieldset></form>");
			}
			
			
			out.println("<form class=\"form-horizontal\" action=\"Employee.jsp\">"
					+ "<fieldset>"
					+ "<div class=\"control-group\">"
					+ "<div class=\"controls\">"
					+ "<button type=\"submit\" id=\"ListButton\" name=\"ListButton\" class=\"btn btn-primary\">Go Back</button>"
					+ "</div></div></fieldset></form>");

			out.println(" </body> </html>");
		

		}
	}

}
