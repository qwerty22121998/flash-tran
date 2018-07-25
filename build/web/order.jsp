<%-- 
    Document   : neworder
    Created on : Jul 23, 2018, 12:33:08 AM
    Author     : qwert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create New Order</title>
        <jsp:include page="header.jsp"/>
        <style scoped>
            #map {
                width: 100%;
                height: 400px;
                background-color: grey;
            }
            .green {
                color: green
            }

        </style>
        <jsp:useBean id="user" class="DAO.userDAO"/>
        <jsp:useBean id="orderC" class="DAO.orderDAO"/>
    </head>
    <body>
        <c:if test="${not loggedin}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <c:set var="order" value="${orderC.getOrder(param.id)}"/> 
        <div class="container2">
            <form action="neworder">
                <h1 class="green"> Create New Orders </h1>

                <div class="xdiv1">
                    <div id="map"></div>
                </div>
                <div class="xdiv2">
                    <center class="input-group2 input-group-icon">
                        <a href="profile.jsp?uid=${order.uid}" class="btn btn-success">Owner : ${order.uid}</a>
                        <a href="profile.jsp?uid=${order.shipid}" class="btn btn-${empty order.shipid ? "danger" : "info"}">Shipper : ${empty order.shipid ? "Not Yet" : order.shipid}</a>
                    </center>
                    <div class="input-group2 input-group-icon">
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
                        <input id="endAd" type="text" value="${order.dest}" readonly/>
                        <div class="input-icon">
                            <i class="fa fa-truck"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input name="price" class="controls" type="text" value="Price : ${order.price} VND" readonly />
                        <div class="input-icon">
                            <i class="fa fa-money"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input type="text" value="Start Date" style="width: 40%" readonly/>
                        <input id="start-date" value="${order.startDate}" type="date" style="width: 59%" readonly/>
                        <div class="input-icon">
                            <i class="fa fa-calendar-check-o"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input type="text" value="Expired Date" style="width: 40%" readonly/>
                        <input type="date" value=${order.expiredDate} style="width: 59%" readonly/>
                        <div class="input-icon">
                            <i class="fa fa-calendar-times-o"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input type="text" name="rName" placeholder="Reciver Name" />
                        <div class="input-icon">
                            <i class="fa fa-user"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input type="number" name="rPhone" placeholder="Reciver Phone Number" />
                        <div class="input-icon">
                            <i class="fa fa-phone"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input class="file" type="text" name="desc" placeholder="Description" />
                        <div class="input-icon2">
                            <i class="fa fa-file-text"></i>
                        </div>
                    </div>
                    <center>
                        <!--<input type="submit" class="btn btn-success" value="Add new order"/>-->
                        <!--<button style="width: 100px;" type="button" class="btn btn-success1">Add Orders</button>-->
                    </center>
                </div>


            </form>

        </div>
        <script src="script/loadItemToMap.js"></script>
        <script>
            $(document).ready(() => {
                loadItemToMap('map', 'startAd', 'endAd');
            })

        </script>   
    </body>
    <footer>
        <jsp:include page="footer.jsp"/>
    </footer>
</html>
