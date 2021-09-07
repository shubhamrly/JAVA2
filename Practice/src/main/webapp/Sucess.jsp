<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
#1{

}
body{
 background-color: red;
 background-image:url("https://giphy.com/static/img/zoomies.gif");
 border-radius: 10px; 
 background-repeat: no-repeat;
 size:full;
}
</style>
<body>
<p id ="1"></p>
<% 
Cookie c  [] = request.getCookies();

%>
<% out.println("Wel-cum  "+ c[0].getValue()) ;   %>
</body>
</html>