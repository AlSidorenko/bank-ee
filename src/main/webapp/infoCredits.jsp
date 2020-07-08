<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 02.06.2020
  Time: 16:52
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
    <title>Credits</title>
</head>
<body>
<!-- Header Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/header.jsp"/>

<br/>
<h2 align="center">Credits</h2>

<div class="container">
    <div class="row">
        <div id="productList">
            <div class="row">

                <!-- PRODUCT DATA -->
                <div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xlg-4">
                    <div class="panel panel-default product">
                        <div class="panel-body">
                            <div class="thumbnail">
                                <img src="${pageContext.request.contextPath}/static/media/cred_001.jpg">
                            </div>
                            <h4 class="name">Credit card</h4>
                            <div class="currency">Currency: UAH</div>
                            <div class="rate">Interest rate: 15.00%</div><br/>
                            <div class="list-group">
                                <span class="list-group-item"> <small>Conditions:</small>
                                    <div><small> - down payment 0%</small></div>
                                    <div><small> - passport</small></div>
                                    <div><small> - certificate of id code</small></div>
                                    <div><small> - certificate of income</small></div>
                                </span>
                                <span class="list-group-item"> <small>Credit term:</small>
                                    <div><small> - up to 2 years</small></div>
                                </span>
                            </div>
                        </div>
                    </div>
                </div> <!-- /PRODUCT DATA -->

                <!-- PRODUCT DATA -->
                <div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xlg-4">
                    <div class="panel panel-default product">
                        <div class="panel-body">
                            <div class="thumbnail">
                                <img src="${pageContext.request.contextPath}/static/media/cred_002.jpg">
                            </div>
                            <h4 class="name">Car loan</h4>
                            <div class="currency">Currency: UAH</div>
                            <div class="rate">Interest rate: 12.00%</div><br/>
                            <div class="list-group">
                                <span class="list-group-item"> <small>Conditions:</small>
                                    <div><small> - down payment 30%</small></div>
                                    <div><small> - passport</small></div>
                                    <div><small> - certificate of id code</small></div>
                                    <div><small> - certificate of income</small></div>
                                </span>
                                <span class="list-group-item"> <small>Credit term:</small>
                                    <div><small> - up to 5 years</small></div>
                                </span>
                            </div>
                        </div>
                    </div>
                </div> <!-- /PRODUCT DATA -->

                <!-- PRODUCT DATA -->
                <div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xlg-4">
                    <div class="panel panel-default product">
                        <div class="panel-body">
                            <div class="thumbnail">
                                <img src="${pageContext.request.contextPath}/static/media/cred_003.jpg">
                            </div>
                            <h4 class="name">Real estate loan</h4>
                            <div class="currency">Currency: UAH</div>
                            <div class="rate">Interest rate: up to 10%</div><br/>
                            <div class="list-group">
                                <span class="list-group-item"> <small>Conditions:</small>
                                    <div><small> - down payment 20%</small></div>
                                    <div><small> - passport</small></div>
                                    <div><small> - certificate of id code</small></div>
                                    <div><small> - certificate of income</small></div>
                                </span>
                                <span class="list-group-item"> <small>Credit term:</small>
                                    <div><small> - up to 5 years</small></div>
                                </span>
                            </div>
                        </div>
                    </div>
                </div> <!-- /PRODUCT DATA -->
            </div> <!--ROW -->
        </div> <!--productList -->
    </div> <!--ROW -->
</div> <!--container-fluid-->

<br/><br/>

<!-- Footer Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/footer.jsp"/>
</body>
</html>
