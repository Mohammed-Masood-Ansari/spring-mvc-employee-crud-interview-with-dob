<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body id="back">
	<div>

		<div>
			<form:form action="saveEmployee" method="post" modelAttribute="employee">
						<form:label path="employeeName">EmployeeName</form:label> 
						<form:input path="employeeName" class="form-control" 
						aria-describedby="emailHelp" placeholder="Enter Employee Name"/>
				<div class="form-group">
						<form:label path="employeeEmail">EmployeeEmail</form:label> 
						<form:input path="employeeEmail" class="form-control" 
						aria-describedby="emailHelp" placeholder="Enter Employee Email"/>
				</div>
				<div class="form-group">
						<form:label path="employeeDob">EmployeeDob</form:label> 
						<form:input path="employeeDob" class="form-control"
						aria-describedby="emailHelp" placeholder="yyyy-MM-dd"/>
				</div>
				<div class="form-group">
						<form:label path="employeeSalary">EmployeeSalary</form:label> 
						<form:input path="employeeSalary" class="form-control"
						aria-describedby="emailHelp" placeholder="Enter Employee Salary"/>
				</div>
				<div class="form-group">
				
						<form:label path="employeeActive">EmployeeSalary</form:label> 
						<form:input path="employeeActive" class="form-control"
						aria-describedby="emailHelp" placeholder="Enter Employee isActive"/>
				</div>
				<input type="submit" value="register"  class="btn btn-primary"/>
			</form:form>
		</div>

	</div>
</body>
</html>