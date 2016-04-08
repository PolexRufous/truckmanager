<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login user</title>
<link rel="stylesheet" href="css/general.css" />
</head>
<body>

<header>
	<table>
		<tr>
			<td><img src="images/Crab.jpg" alt="logo.img" /></td>
		</tr>
		<tr>
			<td>Here will be some information about company.</td>
		</tr>
	</table>
	<br/>	
</header>


<div class="container">
	<div class="left">Left side</div>

	<div class="center">

		<form action="MainServlet" method="post">
		<input type="hidden" name="posttype" value="login" />
			<table>
				<tr>
					<td><label for="userlogin">Enter your login</label></td>
					<td><input id="userlogin" type="text" name="userlogin" maxlength="10" placeholder="Enter your login here" required autofocus /></td>
				</tr>
				<tr>
					<td><label for="userpassword">Enter your password</label></td>
					<td><input id="userpassword" type="password" name="userpassword" placeholder="Enter your password here" required /></td>
				</tr>
				<tr>
					<td class="centered" colspan="2"><input type="submit" value="Login" /></td>
				</tr>
				<tr>
					<td class="centered" colspan="2">${errormessage}</td>
				</tr>
				<tr>
					<td class="centered" colspan="2">${othermessage}</td>
				</tr>
			</table>
		</form>
	</div>

	<div class="right"> Right side</div>
</div>

<footer>
	Here will be some contacts of company.
</footer>

</body>
</html>