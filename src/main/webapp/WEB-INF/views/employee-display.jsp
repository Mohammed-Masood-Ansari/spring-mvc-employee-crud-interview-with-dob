<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<table border='2'>

		<tr>
			<th>employeeId</th>
			<th>employeeActive</th>
			<th>employeeAge</th>
			<th>employeeDob</th>
			<th>employeeEmail</th>
			<th>employeeName</th>
			<th>employeeSalary</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		
		<c:forEach var="employee" items="${employeelist}">
			
			<tr>
				
				<td>${employee.getEmployeeId()}</td>
				<td>${employee.isEmployeeActive()}</td>
				<td>${employee.getEmployeeAge()}</td>
				<td>${employee.getEmployeeDob()}</td>
				<td>${employee.getEmployeeEmail()}</td>
				<td>${employee.getEmployeeName()}</td>
				<td>${employee.getEmployeeSalary()}</td>
				<td><button><a href="deleteemployee?employeeId=${employee.getEmployeeId()}">Delete</a></button></td>
				<td><button><a href="employeeEdit?employeeId=${employee.getEmployeeId()}">Update</a></button></td>
			</tr>
		
		</c:forEach>

	</table>

</body>
</html>