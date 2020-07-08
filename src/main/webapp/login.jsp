<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 15.04.2020
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>
<%@ page session="true" %>

<html>
<head>
    <!-- Localization -->
    <fmt:setLocale value="${sessionScope.locale}"/>
    <fmt:setBundle basename="mylabels"/>

    <meta http-equiv="Content-Type" content="text/html" ; charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
<p>
    <!-- Header Page -->
    <jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/header.jsp"/>

<div class=" text-center col-lg-12 my-12  ml-12">
    <h1 align="center"><fmt:message key="login.page"/></h1><br/>
</div>


<div class=" text-center col-lg-3 my-5  ml-5">
    <form method="post" action="${pageContext.request.contextPath}/app/login" class="form-sigin">
        <table align="center">
            <tbody>
            <tr>
                <td><label><fmt:message key="login.login"/></label></td>
                <td><input type="text" class="form-control" name="login"/></td>
            </tr>
            <tr>
                <td><label><fmt:message key="login.password"/></label></td>
                <td><input type="password" class="form-control" name="pass"/></td>
            </tr>
            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Enter" class="submit"/></td>
            </tr>
            </tbody>
        </table>
    </form>
</div>

<br/><br/><br/>

<!-- Footer Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/footer.jsp"/>
</body>
</html>
