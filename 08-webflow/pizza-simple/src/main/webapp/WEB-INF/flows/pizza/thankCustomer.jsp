<html xmlns:jsp="http://java.sun.com/JSP/Page">
	<jsp:output omit-xml-declaration="yes" />
	<jsp:directive.page contenttype="text/html;charset=UTF-8" />

	<head><title>PIZZA-SIMPLE</title></head>
	<body>
		<h2>Thanks for ordering!</h2>
		<![CDATA[
			<a href='${flowExecutionUrl}&_eventId=finished'>Finish</a>
		]]>
	</body>
</html>
