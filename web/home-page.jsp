<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: darkh0le
  Date: 2019-04-23
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>Login Success</h1>
        <%--    Get servletContext--%>
    <p>El contador es : <c:out value="${pageContext.servletContext.getAttribute('counter')}"/></p>
</body>
</html>
