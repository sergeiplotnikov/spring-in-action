<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
	<head>
		<style>
			.errors {
				background-color: #ffcccc;
				border: 2px solid red;
			}
			.error {
				color: red;
			}
			input.error {
				background-color: #ffcccc;
			}
		</style>
	</head>
	<body>
		<sf:form action="/user/register" method="POST" commandName="user">
			<sf:errors path="*" element="div" cssClass="errors" />
			<sf:label path="firstName" cssErrorClass="error">First Name: </sf:label><sf:input path="firstName" cssErrorClass="error" /><br/>
			<sf:label path="lastName" cssErrorClass="error">Last Name: </sf:label><sf:input path="lastName" cssErrorClass="error" /><br/>
			<sf:label path="email" type="email" cssErrorClass="error">Email: </sf:label><sf:input path="email" cssErrorClass="error" /><br/>
			<sf:label path="username" cssErrorClass="error">Username: </sf:label><sf:input path="username" cssErrorClass="error" /><br/>
			<sf:label path="password" cssErrorClass="error">Password: </sf:label><sf:password path="password" cssErrorClass="error" /><br/>
			<input type="submit" value="Submit Form" />
		</sf:form>
	</body>
</html>
