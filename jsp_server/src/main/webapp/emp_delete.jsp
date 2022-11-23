<%@page import="jsp_server.Dao.employee_dao"%>
<%@page import="jsp_server.bean.employee"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>emp_delete</title>
</head>
<body>
<%
employee emp = new employee(); 
employee_dao empdao = new employee_dao(); 

emp.setEmp_id(Integer.parseInt(request.getParameter("emp_id")));
empdao.deleteEmployee(emp);
response.sendRedirect("select.jsp");

%>
</body>
</html>

