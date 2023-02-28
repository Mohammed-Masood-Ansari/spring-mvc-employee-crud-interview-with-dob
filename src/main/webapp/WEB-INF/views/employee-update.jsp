<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form:form action="updateEmployee" modelAttribute="editemployee">
			
			<form:label path="employeeId">EmployeeId</form:label>
			<form:input path="employeeId"/><br>
			
			<form:label path="employeeName">EmployeeName</form:label><br>
			<form:input path="employeeName"/><br>
			
			<form:label path="employeeEmail">EmployeeEmail</form:label><br>
			<form:input path="employeeEmail"/><br>
			
			<form:label path="employeeDob">EmployeeDob</form:label><br>
			<form:input path="employeeDob"/><br>
			
			<form:label path="employeeSalary">EmployeeSalary</form:label><br>
			<form:input path="employeeSalary"/><br>
			
			<form:label path="employeeActive">EmployeeActive</form:label><br>
			<form:input path="employeeActive"/><br>
			
			<input type="submit" value="update">
		</form:form>
</body>
</html>