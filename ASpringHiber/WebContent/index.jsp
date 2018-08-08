
<%@include file="WEB-INF/jsp/Header.jsp"%>

<h3>
	Upcoming events <a href="viewemp">Enter</a>
</h3>

<br />
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
<%@include file="WEB-INF/jsp/Footer.jsp"%>
