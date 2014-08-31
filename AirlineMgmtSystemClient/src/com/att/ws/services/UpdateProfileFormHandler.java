package com.att.ws.services;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.att.ws.LoginServiceImplProxy;
import com.att.ws.ProfileBean;

/**
 * Servlet implementation class UpdateProfileFormHandler
 */
public class UpdateProfileFormHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public UserBean userbean;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProfileFormHandler() {
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
		
		ProfileBean bean = updateprofile(request, response);
		LoginServiceImplProxy client = new LoginServiceImplProxy();
		client.updateProfile(bean);
		System.out.println("Profile Updated");
		
	}
	
	public ProfileBean updateprofile(HttpServletRequest request, HttpServletResponse response){
		
ProfileBean infobean= (ProfileBean) request.getSession().getAttribute("infobean");
		
		ProfileBean userbean1 = new ProfileBean();
		if(request.getParameter("first_name").isEmpty()||request.getParameter("first_name").equalsIgnoreCase(infobean.getFirst_name())){
			
			userbean1.setFirst_name(infobean.getFirst_name());
		}else{
			userbean1.setFirst_name(request.getParameter("first_name"));
		}
		
		if(request.getParameter("last_name").isEmpty()||request.getParameter("last_name")==null||request.getParameter("last_name").equalsIgnoreCase(infobean.getFirst_name())){
			
			userbean1.setLast_name(infobean.getLast_name());
		}else{
			userbean1.setLast_name(request.getParameter("last_name"));
		}
		
		if(request.getParameter("middle_initial").isEmpty()||request.getParameter("middle_initial")==null||request.getParameter("middle_initial").equalsIgnoreCase(infobean.getMiddle_initial())){
			userbean1.setMiddle_initial(infobean.getMiddle_initial());
		}else{
			userbean1.setMiddle_initial(request.getParameter("middle_initial"));
		}
		
		if(request.getParameter("contact_no").isEmpty()||request.getParameter("contact_no").toString()==null||request.getParameter("contact_no").toString().equalsIgnoreCase(infobean.getContact_no().toString())){
			userbean1.setContact_no(infobean.getContact_no());
		}else{
			userbean1.setContact_no(Long.parseLong(request.getParameter("contact_no")));
		}
		
		if(request.getParameter("email").isEmpty()||request.getParameter("email")==null||request.getParameter("email").equalsIgnoreCase(infobean.getEmail())){
			userbean1.setEmail(infobean.getEmail());
		}else{
			userbean1.setEmail(request.getParameter("email"));
		}
		
		if(request.getParameter("address").isEmpty()||request.getParameter("address")==null||request.getParameter("address").equalsIgnoreCase(infobean.getAddress())){
			userbean1.setAddress(infobean.getAddress());
		}else{
			userbean1.setAddress(request.getParameter("address"));
		}
		
		if(request.getParameter("city").isEmpty()||request.getParameter("city")==null||request.getParameter("city").equalsIgnoreCase(infobean.getCity())){
			userbean1.setCity(infobean.getCity());
		}else{
			userbean1.setCity(request.getParameter("city"));
		}
		
		if(request.getParameter("state").isEmpty()||request.getParameter("state")==null||request.getParameter("state").equalsIgnoreCase(infobean.getState())){
			userbean1.setState(infobean.getState());
		}else{
			userbean1.setState(request.getParameter("state"));
		}
		
		if(request.getParameter("zipCode").toString().isEmpty()||request.getParameter("zipCode").toString()==null){
			userbean1.setZipcode(infobean.getZipcode());
		}else{
			userbean1.setZipcode(Integer.parseInt(request.getParameter("zipCode")));
		}
		
		if(request.getParameter("username").isEmpty()||request.getParameter("username")==null||request.getParameter("username").equalsIgnoreCase(infobean.getUsername())){
			userbean1.setUsername(infobean.getUsername());
		}else{
			userbean1.setUsername(request.getParameter("username"));
		}
		if(request.getParameter("passWrd").isEmpty()||request.getParameter("passWrd")==null||request.getParameter("passWrd").contentEquals(infobean.getPassWrd())){
			userbean1.setPassWrd(infobean.getPassWrd());
		}else{
			userbean1.setPassWrd(request.getParameter("passWrd"));
		}
		
		if(request.getParameter("gender").isEmpty()||request.getParameter("gender")==null||request.getParameter("gender").equalsIgnoreCase(infobean.getGender())){
			userbean1.setGender(infobean.getGender());
		}else{
			userbean1.setGender(request.getParameter("gender"));
		}
		
		if(request.getParameter("id_no").isEmpty()||request.getParameter("id_no")==null||request.getParameter("id_no").contentEquals(infobean.getId_no())){
			userbean1.setId_no(infobean.getId_no());
		}else{
			userbean1.setId_no(request.getParameter("id_no"));
		}
		if(request.getParameter("date_of_birth").isEmpty()||request.getParameter("date_of_birth")==null){
			userbean1.setDate_of_birth(infobean.getDate_of_birth());
		}else{
			userbean1.setDate_of_birth(request.getParameter("date_of_birth"));
		}
		
		if(request.getParameter("id_type").isEmpty()||request.getParameter("id_type")==null||request.getParameter("id_type").equalsIgnoreCase(infobean.getId_type())){
			userbean1.setId_type(infobean.getId_type());
		}else{
			userbean1.setId_type(request.getParameter("id_type"));
		}
		
		/*userbean1.setCreated_by(request.getParameter("created_by"));
		userbean1.setCreation_date(request.getParameter("creation_date"));
		userbean1.setLast_updated(request.getParameter("last_updated"));
		userbean1.setLast_updated_by(request.getParameter("last_updated_by"));*/
		userbean1.setPerson_id(infobean.getPerson_id());
		userbean1.setCreated_by(infobean.getCreated_by());
		userbean1.setCreation_date(infobean.getCreation_date());
		userbean1.setLast_updated(infobean.getLast_updated());
		userbean1.setLast_updated_by(infobean.getLast_updated_by());

		
		return userbean1;
		
	}

}
