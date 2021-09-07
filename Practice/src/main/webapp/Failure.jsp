<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

body{
 background-image: url("https://media0.giphy.com/media/M8o1MOwcwsWOmueqN4/giphy.gif?cid=6c09b9520bad6668022997bec30fd4828553ba81ad274a15&rid=giphy.gif&ct=g");
 border-radius: 10px; 
 background-repeat: no-repeat;
 
}
</style>
<body>

<p id ="1">
<% 
 Cookie c [] = request.getCookies();
out.println("Fuck off  1  "+ c[0].getValue());   %>
</p>
</body>
</html>