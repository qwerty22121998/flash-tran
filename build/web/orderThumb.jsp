<%-- 
    Document   : neworder
    Created on : Jul 23, 2018, 12:33:08 AM
    Author     : qwert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<style scoped>
    #map {
        width: 100%;
        height: 200px;
        background-color: grey;
    }
    .green {
        color: green
    }

    .l {
        background-color: #b7e2c2;
        width: 70%;
        height: 18em;
        margin: 1em 1em 0 15%;
        padding: 10px 10px 10px 10px;
        border-style: solid;
        border-width: 1px;
        border-color: green;
        border-radius: 10px;
    }

</style>
<jsp:useBean id="user" class="DAO.userDAO"/>
<jsp:useBean id="orderC" class="DAO.orderDAO"/>
</head>

<body>
    <c:set var="order" value="${orderC.getOrder(param.id)}"/> 
    <form action="order.jsp" class="l" onclick="submit()" >
        <input name="id" value="${order.id}" hidden />
        <!--        <div class="col-xs-4">
                    <div id="map"></div>
                </div>-->
        <div class="col-xs-12">
            <center class="input-group2 input-group-icon">
                <a href="profile.jsp?uid=${order.uid}" class="btn btn-success">Owner : ${order.uid}</a>
                <a href="profile.jsp?uid=${order.shipid}" class="btn btn-${empty order.shipid ? "danger"  : "info"}">Shipper : ${empty order.shipid ? "Not Yet" : order.shipid}</a>
            </center>
            <div class="input-group2 input-group-icon" hidden>
                <input type="text" value="Name : ${order.name} " readonly>
                <div class="input-icon">
                    <i class="fa fa-circle"></i>
                </div>
            </div>
            <div class="input-group2 input-group-icon">
                <input id='startAd' type="text" value="${order.start}" readonly/>
                <div class="input-icon">
                    <i class="fa fa-home"></i>
                </div>
            </div>
            <div class="input-group2 input-group-icon">
                <input id="endAd" type="text" value="${order.dest}" readonly />
                <div class="input-icon">
                    <i class="fa fa-truck"></i>
                </div>
            </div>
            <div class="input-group2 input-group-icon">
                <input class="controls" type="text" value="Price : ${order.price} VND" readonly />
                <div class="input-icon">
                    <i class="fa fa-money"></i>
                </div>
            </div>
            <center>

            </center>
        </div>








    </form>

