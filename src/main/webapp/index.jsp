<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 15.04.2020
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored = "false"%>
<%@ page session = "true"%>

<html>
<head>
    <!-- Localization -->
    <fmt:setLocale value="${sessionScope.locale}" />
    <fmt:setBundle basename="mylabels" />

    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <title>Main Page</title>
</head>
<body>

<!-- Header Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/header.jsp"/>

    <div class="container">
    <div class="row">
        <div class="col-xs-12 col-md-8">
            <div class="starter-template">
                <h1><fmt:message key="main.welcome.to.our.bank" /></h1>
                <p class="lead"><fmt:message key="main.our.bank.has.a.variety.of.financial.services.and.operations" />
                    <br><fmt:message key="main.we.are.glad.that.you.have.chosen.us" /></p>
            </div>
        </div>
        <div class="col-xs-12 col-md-4">
            <div class="starter-template">
                <form method="post" action="${pageContext.request.contextPath}/app/login" class="form-signin">
                    <h2 class="form-signin-heading">
                        <fmt:message key="main.please.sign.in"/>
                    </h2>
                    <!-- Login -->
                    <label for="inputLogin" class="sr-only"><fmt:message key="main.login" /></label>
                    <input type="text" id="inputLogin" class="form-control" name="login" placeholder="Login"><br>
                    <!-- Password -->
                    <label for="inputPassword" class="sr-only"><fmt:message key="main.password" /></label>
                    <input type="password" id="inputPassword" class="form-control" name="pass" placeholder="Password" required><br>
                    <!-- Submin -->
                    <button class="btn btn-lg btn-primary btn-block" type="submit" value="Enter">Sign in</button><br>

                    <a href="${pageContext.request.contextPath}/app/registration"><h4><fmt:message key="main.registration.form" /></h4></a>
                </form>
            </div> <!-- /.starter-template -->
        </div>
    </div> <!-- /.row -->
    </div><!-- /.container -->

    <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
<!-- Footer Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/footer.jsp"/>
</body>
</html>
