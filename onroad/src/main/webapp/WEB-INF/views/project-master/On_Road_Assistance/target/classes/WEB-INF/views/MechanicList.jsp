<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${!empty mechanicList }">
		<h3>List Of Mechanics</h3>
		<table class="mechanicTable">
			<tr>
				<th width="100">Mechanic Name</th>
				<th width="160">Mechanic ID</th>
				<th width="60">Rating</th>
				<th width="80">Latitude</th>
				<th width="60">Longitude</th>
			</tr>
			<c:forEach items="${mechanicList }" var="mechanic">
				<tr>
					<td><a href="<c:url value='/select/${mechanic.mechanicId }'/>">${mechanic.mechanicName }</a></td>
					<td>${mechanic.mechanicId }</td>
					<td>${mechanic.rating }</td>
					<td>${mechanic.latitude }</td>
					<td>${mechanic.longitude }</td>
					
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>