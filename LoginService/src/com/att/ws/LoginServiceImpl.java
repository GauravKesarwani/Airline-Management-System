/**
 * 
 */
package com.att.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pai
 *
 */
public class LoginServiceImpl {

	public boolean loginValidate(String userName,String pass) throws InstantiationException, IllegalAccessException, Exception{
		Connection connection = null;
		PreparedStatement preparestatement=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");

			preparestatement=connection.prepareStatement("select username from person where username=? and passWrd=?");
			
			preparestatement.setString(1, userName);
			preparestatement.setString(2, pass);
			rs=preparestatement.executeQuery();
			while(rs.next())
			{
				if(rs.getString("username")!=null||!rs.getString("username").isEmpty())
				{
					return true;
				}
				
			}
			 
		}
		
	  catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		if(connection!=null)
		try{
			connection.close();
		}
		catch(SQLException e) {
			
		}
		if(preparestatement!=null)try{preparestatement.close();}
		catch(SQLException e) {
			
		}
		if(rs!=null)try{rs.close();}
		catch(SQLException e) {
		}
	}
		return false;
	}

	//new methodadded
	public ProfileBean getProfileInfo(String username) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		Connection connection = null;
		PreparedStatement preparestatement=null;
		ResultSet rs=null;
		ProfileBean userbean1 = new ProfileBean();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");

			preparestatement=connection.prepareStatement("select * from person where username=?");
			
			preparestatement.setString(1, username);
			rs=preparestatement.executeQuery();
			while(rs.next())
			{
				userbean1.setPerson_id(rs.getInt("person_id"));
				userbean1.setId_no(rs.getString("id_no"));
				userbean1.setId_type(rs.getString("id_type"));
				userbean1.setFirst_name(rs.getString("first_name"));
				userbean1.setLast_name(rs.getString("last_name"));
				userbean1.setMiddle_initial(rs.getString("middle_initial"));
				userbean1.setGender(rs.getString("gender"));
				userbean1.setDate_of_birth(rs.getString("date_of_birth"));
				userbean1.setContact_no(rs.getLong("contact_no"));
				userbean1.setAddress(rs.getString("address"));
				userbean1.setCity(rs.getString("city"));
				userbean1.setState(rs.getString("state"));
				userbean1.setZipcode(rs.getInt("zipcode"));
				userbean1.setCreation_date(rs.getString("creation_date")); 
				userbean1.setCreated_by(rs.getString("created_by"));
				userbean1.setLast_updated(rs.getString("last_updated")); 
				userbean1.setLast_updated_by(rs.getString("last_updated_by"));
				userbean1.setUsername(rs.getString("username"));
				userbean1.setPassWrd(rs.getString("passWrd"));
				userbean1.setEmail(rs.getString("email"));
				 
			}
			 
		}
		
	  catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		if(connection!=null)
		try{
			connection.close();
		}
		catch(SQLException e) {
			
		}
		if(preparestatement!=null)try{preparestatement.close();}
		catch(SQLException e) {
			
		}
		if(rs!=null)try{rs.close();}
		catch(SQLException e) {
		}
	}
		return userbean1;
	}

	//new method added
