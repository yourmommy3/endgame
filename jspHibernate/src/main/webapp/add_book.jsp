<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Book</title>
</head>
<body>

 <form action="<%=request.getContextPath()%>/BookController" method="post">
  Book Title <input type="text" name="bookTitle" value="${book.bookTitle}"><br>
  Book Author <input type="text" name="bookAuthor" value="${book.bookAuthor}"><br>
  Book Price<input type="number" name="bookPrice" value="${book.bookPrice}"><br>
  <input type="hidden" name="bookId" value="${book.bookId}"><br>
  <input type="submit" value="Add/Update Book">
 
 </form>

</body>
</html>