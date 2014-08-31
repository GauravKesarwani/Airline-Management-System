<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Register with Penguin Airlines</title>
        	
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
			<h1>Penguin Airways</h1>
			<div class="content">
				<div id="form_wrapper" class="form_wrapper">
					<form form method="post" action="LoginFormHandler"class="register active"class="login active">
						<h3>Login</h3>
						<div>
							<label>Username:</label>
							<input type="text" name="username" />
						</div>
						<div>
							<label>Password:</label>
							<input type="password" name="passWrd" />
						</div>
						<div class="bottom">
							<div class="remember"><input type="checkbox" /><span>Keep me logged in</span></div>
							<input type="submit" value="Login"></input>
							<a href="signup.jsp" rel="register" class="linkform">You don't have an account yet? Register here</a>
							<div class="clear"></div>
						</div>
					</form>
				</div>
				<div class="clear"></div>
			</div>
		</div>
		<!-- The JavaScript -->
    </body>
</html>