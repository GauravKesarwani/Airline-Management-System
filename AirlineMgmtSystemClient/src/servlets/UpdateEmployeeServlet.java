package servlets;

import helperClasses.EmployeeHelperProxy;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beanFiles.PersonBean;

/**
 * Servlet implementation class CreateNewEmployee
 */
@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {
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
			String dobstring =  request.getParameter("DOB");
			System.out.println("DOB : "+dobstring);
			java.util.Calendar dob = null;
			if(!dobstring.equals("")){
				java.text.DateFormat dobformat = java.text.DateFormat.getDateInstance();
				java.util.Date dobdate;
				try {
					dobdate = dobformat.parse(dobstring);

					dob = new java.util.GregorianCalendar();
					dob.setTime(dobdate);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			String hiredatestring =  request.getParameter("HireDate");
			java.util.Calendar hireDate = null;
			if(!dobstring.equals("")){
				java.text.DateFormat format = java.text.DateFormat.getDateInstance();
				java.util.Date hire;
				try {
					hire = format.parse(hiredatestring);

					hireDate = new java.util.GregorianCalendar();
					hireDate.setTime(hire);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// change the parameter name after JSP
			PersonBean empObj = new PersonBean();
			empObj.setFirst_name(request.getParameter("FirstName"));
			empObj.setLast_name(request.getParameter("LastName"));
			empObj.setMiddle_initial(request.getParameter("MiddleInitial"));
			empObj.setDate_of_birth(dob);
			empObj.setHire_date(hireDate);
			empObj.setAddress(request.getParameter("Address"));
			empObj.setCity(request.getParameter("City"));
			empObj.setState(request.getParameter("State"));
			empObj.setZipcode(request.getParameter("Zip"));
			empObj.setContact_no(request.getParameter("contactNum"));
			empObj.setEmployee_id(request.getParameter("EmployeeId"));
			empObj.setWork_description(request.getParameter("workDescription"));
			empObj.setPosition(request.getParameter("Position"));
			empObj.setId_type(request.getParameter("IDType"));
			empObj.setId_no(request.getParameter("IDNo"));
			
			String emp = request.getSession().getAttribute("empOriginalID").toString();
			
			boolean status = proxy.updDeleteEmployee(empObj,emp, true);
			String msg; 
			if(status == true){
				msg = "You have successfully updated the employee.";
			}
			else{
				msg = "Could not update new employee! Try again.";
				
			}
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Employee.jsp");
			out.println("<h3>" +msg +"</h3>");
			rd.include(request, response);
			
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		public void destroy(){
			super.destroy();
		}

	}