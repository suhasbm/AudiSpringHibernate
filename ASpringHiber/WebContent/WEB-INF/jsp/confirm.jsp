  <%@include file="Header.jsp" %>
<h1>Confirmed</h1>

<h3>Event name${audi.eventname}</h3>
<h3>No. of tickets is ${qty}</h3>
<h3>Event date is ${audi.eventdate}</h3>
<h3>Total price is ${qty * audi.ticketprice}</h3>


<%

	out.print("<form method=\"get\" action=\"/ASpringHiber/\">\r\n" + 
			"    <button type=\"submit\">home</button>\r\n");
	
	out.println("</form>");
	%>
	
	 <%@include file="Footer.jsp" %>   