<%-- 
    Document   : header
    Created on : Jul 22, 2018, 11:51:33 PM
    Author     : qwert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAqyjobZKV_bef9qMkQw69brKBHJO8Xtho&libraries=places"
        type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href=
              "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
        <link rel="stylesheet" href="bootstrap.min.css">
        <script type="text/javascript" src="bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="project.css">
    </head>

    <body>

        <!-- header -->
        <div class="container mainbar">
            <div class="container">
                <div style="margin: 5% 0% 0% 80%; ">
                    <c:if test="${loggedin}">
                        <a href="profile.jsp?uid=${sessionScope.user.username}" class="btn btn-success" >${sessionScope.user.name}</a>
                        <a href="logout" class="btn btn-danger">
                            Log Out</a>
                        </c:if>
                        <c:if test="${not loggedin}">
                        <a href="login.jsp" class="btn btn-success">Sign In</a>
                        <a href="register.jsp" class="btn btn-info">Sign Up</a>  
                    </c:if>
                </div>
                <div class="">
                    <div class="logo">
                        <a href="home.jsp">
                            <img style="width: 500px; height: 100px;" class="img-responsive" src="media/logo.png" alt="Logo">
                        </a>
                    </div>


                </div>
            </div>
        </div>

        <div class="menubar container-fluid">
            <nav class="navbar">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="home.jsp" class="nav-link" > 
                            <span class="fa fa-home"> </span>Home 
                        </a>
                    </li>
                    <li>
                        <a href="neworder.jsp" class="nav-link" > 
                            <span class="fa fa-truck"> </span>Create New Order
                        </a>
                    </li>
                    <li class="nav-item dropdown">
                        <a href="orders.jsp?page=0" class="nav-link dropbtn"> 
                            <span class="fa fa-archive"> </span>Orders
                        </a>
                        <ul class="dropdown-content">
                            <c:if test="${not empty loggedin}">
                                <li>

                                    <a href="orders.jsp?page=0&uid=${sessionScope.user.username}">
                                        <span class="fa fa-star"></span>
                                        Created Order
                                    </a>

                                </li>
                                <li>
                                    <a href="orders.jsp?page=0&shipid=${sessionScope.user.username}">
                                        <span class="fa fa-key"></span>
                                        Taked Order
                                    </a>
                                </li>
                            </c:if>
                        </ul>
                    </li>
                    <li>
                        <a href="profile.jsp?uid=${sessionScope.user.username}" class="nav-link dropbtn" >
                            <span class="fa fa-user"></span>
                            Profile
                        </a>

                    </li>
                </ul>
                <form class="navbar-form navbar-left" action="order.jsp">
                    <div class="input-group form-group">
                        <input type="text" name="id" class="form-control" placeholder="Enter your order ID">
                        <div class="input-group-btn">
                            <button type="submit" class="btn btn-info fa fa-search"></button>
                        </div>
                    </div>

                </form>
            </nav>
        </div>
        <!--<hr style="color :orangered ; font-family : Arial">-->
    </body>

</html>