<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Book</title>
</head>
<body>

<a href="add_book.jsp">Add Book</a>

<a href="<%=request.getContextPath()%>/BookController?flag=viewBooks">View Book</a>

</body>
</html>