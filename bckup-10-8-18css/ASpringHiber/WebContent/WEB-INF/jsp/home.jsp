
<%@include file="Header.jsp"%>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
    box-sizing: border-box;
}

/* Create two equal columns that floats next to each other */
.column {
    float: left;
    width: 50%;
    padding: 10px;
    height: 300px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
    content: "";
    display: table;
    clear: both;
}
</style>
</head>

<div class="row">
  <div class="column" style="background-color:#bbb;">
   <h2>
	See all upcoming events <br>  <br><a href="viewemp"><input type="button" value="Click here"/></a>
	</h2>
  </div>
  <div class="column" style="background-color:#f2f2f2;">
    <h2>View By Category</h2>
<form action="/ASpringHiber/viewEventByCat" method="get">
	<select name="category">
		<option value="drama">Drama</option>
		<option value="dance">Dance</option>
		<option value="music">Music</option>
	</select> <br> <br>
	<button type="submit">Search</button>

</form>
  </div>
</div>







<br />
<br />
<br />
<br />
<%@include file="Footer.jsp"%>
