package com.att.ws.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.att.ws.LoginServiceImplProxy;
import com.att.ws.ProfileBean;

/**
 * Servlet implementation class SearchAllCustomers
 */
public class SearchAllCustomers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public LoginServiceImplProxy client = new LoginServiceImplProxy();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAllCustomers() {
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
		
		ProfileBean[] customerList = client.getListOfCustomers();
		request.getSession().setAttribute("customerList", customerList);
		response.sendRedirect("listAllCustomers.jsp");
	}

}
