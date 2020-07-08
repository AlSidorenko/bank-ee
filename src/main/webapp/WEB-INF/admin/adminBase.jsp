<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 23.09.2019
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Base</title>
</head>
<body>
<!-- Header Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/header.jsp"/>

    <h1>Hello ADMIN!</h1><br/>
    <h2>Welcome back!</h2>

    <a href="${pageContext.request.contextPath}/app/logout">Logout</a>
    </br>
    <a href="${pageContext.request.contextPath}/app/logout">Main Page</a>

    <br/><br/>

<!-- Footer Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/footer.jsp"/>
</body>
</html>
