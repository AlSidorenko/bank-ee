<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 04.05.2020
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>

<html>
    <header>
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
        <%@ page isELIgnored = "false"%>
        <%@ page session = "true"%>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="${pageContext.request.contextPath}/static/icon/favicon.ico">

        <!-- Localization -->
        <fmt:setLocale value="${sessionScope.locale}" />
        <fmt:setBundle basename="mylabels" />

        <!-- Bootstrap core CSS -->
        <link href="${pageContext.request.contextPath}/webjars/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">

        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <link href="${pageContext.request.contextPath}/static/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="${pageContext.request.contextPath}/static/css/starter-template.css" rel="stylesheet">

        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]>
        <script src="${pageContext.request.contextPath}/static/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="${pageContext.request.contextPath}/static/js/ie-emulation-modes-warning.js"></script>

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="${pageContext.request.contextPath}/static/js/html5shiv.min.js"></script>
        <script src="${pageContext.request.contextPath}/static/js/respond.min.js"></script>
        <![endif]-->
    </header>
    <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"><fmt:message key="header.bank" /></a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="${pageContext.request.contextPath}/app/main"><fmt:message key="header.home" /></a></li>
                <li><a href="${pageContext.request.contextPath}/app/deposits"><fmt:message key="header.deposits" /></a></li>
                <li><a href="${pageContext.request.contextPath}/app/credits"><fmt:message key="header.credits" /></a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="?locale=en"><fmt:message key="header.english" /></a></li>
                <li><a href="?locale=ua"><fmt:message key="header.ukraine" /></a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
    </nav>

    </body>
</html>
