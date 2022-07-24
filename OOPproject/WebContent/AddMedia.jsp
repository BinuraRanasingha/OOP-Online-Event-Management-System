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
	<div class="searchForm">
		<form method="POST" action="mediainsert">
			
			<label class="mediaCodelabel">Media Code</label>&nbsp&nbsp
			<input type="text" class="mediaCode" name="code" required><br><br>
			<label class="mediaNamelabel">Media Name &nbsp&nbsp </label>
			<input type="text" class="mediaName" name="name" required><br><br>
			<label class="emailLabel">Email &nbsp&nbsp</label>
			<input type="text" class="emailc" name="email" placeholder="saman@gmail.com" required><br><br>
			<label class="locationLabel">Location &nbsp&nbsp</label>
			<input type="text" class="location" name="place" required><br><br>
			<label class="numberLabel">Phone number &nbsp&nbsp</label>
			<input type="text" class="pnumber" name="phone" pattern="[0-9]{10}" placeholder="0812345678" required><br><br>
			
			<input type="submit" class="addMedia" name="sub" value="Add Media Company"><br><br>
		</form>
	</div>

</body>
</html>