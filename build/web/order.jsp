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
                background-color: white;
                border-style: solid;
                border-color: graytext;
            }
            .green {
                color: green
            }

        </style>
        <jsp:useBean id="user" class="DAO.userDAO"/>
        <jsp:useBean id="orderC" class="DAO.orderDAO"/>
    </head>
    <body>
        <c:set var="order" value="${orderC.getOrder(param.id)}"/> 
        <c:if test="${not empty order}">
            <div class="container2">
                <form action="orderMan" method="post">
                    <h2 class="green"> Order <input type="text" name="oid" class="btn btn-success" href="#" value="${order.id}" style="width: auto" readonly></input> Information </h2>

                    <div class="col-xs-5">
                        <div id="map"></div>
                    </div>
                    <div class="col-xs-7">
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
                            <input class="controls" type="text" value="Price : ${order.price} VND" readonly />
                            <div class="input-icon">
                                <i class="fa fa-money"></i>
                            </div>
                        </div>
                        <div class="input-group2 input-group-icon">
                            <input type="text" value="Start Date" style="width :40%"  readonly/>
                            <input value="${order.startDate}" type="date" style="width : 58%" readonly/>
                            <div class="input-icon">
                                <i class="fa fa-calendar-check-o"></i>
                            </div>
                        </div>
                        <div class="input-group2 input-group-icon">

                            <input type="text" value="Expired Date" style="width :40%"  readonly/>
                            <input  type="text" value="${order.expiredDate}"  style="width : 58%"readonly/>
                            <div class="input-icon">
                                <i class="fa fa-calendar-times-o"></i>
                            </div>

                        </div>
                        <div class="input-group2 input-group-icon">
                            <input type="text" value="Receiver Name : ${order.rName}" placeholder="Reciver Name" />
                            <div class="input-icon">
                                <i class="fa fa-user"></i>
                            </div>
                        </div>
                        <div class="input-group2 input-group-icon">
                            <input type="text" value="Phone Number : ${order.rPhone}" />
                            <div class="input-icon">
                                <i class="fa fa-phone"></i>
                            </div>
                        </div>
                        <div class="input-group2 input-group-icon">
                            <input class="file" type="text" value="${order.desc}" />
                            <div class="input-icon2">
                                <i class="fa fa-file-text"></i>
                            </div>
                        </div>


                        <center>
                            <c:if test="${not empty sessionScope.user && sessionScope.user.username != order.uid && sessionScope.user.username != order.shipid}">
                                <input type="submit" name="accept" class="btn btn-success" value="Accept Order"/>
                            </c:if>
                            <c:if test="${not empty sessionScope.user && sessionScope.user.username != order.uid && sessionScope.user.username == order.shipid}">
                                <input type="submit" name="supsend" class="btn btn-warning" value="Supsend Order"/>
                            </c:if>
                            <c:if test="${not empty sessionScope.user && sessionScope.user.username == order.uid}">
                                <input type="submit" name="delete" class="btn btn-danger" value="Delete Order"></a>
                            </c:if>
                        </center>
                    </div>




                </form>


            </div>
            <script src="script/loadItemToMap.js"></script>
            <script>
                $(document).ready(() => {
                    loadItemToMap('map', 'startAd', 'endAd', false);
                })

            </script>   
        </c:if>
        <c:if test="${empty order}">
            <div class="container1">
                <div class="row1">
                    <div class="input-group input-group-icon">
                        <input style="color:red" name="uid" type="text" value='Order number "${param.id}" not found!' readonly />
                        <div class="input-icon">
                            <i class="fa fa-star"></i>
                        </div>
                    </div>
                </div>
            </div>

        </c:if>
    </body>
    <footer>
        <jsp:include page="footer.jsp"/>
    </footer>
</html>
