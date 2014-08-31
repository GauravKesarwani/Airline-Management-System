package com.att.ws.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.att.ws.LoginServiceImplProxy;
import com.att.ws.ProfileBean;

/**
 * Servlet implementation class LoginFormHandler
 */
public class LoginFormHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public LoginServiceImplProxy client = new LoginServiceImplProxy();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFormHandler() {
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
		boolean isValid = false;
		
		String username=request.getParameter("username");
		String password=request.getParameter("passWrd");
		if(null !=request && !username.isEmpty() && !password.isEmpty()){
			isValid= client.loginValidate(username, password);
		}
		try {
			if(username.equals("admin") && password.equals("admin")){
				response.sendRedirect("/AirlineMgmtSystemClient/Employee.jsp");
			} else {
			if(isValid){
				ProfileBean infobean=client.getProfileInfo(username);
				if(null != infobean){
					HttpSession session = request.getSession();
					request.getSession(true).setAttribute("infobean", infobean);
					request.getSession().setAttribute("person_id", infobean.getPerson_id());
					response.sendRedirect("/AirlineMgmtSystemClient/JSP/index.html");
					System.out.println("login Successful");
				}
			}else{
				response.sendRedirect("error.jsp");
			}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
