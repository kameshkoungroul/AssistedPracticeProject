<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Action Tags</title>
</head>
<body>
    <h1>JSP Action Tags</h1>

    <jsp:useBean id="person" class="com.example.Person" scope="request" />

    <jsp:setProperty name="person" property="name" value="John Doe" />
    <jsp:setProperty name="person" property="age" value="30" />

    <p>Name: <jsp:getProperty name="person" property="name" /></p>
    <p>Age: <jsp:getProperty name="person" property="age" /></p>

    <jsp:forward page="anotherPage.jsp" />

    <jsp:include page="includedPage.jsp" />
</body>
</html>
