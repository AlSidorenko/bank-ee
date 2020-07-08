<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 02.06.2020
  Time: 16:52
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
    <title>Deposits</title>
</head>
<body>

<!-- Header Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/header.jsp"/>

<br/>
<h2 align="center">Deposits</h2>
<br/>

<div class="container">
    <div class="row">
        <div id="productList">
            <div class="row">

                <!-- PRODUCT DATA -->
                <div class="col-xs-12 col-sm-6 col-md-4 col-lg-4 col-xlg-4">
                    <div class="panel panel-default product">
                        <div class="panel-body">
                            <div class="thumbnail">
                                <img src="${pageContext.request.contextPath}/static/media/dep_001.jpg">
                            </div>
                            <h4 class="name">Classic deposit</h4>
                            <div class="currency">Currency: UAH USD EUR</div>
                            <div class="rate">Interest rate: up to 9.00%</div><br/>
                            <div class="list-group">
                                <span class="list-group-item"> <small>Conditions:</small>
                                    <div><small> - highest interest rate</small></div>
                                    <div><small> - without extension</small></div>
                                    <div><small> - without replenishment</small></div>
                                    <div><small> - without the possibility of early withdrawal</small></div>
                                    <div><small> - interest payment at the end of the term</small></div>
                                </span>
                                <span class="list-group-item"> <small>Deposit term:</small>
                                    <div><small> - from 1 month</small></div>
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
                                <img src="${pageContext.request.contextPath}/static/media/dep_002.jpg">
                            </div>
                            <h4 class="name">Savings deposit</h4>
                            <div class="currency">Currency: UAH USD EUR</div>
                            <div class="rate">Interest rate: up to 8.75%</div><br/>
                            <div class="list-group">
                                <span class="list-group-item"> <small>Conditions:</small>
                                    <div><small> - with prolongation</small></div>
                                    <div><small> - with the right to replenish</small></div>
                                    <div><small> - monthly interest payment</small></div>
                                    <div><small> - partial withdrawal of funds</small></div>
                                    <div><small> <br/></small></div>
                                </span>
                                <span class="list-group-item"> <small>Deposit term:</small>
                                    <div><small> - 3 months, 6 months, 367 days</small></div>
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
                                <img src="${pageContext.request.contextPath}/static/media/dep_003.jpg">
                            </div>
                            <h4 class="name">Universal deposit</h4>
                            <div class="currency">Currency: UAH USD EUR</div>
                            <div class="rate">Interest rate: up to 8.50%</div><br/>
                            <div class="list-group">
                                <span class="list-group-item"> <small>Conditions:</small>
                                    <div><small> - unlimited deposit</small></div>
                                    <div><small> - with the right to replenish</small></div>
                                    <div><small> - partial withdrawal of funds</small></div>
                                    <div><small> - monthly interest capitalization</small></div>
                                    <div><small> <br/></small></div>
                                </span>
                                <span class="list-group-item"> <small>Deposit term:</small>
                                    <div><small> - termless</small></div>
                                </span>
                            </div>
                        </div>
                    </div>
                </div> <!-- /PRODUCT DATA -->
            </div> <!--ROW -->
        </div> <!--productList -->
    </div> <!--ROW -->
</div> <!--container-fluid-->

<br/>

<!-- Footer Page -->
<jsp:include page="${pageContext.request.contextPath}/WEB-INF/views/footer.jsp"/>

</body>
</html>
