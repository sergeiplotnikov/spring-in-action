<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Spittr</title>
		<link rel="stylesheet" type="text" href="<c:url value="/resources/style.css" />" >
	</head>
	<body>
		<h1>Register</h1>
		<form method="POST">
		<!-- form tag has no 'action' attribute, meaning it will POST the-->
		<!-- data to the same url that displayed the page -->
			First Name: <input type="text" name="firstName" /><br/>
			Last Name: <input type="text" name="lastName" /><br/>
			Username: <input type="text" name="username" /><br/>
			Password: <input type="text" name="password" /><br/>
			<input type="submit" value="Register" />
		</form>
	</body>
</html>
