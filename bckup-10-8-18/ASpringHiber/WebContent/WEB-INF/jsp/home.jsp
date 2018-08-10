
<%@include file="Header.jsp"%>

<h2>
	See all upcoming events <br>  <br><a href="viewemp"><input type="button" value="Click here"/></a>
</h2>

<br />
------------------------------------------------
<h2>View By Category</h2>
<form action="/ASpringHiber/viewEventByCat" method="get">
	<select name="category">
		<option value="drama">Drama</option>
		<option value="dance">Dance</option>
		<option value="music">Music</option>
	</select> <br> <br>
	<button type="submit">Search</button>

</form>


<br />
<br />
<br />
<br />
<br />
<br />
<br />
<%@include file="Footer.jsp"%>
