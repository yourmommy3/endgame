<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <a href="add_book.jsp">Add Book</a>

<table border="1px">
 <tr>
  <th>Book Price</th>
  <th>Book Author</th>
  <th>Book Title</th>
  <th>Edit</th>
  <th>Delete</th>
 </tr>
 <c:forEach items="${books}" var="book">
  <tr>
   <td>${book.bookPrice}</td>
   <td>${book.bookAuthor}</td>
   <td>${book.bookTitle}</td>
   <td><a href="<%=request.getContextPath()%>/BookController?flag=editBook&bookId=${book.bookId}">EDIT</a></td>
   <td><a href="<%=request.getContextPath()%>/BookController?flag=deleteBook&bookId=${book.bookId}">DELETE</a></td>
   
  </tr>

 </c:forEach>
</table>
</body>
</html>