
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="Header.jsp"%>

<h1>Choose tickets</h1>
<br />
<h2>Event name - ${command.eventname}</h2>
<h2>Event Category - ${command.category}</h2>
<h2>Event ticket price - ${command.ticketprice}</h2>
<h2>Tickets available - ${command.quantity}</h2>
<h2>Event date - ${command.eventdate}</h2>

<form:form method="GET" action="/ASpringHiber/buySave">

	<form:hidden path="eventid" />


	<form:hidden path="eventname" />
	<form:hidden path="category" />
	<form:hidden path="ticketprice" />
	<form:hidden path="quantity" />
	<form:hidden path="eventdate" />
        
      <h3>  Enter qty <input type="text" name="quant" required="required"></h3>

	<td><input type="submit" value="Confirm" /></td>

</form:form>


<%@include file="Footer.jsp"%>
