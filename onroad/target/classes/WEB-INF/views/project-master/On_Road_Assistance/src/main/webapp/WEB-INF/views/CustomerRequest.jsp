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
<c:url var="action" value="/customer/search"></c:url>
	<form:form method="post" action="${action }" commandName="customerRequest"
		cssClass="customerForm">
		<table>
			<c:if test="${!empty customerRequest }">
				<tr>
					<td><form:label path="customerId" cssClass="customerLabel">
							<spring:message code="label.customerId" />
						</form:label></td>
					<td><form:input path="customerId" readonly="true" size="8"
							disabled="true" /> <form:hidden path="customerId" /></td>
				</tr>
			</c:if>
			<tr>
				<td><form:label path="customerName" cssClass="customerLabel">
						<spring:message code="label.customerName" />
					</form:label></td>
				<td><form:input path="customerName" /> <form:errors path="customerName"
						cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="contactNumber" cssClass="customerLabel">
						<spring:message code="label.contactNumber" />
					</form:label></td>
				<td><form:input path="contactNumber" /> <form:errors path="contactNumber"
						cssClass="contactNumber"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="email" cssClass="customerLabel">
						<spring:message code="label.email" />
					</form:label></td>
				<td><form:input path="email" /> <form:errors path="email"
						cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="location" cssClass="customerLabel">
						<spring:message code="label.location" />
					</form:label></td>
				<td><form:input path="location" /> <form:errors path="location"
						cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="latitude" cssClass="customerLabel">
						<spring:message code="label.latitude" />
					</form:label></td>
				<td><form:input path="latitude" /> <form:errors path="latitude"
						cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="longitude" cssClass="customerLabel">
						<spring:message code="label.longitude" />
					</form:label></td>
				<td><form:input path="longitude" /> <form:errors path="longitude"
						cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td colspan="2">
						<input type="submit"
							value="Search" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>