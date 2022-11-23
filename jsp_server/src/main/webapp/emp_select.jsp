<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
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
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ep","root","tester");
Statement statement = connection.createStatement() ;
int id = Integer.parseInt(request.getParameter("emp_id"));
ResultSet resultset = statement.executeQuery("select * from emp where emp_id="+id+";");
%>
<% while(resultset.next()){ %>
          <table>
			<tr><td><%= resultset.getInt(1) %></td></tr>
            <tr><td><%= resultset.getString(2) %></td></tr>
			<tr><td><%= resultset.getDouble(3) %></td></tr>
            <tr><td><%= resultset.getString(4) %></td></tr>
        	
        </table>
           <% } %>
</body>
</html>