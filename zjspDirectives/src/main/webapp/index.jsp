<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="header.jsp" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Directives</title>
</head>
<body>
    <%-- JSP Comment --%>
    <h1>JSP Directives</h1>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <p>Welcome, <%= request.getParameter("name") %>!</p>
    <c:set var="price" value="10" />
    <c:if test="${price > 0}">
        <p>The price is ${price}</p>
    </c:if>
</body>
</html>
