
<%@include file="Header.jsp"%>

<h1>Failed</h1>
<h2>Enter the qty correctly</h2>



<%
	out.print("<form method=\"get\" action=\"/ASpringHiber/home\">\r\n"
			+ "    <button type=\"submit\">Try Again</button>\r\n");

	out.println("</form>");
%>

<%@include file="Footer.jsp"%>
