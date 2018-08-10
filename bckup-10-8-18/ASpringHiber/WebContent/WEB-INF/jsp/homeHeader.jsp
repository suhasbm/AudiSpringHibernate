<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
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
	<%
  SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
  String date = sdf.format(new Date());
%>
	<%=date%>
	<p></p>
	<a href="/ASpringHiber/home"><input type="button" value="Home"/></a>
	<%
	//response.setIntHeader("Refresh", 5);
	
	%>
	</div>
	
</body>
</html>