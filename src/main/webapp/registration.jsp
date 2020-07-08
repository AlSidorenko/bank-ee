<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 15.04.2020
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>
<%@ page session = "true"%>

<html>
<head>
    <!-- Localization -->
    <fmt:setLocale value="${sessionScope.locale}" />
    <fmt:setBundle basename="mylabels" />

    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>

<!-- Header Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/header.jsp"/>

<div class="container">
    <div class="row ">
        <div class="col-md-12 mb-2 mt-4">
            <h2 align="center" class="mb-3"><fmt:message key="registration.registration.form" /></h2>
            <br/><br/>
            <form action="${pageContext.request.contextPath}/app/registration" method="post" class="form-sigin">
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="first_name"><fmt:message key="registration.first.name" /></label>
                        <input type="text" class="form-control" name="first_name" id="first_name" placeholder="" value="" required>
                    </div>

                    <div class="col-md-6 mb-3">
                        <label for="last_name"><fmt:message key="registration.last.name" /></label>
                        <input type="text" class="form-control" name="last_name" id="last_name" placeholder="" value="" required>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="email"><fmt:message key="registration.email" /></label>
                    <input type="email" class="form-control" name="email" id="email" placeholder="you@example.com" required>
                </div>

                <div class="mb-3">
                    <label for="phone"><fmt:message key="registration.phone.number" /></label>
                    <input type="phone" class="form-control" name="phone" id="phone" placeholder="+38(050)1234567" required>
                </div>

                <div class="mb-3">
                    <label for="login"><fmt:message key="registration.login" /></label>
                    <input type="login" class="form-control" name="phone" id="login" placeholder="" required>
                </div>

                <div class="mb-3">
                    <label for="password"><fmt:message key="registration.password" /></label>
                    <input type="password" class="form-control" name="password" id="password" required>
                </div>

                <br/>
                <hr class="mb-4">
                <button class="btn btn-lg btn-primary btn-block" type="submit" value="Enter" class="submit">Registration</button>
            </form>
        </div>
    </div>
</div> <!-- /container -->

<br/><br/><br/><br/><br/><br/><br/><br/>
<!-- Footer Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/footer.jsp"/>
</body>
</html>
