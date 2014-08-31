/**
 * 
 */
package com.att.ws.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author pai
 *
 */
public class ProfilingHelper {

	
	public int createProfile(UserBean userbean1) {
		
		Connection connection = null;
		int personId = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ams_sql","root","root");
			 
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
			 String idtype= userbean1.getId_type();
			 
			 //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			 String dateOfBirth = userbean1.getDate_of_birth();
				try {
			 
					Date birthdate = (Date) formatter.parse(dateOfBirth);
					birthdate = new java.util.Date();
				    java.sql.Date sqlDate = new java.sql.Date(birthdate.getTime());
					dateOfBirth=sqlDate.toString();
					//java.sql.Date sqlDate = new java.sql.Date(birthdate.getTime());
					System.out.println(birthdate);
					System.out.println(formatter.format(birthdate));
			 
				} catch (ParseException e) {
					e.printStackTrace();
				}
			 //String creationdate =userbean1.getCreation_date();
				String creationdate="2010-10-10";
			 /*try {
				 
					Date creationDate = (Date) formatter.parse(creationdate);
					creationDate= new java.util.Date();
					java.sql.Date sqlDate1 = new java.sql.Date(creationDate.getTime());
					//creationdate=sqlDate1.toString();
					creationdate="2010-10-10";
					System.out.println(creationDate);
					System.out.println(formatter.format(creationDate));
			 
				} catch (ParseException e) {
					e.printStackTrace();
				}
*/
			 //String createdBy=userbean1.getCreated_by();
			 String createdBy="System";
			 //String lastupdated = userbean1.getLast_updated();
			 String lastupdated = "2010-10-11";
			/*try {
				 
					Date lastupdatedDate = (Date) formatter.parse(lastupdated);
					lastupdatedDate=new java.util.Date();
					java.sql.Date sqlDate2 = new java.sql.Date(lastupdatedDate.getTime());
					//lastupdated=sqlDate2.toString();
					lastupdated="2010-10-11";
					System.out.println(lastupdatedDate);
					System.out.println(formatter.format(lastupdatedDate));
			 
				} catch (ParseException e) {
					e.printStackTrace();
				}

*/			 
			 //String lastupdatedby=userbean1.getLast_updated_by();
			 String lastupdatedby="System";
			 
			 			 String sql = "INSERT INTO person "+"VALUES "+"("+null+",'"+id+"'"+",'"+idtype+"'"+",'"+fname+"'"+",'"+lname+"',"+"'"+mname+"',"+"'"+gender+"',"+"'"+dateOfBirth+"',"+"'"+phone+"',"+"'"+addr+"',"+"'"+city+"',"+"'"+state+"',"+"'"+zip+"',"+"'"+creationdate+"',"+"'"+createdBy+"',"+"'"+lastupdated+"',"+"'"+lastupdatedby+"',"+"'"+uname+"',"+"'"+pass+"',"+"'"+email+"'"+")";
			
			// String sql = "INSERT INTO person "+"VALUES "+"("+null+",'"+id+"',"+"'"+idtype+"'"+",'"+fname+"'"+",'"+lname+"',"+"'"+mname+"',"+"'"+gender+"',"+"'"+dob+"',"+"'"+phone+"',"+"'"+addr+"',"+"'"+city+"',"+"'"+state+"',"+"'"+zip+"',"+"'"+creationdate+"',"+"'"+createdBy+"',"+"'"+lastupdated+"',"+"'"+lastupdatedby+"',"+"'"+uname+"',"+"'"+pass+"',"+"'"+email+"'"+")";
			 System.out.println(sql);
			 Statement createStatement = (Statement) connection.createStatement();
			 
			
			createStatement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			ResultSet keys= createStatement.getGeneratedKeys();
			/*while(keys.next()){
				personId =keys.getInt("person_id");
			}*/
			
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
		
		
		System.out.println("Row Inserted");
		return personId;
	
	}
	
}
