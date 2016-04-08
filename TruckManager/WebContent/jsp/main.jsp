<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="stylesheet" href="css/general.css" />
<title>Main page</title>
</head>
<body>
	<p>Hello ${user.firstName} ${user.lastName}!<p>
	<p>You was logged in!</p>
	<img alt="your photo" src=${userpic } />
	<form action="MainServlet" method="post">
	<input type="hidden" name="posttype" value="logout" />
	<input type="submit" value="Logout"/>
	</form>
	<p>${errormessage }</p>
	<p>${othermessage }</p>
</body>
</html>