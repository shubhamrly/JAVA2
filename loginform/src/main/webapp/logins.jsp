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
  background-image: url("https://media.giphy.com/media/5L57f5fI3f2716NaJ3/giphy.gif?cid=ecf05e47fbwv112z06ou3alvuhou3se9gyryo29byyhht4er&rid=giphy.gif&ct=g");
  
}
</style>
<body >
<div>
<font style="color: green;">Welcome to new page</font> <br>
<% out.println("<font color=blue> Welcome "+request.getParameter("un")+"</font>");  %>
</div>
</body>
</html>