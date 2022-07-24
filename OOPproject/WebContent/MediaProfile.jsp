<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<c:forEach var="medi" items="${medDetails}">
	
		<c:set var="id" value="${medi.id}"/>
		<c:set var="mcode" value="${medi.mediaCode}"/>
		<c:set var="mname" value="${medi.mediaName}"/>
		<c:set var="email" value="${medi.email}"/>
		<c:set var="location" value="${medi.location}"/> 
		<c:set var="pnumber" value="${medi.phonenumber}"/>

		<tr>
			<td><b>Media ID</b></td>
			<td>${medi.id}</td>
		</tr>
		
		<tr>
			<td><b>Media Code</b></td>
			<td>${medi.mediaCode}</td>
		</tr>
		
		<tr>
			<td><b>Media Name</b></td>
			<td>${medi.mediaName}</td>
		</tr>
		
		<tr>
			<td><b>Email</b></td>
			<td>${medi.email}</td>
		</tr>
		
		<tr>
			<td><b>Location</b></td>
			<td>${medi.location}</td>
		</tr>
		
		<tr>
			<td><b>Phone number</b></td>
			<td>${medi.phonenumber}</td>
		</tr>
	
		</c:forEach>
	</table>
	
	<c:url value="UpdateMedia.jsp" var="mediaUp">
		<c:param name="id" value="${id}"/>
		<c:param name="code" value="${mcode}"/>
		<c:param name="mname" value="${mname}"/>
		<c:param name="mail" value="${email}"/>
		<c:param name="pnumber" value="${pnumber}"/>
		<c:param name="location" value="${location}"/>
	</c:url>
	
	<a href="${mediaUp}">
		<input type="button" name="update" value="Update Media Profile">
	</a>
	
	<c:url value="RemoveMedia.jsp" var="medRemove">
		<c:param name="id" value="${id}"/>
		<c:param name="code" value="${mcode}"/>
		<c:param name="mname" value="${mname}"/>
		<c:param name="mail" value="${email}"/>
		<c:param name="pnumber" value="${pnumber}"/>
		<c:param name="location" value="${location}"/>
	</c:url>
	
	<a href="${medRemove}">
		<input type="button" name="remove" value="Remove Media Account">

</body>
</html>