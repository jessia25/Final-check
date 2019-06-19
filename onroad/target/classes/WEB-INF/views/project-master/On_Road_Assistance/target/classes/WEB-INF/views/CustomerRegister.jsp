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
<c:url var="action" value="/customer/registerCustomer"></c:url>
	<form:form method="post" action="${action }" commandName="customer"
		cssClass="customerForm">
		<table>
			<tr>
				<td><form:label path="customerName" cssClass="customerLabel">
						<spring:message code="label.customerName" />
					</form:label></td>
				<td><form:input path="customerName" /> <form:errors path="customerName"
						cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="password" cssClass="customerLabel">
						<spring:message code="label.password" />
					</form:label></td>
				<td><form:input path="password" /> <form:errors path="password"
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
				<td><form:label path="gender" cssClass="customerLabel">
						<spring:message code="label.gender" />
					</form:label></td>
				<td><form:radiobutton path="gender" value="M"/>Male <form:errors path="gender"
						cssClass="error"></form:errors></td>
						<td><form:radiobutton path="gender" value="F" />Female <form:errors path="gender"
						cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="dateOfBirth" cssClass="customerLabel">
						<spring:message code="label.dateOfBirth" />
					</form:label></td>
				<td><form:input path="dateOfBirth" placeholder="yyyy/mm/dd"/> <form:errors path="dateOfBirth"
						cssClass="error"></form:errors></td>
			</tr>
			<tr>
				<td colspan="2">
						<input type="submit"
							value="Submit" />
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>