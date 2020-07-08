<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 23.09.2019
  Time: 23:57
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

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Base</title>
</head>
<body>
<!-- HeaderUser Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/headerUser.jsp"/>

<br>
<h1 align="center"><fmt:message key="user.hello.user"/> - <c:out value="${login}"/>!</h1>
<br/>

<div class="container">

    <div class="row">
        <div class="col-md-7">
            <a href="${pageContext.request.contextPath}/app/user/bills">
                <img class="img-fluid rounded mb-3 mb-md-0"
                     src="${pageContext.request.contextPath}/static/media/bill.jpg" width="600" height=400" alt="">
            </a>
        </div>

        <div align="center" class="col-md-5">
            <br/><br/><br/>
            <p><fmt:message key="user.public.services"/></p>
            <a class="btn btn-primary buy-btn" href="${pageContext.request.contextPath}/app/user/bills">Bills</a>
        </div>

    </div>
    <br/>
    <!-- /.row -->

    <hr>

    <div class="row">
        <div class="col-md-7">
            <a href="${pageContext.request.contextPath}/app/user/transfers">
                <img class="img-fluid rounded mb-3 mb-md-0"
                     src="${pageContext.request.contextPath}/static/media/transfer.jpg" width="600" height="400" alt="">
            </a>
        </div>

        <div align="center" class="col-md-5">
            <br/><br/><br/>
            <p><fmt:message key="user.public.services"/></p>
            <a class="btn btn-primary buy-btn"
               href="${pageContext.request.contextPath}/app/user/transfers">Transfers</a>
        </div>

    </div>
    <br/>
    <!-- /.row -->
    <hr>

    <div class="row">
        <div class="col-md-7">
            <a href="${pageContext.request.contextPath}/app/user/info">
                <img class="img-fluid rounded mb-3 mb-md-0"
                     src="${pageContext.request.contextPath}/static/media/info.jpg" width="600" height="400" alt="">
            </a>
        </div>

        <div align="center" class="col-md-5">
            <br/><br/><br/>
            <p><fmt:message key="user.public.services"/></p>
            <a class="btn btn-primary buy-btn" href="${pageContext.request.contextPath}/app/user/info">Info</a>
        </div>

    </div>
    <!-- /.row -->
</div> <!-- /container -->

<!-- Footer Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/footer.jsp"/>
</body>
</html>
