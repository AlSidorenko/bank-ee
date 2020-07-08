<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 16.04.2020
  Time: 14:36
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
    <title>User Info</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/style.css">
</head>
<body>

<!-- HeaderUser Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/headerUser.jsp"/>

<br/>
<h1 align="center">Hello <c:out value="${login}"/>!</h1>

<!-- Current Account -->
<h3 align="center">Current Account(s)</h3>
<div align="center" id="container">
    <div id="content">
        <!-- put new button: Open new account -->
        <div align="right">
            <input type="button" value="Open Current Account"
                   onclick="window.location.href='${pageContext.request.contextPath}/app/user/addCurrentAccount'; return false;"
                   class="add_current_account"/>
        </div>

        <table border="1">
            <tr>
                <th><p align="center">Currency</p></th>
                <th><p align="center">Account number</p></th>
                <th><p align="center">Amount</p></th>
                <th><p align="center">Action</p></th>
            </tr>
            <c:forEach var="currentAccounts" items="${CURRENT_ACCOUNT_LIST}">
                <!-- set up a link to closed a current account -->
                <c:url var="closeAccount" value="${pageContext.request.contextPath}/app/user/info">
                    <c:param name="currentAccountId" value="${currentAccounts.idCurrentAccount}"/>
                </c:url>
                <tr>
                    <td> ${currentAccounts.currency} </td>
                    <td> ${currentAccounts.numberCurrentAccount} </td>
                    <td> ${currentAccounts.amountCurrentAccount} </td>
                    <td>
                        <a href="${closeAccount}"
                           onclick="if (!(confirm('Are you sure you want to close this account?'))) return false">
                            Close</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div> <!-- Close Current Account -->

<br/>

<!-- Deposit Account -->
<h3 align="center">Deposit Account(s)</h3>
<div>
    <table align="center" border="1">
        <tr>
            <th><p align="center">Currency</p></th>
            <th><p align="center">Type</p></th>
            <th><p align="center">Term (months)</p></th>
            <th><p align="center">Account number</p></th>
            <th><p align="center">Amount</p></th>
            <th><p align="center">Percent (%)</p></th>
            <th><p align="center">Action</p></th>
        </tr>
        <c:forEach var="depositAccounts" items="${DEPOSIT_ACCOUNT_LIST}">
            <!-- set up a link to closed a deposit account -->
            <c:url var="closeDeposit" value="${pageContext.request.contextPath}/app/user/info">
                <c:param name="depositAccountId" value="${depositAccounts.idDepositAccount}"/>
            </c:url>
            <tr>
                <td> ${depositAccounts.currencyDepositAccount} </td>
                <td> ${depositAccounts.typeDepositAccount} </td>
                <td> ${depositAccounts.termDepositAccount} </td>
                <td> ${depositAccounts.numberDepositAccount} </td>
                <td> ${depositAccounts.amountDepositAccount} </td>
                <td> ${depositAccounts.percentDepositAccount} </td>
                <td>
                    <a href="${closeDeposit}"
                       onclick="if (!(confirm('Are you sure you want to close this deposit?'))) return false">
                        Close</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div> <!-- Close Deposit Account -->

<br/>
<%--
<!-- Credit Account -->
<h3 align="center">Credit Account(s)</h3>
<div>
    <table align="center" border="1">
        <tr>
            <th><p align="center">Currency</p></th>
            <th><p align="center">Type</p></th>
            <th><p align="center">Term</p></th>
            <th><p align="center">Account number</p></th>
            <th><p align="center">Amount</p></th>
            <th><p align="center">Percent (%)</p></th>
            <th><p align="center">Action</p></th>
        </tr>
        <c:forEach var="creditAccounts" items="#">
            <tr>
                    <td> ${currentAccounts.currency} </td>
                    <td> ${currentAccounts.numberCurrentAccount} </td>
                    <td> ${currentAccounts.amountCurrentAccount} </td>
                        <td>
                            <a href="${deleteLink}"
                               onclick="if (!(confirm('Are you sure you want to close this account?'))) return false">
                                Close</a>
                        </td>
            </tr>
        </c:forEach>
    </table>
</div> <!-- Close Credit Account -->
--%>
<!-- Footer Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/footer.jsp"/>
</body>
</html>
