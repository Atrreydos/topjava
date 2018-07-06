<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<h2>Meals</h2>
<c:forEach items="${meals}" var="meal">
    <h2>
        <c:out value="${meal}"/>
    </h2>
</c:forEach>
</body>
</html>