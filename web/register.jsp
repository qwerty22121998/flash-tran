<%-- 
    Document   : register
    Created on : Jul 24, 2018, 7:55:04 AM
    Author     : qwert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Register Page</title>
        <jsp:include page="header.jsp"/>
    </head>
    <body>
        <c:if test="${loggedin}">
            <c:redirect url="home.jsp"/>
        </c:if>
        <div class="container1">
            <form action="register" method="post">
                <div class="row1">
                    <h4 class="testsign">Account Register</h4>
                    <font color="red">${param.error}</font>
                    <div class="input-group input-group-icon">
                        <input name="uid" type="text" placeholder="User Name" />
                        <div class="input-icon">
                            <i class="fa fa-star"></i>
                        </div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input name="full-name" type="text" placeholder="Full Name" />
                        <div class="input-icon">
                            <i class="fa fa-user"></i>
                        </div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input name="email" type="email" placeholder="Email Adress" />
                        <div class="input-icon">
                            <i class="fa fa-envelope"></i>
                        </div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input name="pwd" type="password" placeholder="Password" />
                        <div class="input-icon">
                            <i class="fa fa-key"></i>
                        </div>
                    </div>

                    <!--                    <div class="input-group input-group-icon">
                                            <input name="repwd" type="password" placeholder="Repeat Password" />
                                            <div class="input-icon">
                                                <i class="fa fa-key"></i>
                                            </div>
                                        </div>-->
                </div>
                <div class="row1">
                    <div>
                        <h4 class="testsign"> Date of Birth</h4>
                        <div class="input-group">
                            <div class="col-third">
                                <input name="dob" type="date" />
                            </div>
                        </div>
                    </div>
                    <div style=" width: 60%;">
                        <h4 class="testsign">Gender</h4>
                        <div class="input-group">
                            <input type="radio" name="gender" value="male" id="gender-male" checked/>
                            <label for="gender-male">Male</label>
                            <input type="radio" name="gender" value="female" id="gender-female" />
                            <label for="gender-female">Female</label>
                        </div>
                    </div>
                </div>
                <div class="row1">
                    <h4 class="testsign">Contact Information</h4>
                    <div class="input-group input-group-icon">
                        <input name="phone" type="number" placeholder="Phone" />
                        <div class="input-icon">
                            <i class="fa fa-phone"></i>
                        </div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input name="address" type="text" placeholder="Adress" />
                        <div class="input-icon">
                            <i class="fa fa-home"></i>
                        </div>
                    </div>
                    <div class="input-group input-group-icon">
                        <input name="desc" class="file" type="text" placeholder="Description" />
                        <div class="input-icon2">
                            <i class="fa fa-file-text"></i>
                        </div>
                    </div>
                </div>

                <div align="center"> 
                    <input type="submit" class="btn btn-success" value="Confirm"/>
                </div>


            </form>

        </div>
    </body>
    <footer>
        <jsp:include page="footer.jsp"/>
    </footer>
</html>
