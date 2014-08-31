<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Animated Form Switching with jQuery</title>
    </head>
    <body>
    <div class="row">
		<div class="span9">
			<img style="margin-left:22px;width:99.5%" src="top.gif" >
			<div class="row">
				<div class="span6"></div>
				<div class="span3"></div>
			</div>
		</div>
	</div>
		<div class="wrapper">
			<h1>Update:</h1>
			<div class="content">
				<div id="form_wrapper" class="form_wrapper">
					<form method="post" action="UpdateProfileFormHandler"class="register active" >
						<h3>Register</h3>
						<div class="column">
							<div>
								<label>First Name:</label>
								<input type="text" name="first_name" />
								
							</div>
							<div>
								<label>Last Name:</label>
								<input type="text" name="last_name"/>
								
							</div>
							<div>
								<label>Middle Name:</label>
								<input type="text" name="middle_initial"/>
								
							</div>
							<div>
								<label>Gender:</label>
								<input type="text" name="gender"/>
								
							</div>
							<div>
								<label>Email:</label>
								<input type="text" name="email"/>
								
							</div>
							<div>
								<label>Contact Number:</label>
								<input type="text" name="contact_no"/>
								
							</div>
							<div>
								<label>Address:</label>
								<input type="text" name="address"/>
								
							</div>
							<div>
								<label>City:</label>
								<input type="text" name="city"/>
								
							</div>
							<div>
								<label>State:</label>
								<input type="text" name="state"/>
								
							</div>
							<div>
								<label>Zip:</label>
								<input type="text" name="zipCode"/>
								
							</div>
							<div>
								<label>SSN/Passprt Number:</label>
								<input type="text" name="id_no"/>
								
							</div>
							<div>
								<label>Date Of Birth:</label>
								<input type="text" name="date_of_birth"/>
								
							</div>
							<div>
								<label>Id type:</label>
								<input type="text" name="id_type"/>
								
							</div>
							<div>
								<label>Username:</label>
								<input type="text" name="username"/>
								
							</div>
							<div>
								<label>Password:</label>
								<input type="password" name="passWrd"/>
								
							</div>						</div>
						<div class="bottom">
							<input type="submit" value="Update Profile">
							<div class="clear"></div>
						</div>
					</form>
				</div>
				<div class="clear"></div>
			</div>
		</div>
    </body>
</html>