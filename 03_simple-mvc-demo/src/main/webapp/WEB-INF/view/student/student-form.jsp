<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="/student/process-form" modelAttribute="student">
        First name: <form:input path="firstName"/>
        <br><br>
        Last name: <form:input path="lastName"/>
        <br><br>
        Country:
        <form:select path="country">
            <form:options items="${theCountryOptions}"/>
        </form:select>
        <br><br>
        Favorite Language:

        Java <form:radiobutton path="favoriteLanguage" value="Java"/>
        C# <form:radiobutton path="favoriteLanguage" value="C#"/>
        PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
        Go <form:radiobutton path="favoriteLanguage" value="Go"/>

        <br><br>
        Operating systems:
        Linux <form:checkbox path="operatingSystems" value="Linux"/>
        Mac Os <form:checkbox path="operatingSystems" value="Mac Os"/>
        MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>

        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
