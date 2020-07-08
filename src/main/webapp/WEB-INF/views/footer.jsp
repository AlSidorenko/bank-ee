<%--
  Created by IntelliJ IDEA.
  User: Александр
  Date: 09.05.2020
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>

<html>
    <footer>
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
        <%@ page isELIgnored = "false"%>
        <%@ page session = "true"%>

        <fmt:setLocale value="${sessionScope.locale}" />
        <fmt:setBundle basename="mylabels" />
    </footer>

    <body>
    <hr>
    <div class="container">
        <h5><fmt:message key="footer.developer" /></h5>
    </div>
    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/static/js/jquery-1.12.4.min.js" integrity="sha384-nvAa0+6Qg9clwYCGGPpDQLVpLNn0fRaROjHqs13t4Ggj3Ez50XnGQqc/r8MhnRDZ" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"><\/script>')</script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${pageContext.request.contextPath}/static/js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>
