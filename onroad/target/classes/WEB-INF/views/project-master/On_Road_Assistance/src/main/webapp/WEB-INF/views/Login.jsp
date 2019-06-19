<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/On_Road_Assistance/login" method="post">
<input type="text" name="userid" id="userid" placeholder="User ID" required><br>
<input type="password" name="password" id="password" placeholder="Password" required><br>
<input type="radio" name="type" id="C" value="C"><label for = "C">Customer</label>
<input type="radio" name="type" id="M" value="M"><label for = "M">Mechanic</label><br>
<input type="submit" value="Login">
</form>
<br>
<a href="/On_Road_Assistance/registerCustomer">Customer Register</a><br>
<a href="/On_Road_Assistance/registerMechanic">Mechanic Register</a>
</body>
</html>