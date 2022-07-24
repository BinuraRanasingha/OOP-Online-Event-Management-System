<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href= "MediaSearch.css"/>
<title>Insert title here</title>
</head>
<body>

	<% 
		String id = request.getParameter("id");
		String mediacode = request.getParameter("code");
		String medianame = request.getParameter("mname");
		String email = request.getParameter("mail");
		String location = request.getParameter("location");
		String phonenumber = request.getParameter("pnumber");
	%>
	<div class="searchForm">
		<form method="post" action="updatemedia">
			<label class="id">Media ID</label>
			<input type="text" class="mediaid" name="id" value="<%=id %>" readonly><br><br>
			<label class="cod">Media Code</label>
			<input type="text" class="mcod" name="mediacode" value="<%=mediacode %>"><br><br>
			<label class="medname">Media Name</label>
			<input type="text" class="mnam" name="mname" value="<%=medianame %>"><br><br>
			<label class="em">Email</label>
			<input type="text" class="mai" name="mail" value="<%=email %>"><br><br>
			<label class="place">Location</label>
			<input type="text" class="loc" name="place" value="<%=location %>"><br><br>
			<label class="phonenumber">Phone number</label>
			<input type="text" class="numb" name="number" value="<%=phonenumber %>"><br><br>
			
			<input type="submit" class="addMedia" name="submit" value="Update Details"><br><br>
		</form>
	</div>
</body>
</html>