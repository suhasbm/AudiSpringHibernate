 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<head>
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}
</style>

</head>
   

  <%@include file="Header.jsp" %>
<div style="overflow-x:auto;">
	<table>
		<tr>
			<th>Event Name</th>
			<th>Event Category</th>
			<th>Ticket Price</th>
			<th>Seats Available</th>
			<th>Event Date</th>
			<th>Buy</th>
		</tr>
		
		  <c:forEach var="emp" items="${list}"> 
    <tr>
   
    <td>${emp.eventname}</td>
    <td>${emp.category}</td>
    <td>${emp.ticketprice}</td>
    <td>${emp.quantity}</td>
    <td>${emp.eventdate}</td>
   
   <c:if test="${emp.quantity ge 1}">
 	<td><a href="buy/${emp.eventid}">Buy</a></td>
	</c:if>
   
   <c:if test="${emp.quantity eq 0}">
 	<td>Sold</td>
	</c:if>
   	
    </tr>
    </c:forEach>
  
	</table>
</div>
	<p></p>
	<a href="/ASpringHiber/home"><input type="button" value="Back"/></a>
	
 <%@include file="Footer.jsp" %>   
