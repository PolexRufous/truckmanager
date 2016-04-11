<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Main page</title>
	<link rel="stylesheet" type="text/css" href="../css/header.css" />
	<link rel="stylesheet" type="text/css" href="../css/footer.css" />
	<link rel="stylesheet" type="text/css" href="../css/leftside.css" />
	<link rel="stylesheet" type="text/css" href="../css/main.css">
</head>
<body>
	<header>
		<p><img src="../img/logo.png" alt="Company logo" />Company name</p>
		<nav>
			<ul>
				<li><a href="">Main</a></li>
				<li><a href="">Usefull</a></li>
				<li><a href="">About</a></li>
				<li><a href="">Personal</a></li>
			</ul>
		</nav>
	</header>

	<div class="leftside">
		<ul>
			Navigation
			<li><a href="">first</a></li>
			<li><a href="">second</a></li>
			<li><a href="">third</a></li>
			<li><a href="">fourth</a></li>
		</ul>
	</div>

	<div class="main">
		<div>
				<form method="post" action="">
					<input type="hidden" name="posttype" value="LOGIN"></input>
					<label>Enter your login<br/><input type="text" name="login" placeholder="Your login" required></input></label> <br/>
					<label>Enter your password<br/><input type="password" name="password" placeholder="Your password" required></input></label><br/>
					<input type="submit" value="Login"></input>
				</form>
		</div>
	</div>

	<footer>
		<p>Our contacts:</p>
		<p>Some information about</p>
	</footer>
</body>
</html>