package com.att.ws.services;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfilingFormHandler
 */
public class ProfilingFormHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
public UserBean userbean1;
	
public ProfilingHelper profilingHelper;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfilingFormHandler() {
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
		signUpUser(userbean1, request,response);
		
	}
	
	public void signUpUser(UserBean userbean,HttpServletRequest request,HttpServletResponse response) throws IOException{
		userbean1 = new UserBean();
		userbean1.setFirst_name(request.getParameter("first_name"));
		userbean1.setLast_name(request.getParameter("last_name"));
		userbean1.setMiddle_initial(request.getParameter("middle_initial"));
		userbean1.setContact_no(Long.parseLong(request.getParameter("contact_no")));
		userbean1.setEmail(request.getParameter("email"));
		userbean1.setAddress(request.getParameter("address"));
		userbean1.setCity(request.getParameter("city"));
		userbean1.setState(request.getParameter("state"));
		userbean1.setZipcode(Integer.parseInt(request.getParameter("zipCode")));
		userbean1.setUsername(request.getParameter("username"));
		userbean1.setPassWrd(request.getParameter("passWrd"));
		userbean1.setGender(request.getParameter("gender"));
		userbean1.setId_no(request.getParameter("id_no"));
		//TODO need to fix this timestamp issue :(
		userbean1.setDate_of_birth(request.getParameter("date_of_birth"));
		userbean1.setId_type(request.getParameter("id_type"));
		/*userbean1.setCreated_by(request.getParameter("created_by"));
		userbean1.setCreation_date(request.getParameter("creation_date"));
		userbean1.setLast_updated(request.getParameter("last_updated"));
		userbean1.setLast_updated_by(request.getParameter("last_updated_by"));
		*/
		userbean1.setCreated_by("System");
		userbean1.setCreation_date("2010-10-11");
		userbean1.setLast_updated("2010-10-11");
		userbean1.setLast_updated_by("System");
		
		//TODO change the jsp accordingly and then the db should be checked for insert operation.
		
		ProfilingHelper profilingHelper = new ProfilingHelper();
		int profileId= profilingHelper.createProfile(userbean1);
		HttpSession session = request.getSession();
		request.getSession(true).setAttribute("profileId", profileId);
		response.sendRedirect("login.jsp");//search results jsp should be triggered on this
		PrintWriter out = response.getWriter();
		out.print("repository is written!!");
		
		
	}


}
