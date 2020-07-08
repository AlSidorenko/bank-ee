<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 17.04.2020
  Time: 20:10
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
    <title>Add User's Account</title>
</head>
<body>
<!-- HeaderUser Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/headerUser.jsp"/>

<br/><br/><br/>
<h1 align="center">Open new User's current account</h1><br/>

<br/>
<div class="container">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <!--Form -->
            <div align="center">
                <form method="post" action="${pageContext.request.contextPath}/app/user/addCurrentAccount"
                      class="form-sigin">
                    <p align="center"><select name="currency" class="form-control">
                        <option disabled>Choose Currency</option>
                        <option value="UAH">UAH</option>
                        <option value="USD">USD</option>
                        <option value="EUR">EUR</option>
                    </select>
                        <br/>
                        <input class="btn btn-lg btn-primary btn-block" type="submit" value="Submit"/>
                    </p>
                    <a href="${pageContext.request.contextPath}/app/user/info"><h4>User Info</h4></a></br>
                </form><!-- /Form -->
            </div>
        </div> <!-- /.col-md-4 -->
    </div> <!-- /row -->
</div> <!-- /container -->

<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>

<!-- Footer Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/footer.jsp"/>
</body>
</html>
