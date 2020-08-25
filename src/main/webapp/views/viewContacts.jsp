<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All</title>
<script type="text/javascript">
	function deleteConfirm(){
		
		return confirm("Are you sure, You want to delete?");
	}


</script>
</head>
<body>
	<a href="http://localhost:8083/PhoneBook/">+AddContact</a>
	<form:form action="allContacts" modelAttribute="contacts" method="get">
		<table border="1">

			<thead>
				<tr>
					<th>S.N</th>
					<th>Name</th>
					<th>Email</th>
					<th>Phone Number</th>
					<th>Action</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach items="${contacts}" var="c" varStatus="index">
					<tr>
					<!-- <td>${index.count+1}</td> -->
						<td>${c.contactId}</td>
						<td>${c.contactName}</td>
						<td>${c.contactEmail}</td>
						<td>${c.contactNumber}</td>
						<td>
							<a href="editContact?cId=${c.contactId}">Edit</a> |
							<a href="deleteContact?contactId=${c.contactId }" onclick="deleteConfirm()">Delete</a>
						</td>
					</tr>


				</c:forEach>


			</tbody>




		</table>
	</form:form>


</body>
</html>