<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="addStudent" method="post">

		<label>Student Id</label>
		<form:input path="studentId" />

		<form:errors path="studentId" />

		<label>Student Name</label>
		<form:input path="studentName" />

		<label>Student Father's Name</label>
		<form:input path="fatherName" />


		<label>Section</label>

		<form:select path="section" items="${sectionList}" />

		<label>City name</label>
		<form:input path="address.cityName" />

		<label>Street name</label>
		<form:input path="address.StreetName" />

		<label>Pin code</label>
		<form:input path="address.pinCode" />


		<input type="submit" value="add">



	</form:form>

</body>
</html>