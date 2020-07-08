<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 23.09.2019
  Time: 23:59
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
    <title>User Bills</title>
</head>
<body>
<!-- HeaderUser Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/headerUser.jsp"/>

<br/>
<div class="container">
    <div class="row">
        <br/><br/>
        <h1 align="center">Hello USER!</h1>
        <br/>

        <div class="col-xs-12 col-md-8">
            <img class="img-fluid rounded mb-3 mb-md-0"
                 src="${pageContext.request.contextPath}/static/media/payBill.jpg" width="600" height="400" alt="">
        </div> <!-- /.class="col-xs-12 col-md-8" -->

        <div class="col-xs-12 col-md-4">
            <form action="" method="post">
                <div align="left"><!-- Select Account -->
                    <label for="select_account"><h3>Select Account:</h3></label>
                    <select id="select_account" class="form-control" name="services">
                        <option disabled>Select Account</option>
                        <option value="account_001">Account_001</option>
                        <option value="account_002">Account_002</option>
                    </select>
                </div><!-- ./Select Account -->
                <div align="left"><!-- Select Services -->
                    <label for="select_services"><h3>Select Services:</h3></label>
                    <select id="select_services" class="form-control" name="services">
                        <option disabled>Select Services</option>
                        <option value="electricity">Electricity</option>
                        <option value="internet">Internet</option>
                        <option value="phone">Phone</option>
                        <option value="public_services">Public Services</option>
                    </select>
                </div><!-- ./Select Services -->
                <div align="left">
                    <label for="text"><h3>Amount:</h3></label>
                    <input name="text" id="text" class="form-control" placeholder="0.00">
                </div>
                <br/>
                <!--Button Get -->
                <button class="btn btn-lg btn-primary" type="submit" value="Enter">Submit</button>
            </form>
        </div> <!-- /.class="col-xs-12 col-md-4" -->
    </div> <!-- /.row -->
</div> <!-- /.container -->

<br/><br/><br/><br/><br/><br/>

<!-- Footer Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/footer.jsp"/>
</body>
</html>
