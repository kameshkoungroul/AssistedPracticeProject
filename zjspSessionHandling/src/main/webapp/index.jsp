<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Session Handling in JSP</title>
</head>
<body>
    <h1>Session Handling in JSP</h1>

    <%-- Check if session attribute is null --%>
    <% if (session.getAttribute("username") == null) { %>
        <%-- Set session attribute --%>
        <% session.setAttribute("username", "JohnDoe"); %>

        <%-- Retrieve session attribute --%>
        <p>Username: <%= session.getAttribute("username") %></p>

        <%-- Invalidate session --%>
        <% session.invalidate(); %>

        <%-- Check if session attribute is null --%>
        <% try { %>
            <% session.getAttribute("username"); %>
            <p>Session is still active.</p>
        <% } catch (IllegalStateException e) { %>
            <p>Session has been invalidated.</p>
        <% } %>
    <% } else { %>
        <p>Session is not valid.</p>
    <% } %>
</body>
</html>
