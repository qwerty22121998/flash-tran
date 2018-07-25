<%-- 
    Document   : home
    Created on : Jul 23, 2018, 12:30:07 AM
    Author     : qwert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home - FlashTrans</title>
        <jsp:include page="header.jsp"/>
        <jsp:useBean id="orders" class="DAO.orderDAO"/>
        
    </head>
    <body>
        <div class='container' style="margin-top: 10px">

            <div class="row1">
                <button class="btn btn-success col-xs-12">Top 10 Recent Order</button>
            </div>
            <div class="row1">
                <c:forEach var="v" items='${orders.getTop("0","")}'>
                    <jsp:include page="orderThumb.jsp?id=${v}" />
                    <%--<jsp:include page="orderThumb.jsp?id=${v}" />--%>
                </c:forEach>
                <</div>
            <center>
                <a class="btn btn-primary" href="orders.jsp?page=0">More</a>
            </center>

        </div>

    </body>
    <footer>


        <jsp:include page="footer.jsp"/>
    </footer>
</html>
