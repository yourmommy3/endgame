<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "./emp_save.jsp">
<table>
<tr>
<td>enter_emp_id:</td>
<td><input type="number" name="emp_id"></td>
</tr>
<tr>
<td>enter_emp_name:</td>
<td><input type="text" name="emp_name"></td>
</tr>
<tr>
<td>enter_emp_sal:</td>
<td><input type="text" name="emp_sal"></td>
</tr>
<tr>
<td>enter_emp_email:</td>
<td><input type="text" name="emp_email"></td>
</tr>
<tr>
<td><input type="reset"></td>
<td><input type="submit"></td>
</tr>
</table>
</form>
</body>
</html>