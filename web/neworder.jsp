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

    </head>
    <body>
        <c:if test="${not loggedin}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <div class="container2">
            <form action="neworder">
                <h1 class="green"> Create New Orders </h1>

                <div class="col-xs-5">
                    <div id="map"></div>
                </div>
                <div class="col-xs-7">
                    <div class="input-group2 input-group-icon">
                        <input type="text" name="uid" value="${sessionScope.user.username}" placeholder="Owner " readonly>
                        <div class="input-icon">
                            <i class="fa fa-envelope"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input type="text" name="name" placeholder="Orders Name" >
                        <div class="input-icon">
                            <i class="fa fa-circle"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input id='startAd' name="start" type="text" placeholder="Start Address" />
                        <div class="input-icon">
                            <i class="fa fa-home"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input id="endAd" name="dest" class="controls" type="text" placeholder="Destination Address" />
                        <div class="input-icon">
                            <i class="fa fa-truck"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input name="price" class="controls" type="number" placeholder="Price (VND)" />
                        <div class="input-icon">
                            <i class="fa fa-money"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input type="text" value="Start Date" style="width: 40%" readonly="true"/>
                        <input id="start-date" name="start-date" type="date" style="width: 59%" readonly/>
                        <div class="input-icon">
                            <i class="fa fa-calendar-check-o"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input type="text" value="Expired Date" style="width: 40%" readonly="true"/>
                        <input type="date" id="expired-date" name="expired-date" style="width: 59%" />
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
                        <input type="submit" class="btn btn-success" value="Add new order"/>
                        <!--<button style="width: 100px;" type="button" class="btn btn-success1">Add Orders</button>-->
                    </center>
                </div>


            </form>

        </div>
        <script src="script/loadItemToMap.js"></script>
        <script>
            Date.prototype.toDateInputValue = (function () {
                var local = new Date(this);
                local.setMinutes(this.getMinutes() - this.getTimezoneOffset());
                return local.toJSON().slice(0, 10);
            });
            $(document).ready(() => {
                loadItemToMap('map', 'startAd', 'endAd', true);
                $("#start-date").val(new Date().toDateInputValue());
                $("#expired-date").val(new Date().toDateInputValue());
            })

        </script>   
    </body>
    <footer>
        <jsp:include page="footer.jsp"/>
    </footer>
</html>
