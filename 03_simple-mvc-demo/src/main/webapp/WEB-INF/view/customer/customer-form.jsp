<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer registration form</title>
    <style>
        .error { color: red }
    </style>
</head>
<body>
    <form:form action="/customer/process-form" modelAttribute="customer">

        First name: <form:input path="firstName"/>
        <%-- Spring form error field to display error --%>
        <form:errors path="firstName" cssClass="error"/>
        <br><br>
        Last name: <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