public boolean updateProfile(ProfileBean userbean1){
		
		Connection connection = null;
		boolean s = false;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
			 
			 String fname = userbean1.getFirst_name();
			 String lname= userbean1.getLast_name();
			 String mname=userbean1.getMiddle_initial();
			 Long phone =userbean1.getContact_no();
			 String email=userbean1.getEmail();
			 String addr=userbean1.getAddress();
			 String city=userbean1.getCity();
			 String state=userbean1.getState();
			 int zip=userbean1.getZipcode();
			 String uname=userbean1.getUsername();
			 String pass= userbean1.getPassWrd();
			 String gender=userbean1.getGender();
			 String id= userbean1.getId_no();
			 String idtype=userbean1.getId_type();
			 int personId = userbean1.getPerson_id();
			 String dob = userbean1.getDate_of_birth();
			 String creationdate =userbean1.getCreation_date();
			 String createdBy=userbean1.getCreated_by();
			 String lastupdated = userbean1.getLast_updated();
			 String lastupdatedby=userbean1.getLast_updated_by();
			 
			 
			 
			 			// String sql = "INSERT INTO person "+"VALUES "+"("+null+",'"+id+"'"+",'"+idtype+"'"+",'"+fname+"'"+",'"+lname+"',"+"'"+mname+"',"+"'"+gender+"',"+"'"+dob+"',"+"'"+phone+"',"+"'"+addr+"',"+"'"+city+"',"+"'"+state+"',"+"'"+zip+"',"+"'"+creationdate+"',"+"'"+createdBy+"',"+"'"+lastupdated+"',"+"'"+lastupdatedby+"',"+"'"+uname+"',"+"'"+pass+"',"+"'"+email+"'"+")";
		//	String sql1 = "UPDATE person set first_name=?,last_name=?,middle_initial=?,gender=?,date_of_birth=?,contact_no=?,address=?,city=?,state=?,zipcode=?,passWrd=?,email=?,id_no=?,id_type=?,creation_date=?,created_by=?,last_updated=?,last_updated_by=?,username=? WHERE person_id=?";
				
			 
			 String sql1 = "UPDATE person set first_name="+"'"+fname+"',"+"last_name="+"'"+lname+"',"+"middle_initial="+"'"+mname+"',"+"gender="+"'"+gender+"',"+"date_of_birth="+"'"+dob+"',"+"contact_no="+"'"+phone+"',"+"address="+"'"+addr+"',"+"city="+"'"+city+"',"+"state="+"'"+state+"',"+"zipcode="+"'"+zip+"',"+"passWrd="+"'"+pass+"',"+"email="+"'"+email+"',"+"id_no="+"'"+id+"',"+"id_type="+"'"+idtype+"',"+"creation_date="+"'"+creationdate+"',"+"created_by="+"'"+createdBy+"',"+"last_updated="+"'"+lastupdated+"',"+"last_updated_by="+"'"+lastupdatedby+"',"+"username="+"'"+uname+"'"+"WHERE person_id="+"'"+personId+"'"; 	       
			
				
				// String sql = "INSERT INTO person "+"VALUES "+"("+null+",'"+id+"',"+"'"+idtype+"'"+",'"+fname+"'"+",'"+lname+"',"+"'"+mname+"',"+"'"+gender+"',"+"'"+dob+"',"+"'"+phone+"',"+"'"+addr+"',"+"'"+city+"',"+"'"+state+"',"+"'"+zip+"',"+"'"+creationdate+"',"+"'"+createdBy+"',"+"'"+lastupdated+"',"+"'"+lastupdatedby+"',"+"'"+uname+"',"+"'"+pass+"',"+"'"+email+"'"+")";
			 System.out.println(sql1);
			 if(null != connection){
				 Statement createStatement = (Statement) connection.createStatement(); 
				 createStatement.executeUpdate(sql1);
			 }
			
			// PreparedStatement stmt = connection.prepareStatement(sql1);
			 
			 /*stmt.setString(1, fname);
			 System.out.println(fname);
			 stmt.setString(2, lname);
			 System.out.println(lname);
			 stmt.setString(3, mname);
			 System.out.println(mname);
			 stmt.setString(4, gender);
			 System.out.println(gender);
			 stmt.setString(5, dob);
			 System.out.println(dob);
			 stmt.setLong(6, phone);
			 System.out.println(phone);
			 stmt.setString(7, addr);
			 System.out.println(addr);
			 stmt.setString(8, city);
			 System.out.println(city);
			 stmt.setString(9, state);
			 System.out.println(state);
			 stmt.setInt(10, zip);
			 System.out.println(zip);
			 stmt.setString(11, pass);
			 System.out.println(pass);
			 stmt.setString(12, email);
			 System.out.println(email);
			 stmt.setString(13, id);
			 System.out.println(id);
			 stmt.setString(14, idtype);
			 System.out.println(idtype);
			 stmt.setString(15, creationdate);
			 System.out.println(creationdate);
			 stmt.setString(16, createdBy);
			 System.out.println(createdBy);
			 stmt.setString(17, lastupdated);
			 System.out.println(lastupdated);
			 stmt.setString(18, lastupdatedby);
			 System.out.println(lastupdatedby);
			 stmt.setString(19, uname);
			 System.out.println(uname);
			 stmt.setInt(20, personId);
			 System.out.println(personId);
			 s =stmt.execute(sql1);
			 System.out.println(s);
			 return s;
		*/	
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
			System.out.println("Row updated");
			return s;
			
	}

//new method added
public void deleteProfile(int personId) throws InstantiationException, IllegalAccessException, ClassNotFoundException{

	Connection connection = null;
	PreparedStatement preparestatement=null;
	int rs=0;
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");

		 if(null != connection){
			 
			 preparestatement=connection.prepareStatement(" delete from person where person_id=?");
				
				preparestatement.setInt(1, personId);
				rs=preparestatement.executeUpdate();
		 }
		 
	}
	
  catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally{
	if(connection!=null)
	try{
		connection.close();
	}
	catch(SQLException e) {
		
	}
	if(preparestatement!=null)try{preparestatement.close();}
	catch(SQLException e) {
		
	}
	
}
	}

//new method added

public ProfileBean[] getListOfCustomers() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	
	ProfileBean[] customerList =null;

	Connection connection = null;
	PreparedStatement preparestatement=null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
		 String sql ="select * from person JOIN traveller JOIN Employee ON traveller.person_id=person.person_id and Person.Person_Id != Employee.Person_Id";
		 preparestatement=connection.prepareStatement(sql);
		
	ResultSet rs=preparestatement.executeQuery(sql);
	List<ProfileBean>tempList = new ArrayList<ProfileBean>();
		while(rs.next()){
			
            ProfileBean userbean = new ProfileBean();
			userbean.setPerson_id(rs.getInt("person_id"));
            userbean.setFirst_name(rs.getString("first_name"));
            userbean.setLast_name(rs.getString("last_name"));
            userbean.setMiddle_initial(rs.getString("middle_initial"));
            userbean.setContact_no(rs.getLong("contact_no"));
            userbean.setEmail(rs.getString("email"));
            userbean.setAddress(rs.getString("address"));
            userbean.setCity(rs.getString("city"));
            userbean.setState(rs.getString("state"));
            userbean.setZipcode(rs.getInt("zipcode"));
            userbean.setDate_of_birth(rs.getString("date_of_birth"));
            userbean.setGender(rs.getString("gender"));
            userbean.setTraveller_id(rs.getInt("traveller_id"));
            
            tempList.add(userbean);
      }
		customerList = new ProfileBean[tempList.size()];
		for(int i=0; i<tempList.size();i++){
			
			customerList[i]=tempList.get(i);
		}
	}
	
  catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally{
	if(connection!=null)
	try{
		connection.close();
	}
	catch(SQLException e) {
		
	}
	if(preparestatement!=null)try{preparestatement.close();}
	catch(SQLException e) {
		
	}
}
	return customerList;
	// TODO Auto-generated method stub
	
}
	
}//End of class
