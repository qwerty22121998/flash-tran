<%-- 
    Document   : register
    Created on : Jul 24, 2018, 7:55:04 AM
    Author     : qwert
--%>

<%@page import="DAO.userDAO"%>
<%@page import="Entity.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Profile - ${param.uid}</title>
        <jsp:include page="header.jsp"/>
        <jsp:useBean id="user" class="DAO.userDAO"/>
    </head>
    <body>
        <c:if test="${not loggedin}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <!--${currentUser = user.getUser(param.uid)}-->
        <!--${currentUser.username}-->
        <c:set var="currentUser" value="${user.getUser(param.uid)}"></c:set>

            <div class="container1">
            <c:if test="${empty currentUser}">
                <div class="row1">
                    <div class="input-group input-group-icon">
                        <input style="color:red" name="uid" type="text" value='User "${param.uid}" not found!' readonly />
                        <div class="input-icon">
                            <i class="fa fa-star"></i>
                        </div>
                    </div>
                </div>
            </c:if>
            <c:if test="${not empty currentUser}">
                <div class="row1">
                    <h4 class="testsign">Account Information</h4>
                    <font color="red">${param.error}</font>

                    <div class="input-group input-group-icon">
                        <input name="uid" type="text" value="Username : ${user.getUser(param.uid).username}" readonly />
                        <div class="input-icon">
                            <i class="fa fa-star"></i>
                        </div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input name="full-name" type="text" value="Full Name : ${user.getUser(param.uid).name}" readonly />
                        <div class="input-icon">
                            <i class="fa fa-user"></i>
                        </div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input name="email" type="email" value="Email : ${user.getUser(param.uid).email}" readonly />
                        <div class="input-icon">
                            <i class="fa fa-envelope"></i>
                        </div>
                    </div>

                </div>
                <div class="row1">
                    <div>
                        <h4 class="testsign"> Date of Birth</h4>
                        <div class="input-group">
                            <div class="col-third">
                                <input name="dob" type="date" value="${user.getUser(param.uid).dob}" />
                            </div>
                        </div>
                    </div>
                    <div style=" width: 60%;">
                        <h4 class="testsign">Gender</h4>
                        <div class="input-group" readonly>
                            <input type="radio" name="gender" checked readonly/>
                            <label for="gender-male">${user.getUser(param.uid).male ? "Male" : "Female"}</label>

                        </div>
                    </div>
                </div>
                <div class="row1">
                    <h4 class="testsign">Contact Information</h4>
                    <div class="input-group input-group-icon">
                        <input name="phone" type="number" value="${user.getUser(param.uid).phone}" readonly />
                        <div class="input-icon">
                            <i class="fa fa-phone"></i>
                        </div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input name="address" type="text" value="${user.getUser(param.uid).address}" readonly/>
                        <div class="input-icon">
                            <i class="fa fa-home"></i>
                        </div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input name="desc" class="file" type="text" value="${user.getUser(param.uid).desc}" readonly/>
                        <div class="input-icon2">
                            <i class="fa fa-file-text"></i>
                        </div>
                    </div>
                </div>
            </c:if>
        </div>
    </body>
    <footer>
        <jsp:include page="footer.jsp"/>
    </footer>
</html>
