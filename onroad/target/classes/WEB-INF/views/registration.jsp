<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="action" value="/"></c:url>
<form:form method="post" action="${action}" commandName="customer">
<form:label path="id"></form:label>
<form:input path="id"/>
<form:label path="name"></form:label>
<form:input path="name"/>
<form:label path="password"></form:label>
<form:input path="password"/>
<form:label path="gender"></form:label>
<form:input path="gender"/>
<form:label path="contactNo"></form:label>
<form:input path="contactNo"/>
<form:label path="emailId"></form:label>
<form:input path="emailId"/>
</form:form>
</body>
</html>