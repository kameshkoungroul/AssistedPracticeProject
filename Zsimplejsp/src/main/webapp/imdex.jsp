<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple JSP Page</title>
</head>
<body>
    <h1>Welcome to my JSP Page!</h1>
    <% 
        String name = "John Doe";
        int age = 30;
    %>
    <p>Name: <%= name %></p>
    <p>Age: <%= age %></p>
</body>
</html>
