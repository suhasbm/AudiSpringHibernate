<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BuildMyEvent</title>
</head>
<body>
	
	<center><h1>BookMyEvent</h1></center>
	<div align="right">
	<%=new java.util.Date()%>
	<%
	//response.setIntHeader("Refresh", 1);
	out.print("<form method=\"get\" action=\"/ASpringHiber/\">\r\n" + 
			"    <button type=\"submit\">home</button>\r\n");
	
	out.println("</form>");
	%>
	</div>
	<hr>
</body>
</html>