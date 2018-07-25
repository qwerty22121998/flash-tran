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
        <title>Oders List - ${param.uid} - ${param.shipid} - FlashTrans</title>
        <jsp:include page="header.jsp"/>
        <jsp:useBean id="orders" class="DAO.orderDAO"/>

    </head>
    <body>
        <c:if test="${not empty param.page}">
            <div class='container' style="margin-top: 10px">
                <c:if test="${empty param.shipid}">
                    <c:if test="${not empty param.uid}">
                        <div class="row1">
                            <input type="text" class="btn btn-success col-xs-12" value="Order of user ${param.uid}" readonly/>
                        </div>
                        <div class="row1">
                            <c:forEach var="v" items='${orders.getTop(param.page, "where [uid]=\'".concat(param.uid).concat("\'"))}'>
                                <jsp:include page="orderThumb.jsp?id=${v}" />
                            </c:forEach>
                        </div>
                        <center> 
                            <c:if test='${param.page != 0}'>
                                <a class="btn btn-primary" href="orders.jsp?uid=${param.uid}&page=${param.page - 1}">Previous</a>
                            </c:if>
                            <a class="btn btn-primary" href="orders.jsp?uid=${param.uid}&page=${param.page + 1}">Next</a>
                        </center>
                    </c:if>
                    <c:if test="${empty param.uid}">
                        <div class="row1">
                            <input type="text" class="btn btn-success col-xs-12" value="All Orders" readonly/>
                        </div>
                        <div class="row1">
                            <c:forEach var="v" items='${orders.getTop(param.page, " ")}'>
                                <jsp:include page="orderThumb.jsp?id=${v}" />
                            </c:forEach>
                        </div>
                        <center> 
                            <c:if test='${param.page != 0}'>
                                <a class="btn btn-primary" href="orders.jsp?page=${param.page - 1}">Previous</a>
                            </c:if>
                            <a class="btn btn-primary" href="orders.jsp?page=${param.page + 1}">Next</a>
                        </center>
                    </c:if>
                </c:if>
                <c:if test="${not empty param.shipid}">
                    <div class="row1">
                        <input type="text" class="btn btn-success col-xs-12" value="Order for ${param.shipid}" readonly/>
                    </div>
                    <div class="row1">
                        <c:forEach var="v" items='${orders.getTop(param.page, "where shipid=\'".concat(param.shipid).concat("\'"))}'>
                            <jsp:include page="orderThumb.jsp?id=${v}" />
                        </c:forEach>
                    </div>
                    <center> 
                        <c:if test='${param.page != 0}'>
                            <a class="btn btn-primary" href="orders.jsp?shipid=${param.uid}&page=${param.page - 1}">Previous</a>
                        </c:if>
                        <a class="btn btn-primary" href="orders.jsp?shipid=${param.uid}&page=${param.page + 1}">Next</a>
                    </center>
                </c:if>


            </div>
        </c:if>

    </body>
    <footer>


        <jsp:include page="footer.jsp"/>
    </footer>
</html>
