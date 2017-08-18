<%@ include file="parent.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<center>
	<form:errors path="student.*" ><hr></form:errors>
	<form action="submitAdmissionForm" method="post">
			<table>
				<caption><b>Application Form</b></caption>
				<tr>
					<td>Student Name</td>
					<td><input type="text" name="studentName" /></td>
				</tr>
				<tr>
					<td>Date of Birth</td>
					<td><input type="text" name="dob" /></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input type="text" name="mobile" /></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address" /></td>
				</tr>
				<!-- <tr>
					<td>House No.</td>
					<td><input type="text" name="address.houseNo" /></td>
				</tr>
				
				<tr>
					<td>Street</td>
					<td><input type="text" name="address.street" /></td>
				</tr>
				<tr>
					<td>Locality</td>
					<td><input type="text" name="address.locality" /></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="address.city" /></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input type="text" name="address.state" /></td>
				</tr>
				<tr>
					<td>Country</td>
					<td>
						<select name="address.country">
							<option value="Argentina">Argentina</option>
							<option value="Austria">Austria</option>
							<option value="India">India</option>
							<option value="Russia">Russia</option>
							<option value="USA">USA</option>
						</select>
					</td>
				</tr> -->
				<tr>
					<td colspan="2"><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</form>
		</center>
</body>
</html>