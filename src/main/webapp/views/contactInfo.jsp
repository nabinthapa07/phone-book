<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h2>Save Contact</h2>


	<p>
		<font color="green">${successMsg}</font>
	</p>

	<p>
		<font color="red">${errorMsg}</font>
	</p>

	<form:form action="saveContact" modelAttribute="contact" method="POST">
		<table>
			<tr>
				<td>Contact Name :</td>
				<td><form:input path="contactName" /></td>
			</tr>
			<tr>
				<td>Contact Email :</td>
				<td><form:input path="contactEmail" /></td>
			</tr>
			<tr>
				<td>Contact Number :</td>
				<td><form:input path="contactNumber" /></td>
			</tr>
			tr>
			<td><input type="reset" value="Reset"></td>
			<td><input type="submit" value="Save" /></td>
			</tr>

		</table>



	</form:form>

</body>
</html>