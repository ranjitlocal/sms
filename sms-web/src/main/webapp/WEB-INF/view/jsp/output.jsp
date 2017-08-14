<%@ include file="parent.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Response</title>
</head>
<body>
<center>
	<form action="submitAdmissionForm" method="post">
		<table>
			<caption><b>Student Details</b></caption>
			<tr>
				<td><b>Student Name</b></td>
				<td>${student.studentName}</td>
			</tr>
			<tr>
				<td><b>Date of Birth</b></td>
				<td>${student.dob}</td>
			</tr>
			<tr>
				<td><b>Mobile No.</b></td>
				<td>${student.mobile}</td>
			</tr>
			<tr>
				<td><b>House No.</b></td>
				<td><b>${student.address.houseNo}</b></td>
			</tr>
			<tr>
				<td><b>Street</b></td>
				<td>${student.address.street}</td>
			</tr>
			<tr>
				<td><b>Locality</b></td>
				<td>${student.address.locality}</td>
			</tr>
			<tr>
				<td><b>City</b></td>
				<td>${student.address.city}</td>
			</tr>
			<tr>
				<td><b>State</b></td>
				<td>${student.address.state}</td>
			</tr>
			<tr>
				<td><b>Country</b></td>
				<td>${student.address.country}</td>
			</tr>
		</table>
	</form>
	</center>
</body>
</html>