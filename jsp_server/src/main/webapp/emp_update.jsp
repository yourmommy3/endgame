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
int id=Integer.parseInt(request.getParameter("emp_id")); 
emp.setEmp_name(request.getParameter("emp_name")); 
emp.setEmp_sal(Double.parseDouble(request.getParameter("emp_sal"))); 
emp.setEmp_email(request.getParameter("emp_email")); 
emp.setEmp_id(Integer.parseInt(request.getParameter("emp_id")));
empdao.updateEmployee(emp);
response.sendRedirect("http://localhost:8080/jsp_server/emp_select.jsp?emp_id="+id);

%>
</body>
</html>