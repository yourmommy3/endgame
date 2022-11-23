<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
String i_no;
long n; 
long result; 
long factorial(long i_no){
	if(i_no==0)
		return 1;
	else
		return factorial(i_no-1)*i_no; 
	
}
%>

<%
i_no = request.getParameter("no");
n = Long.parseLong(i_no); 
result = factorial(n); 
%>
FACTORIAL->
<%= result %>
<br/><br/>

</body>
</html>



