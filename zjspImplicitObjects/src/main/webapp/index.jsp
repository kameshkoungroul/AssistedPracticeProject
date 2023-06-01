<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Implicit Objects</title>
</head>
<body>
    <h1>JSP Implicit Objects</h1>
    <ul>
        <li>Request URI: <%= request.getRequestURI() %></li>
        <li>Context Path: <%= request.getContextPath() %></li>
        <li>Servlet Path: <%= request.getServletPath() %></li>
        <li>Query String: <%= request.getQueryString() %></li>
        <li>Request Method: <%= request.getMethod() %></li>
    </ul>
</body>
</html>

