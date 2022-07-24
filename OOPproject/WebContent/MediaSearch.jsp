<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link rel="stylesheet" href= "MediaSearch.css"/>
<title>Media Search</title>
</head>
<body>
	<div class="searchForm">
		<form action="search" method="post">
		
			<label class="media">Media Code</label>
			<input type="text" class="mc" name="mcode" required><br><br>
			<label class="media">Media Name</label>
			<input type="text" class="mn" name="mname" required><br><br>
		
			<input type="submit" class="st" name="submit" value="Search media">
			<input type="button" class="st" name="button" value="Add Media" onclick="parent.location='AddMedia.jsp'">
		
		</form>
	</div>

</body>
</html>