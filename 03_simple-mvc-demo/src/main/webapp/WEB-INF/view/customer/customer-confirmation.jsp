<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer confirmation</title>
</head>
<body>
    The customer is confirmed: ${customer.firstName} ${customer.lastName}.
    <br><br>
    Number of free passes: ${customer.freePasses}
</body>
</html>
