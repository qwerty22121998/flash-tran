<%-- 
    Document   : login
    Created on : Jul 23, 2018, 12:07:01 AM
    Author     : qwert
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <jsp:include page="header.jsp"/>
    </head>
    <body>
        <c:if test="${loggedin}">
            <c:redirect url="home.jsp"/>
        </c:if>
        <c:if test="${not loggedin}">
            <form action="login" method="post">
                <div class="container1" style="margin-top: 2%; margin-bottom: 5%; margin-left: 30%">
                    <h1 class="testsign">Please Login</h1>
                    <c:if test="${not empty param.error}">
                        <font color="red">Wrong username or password!</font>
                    </c:if>
                    <div class="row1" style="width: 70%;">
                        <div class="input-group input-group-icon">
                            <input type="text" name="uid" placeholder="User Name" />
                            <div class="input-icon">
                                <i class="fa fa-user"></i>
                            </div>
                        </div>
                    </div>
                    <div class="row1" style="width: 70%;">
                        <div class="input-group input-group-icon">
                            <input type="password" name="pwd" placeholder="Password" />
                            <div class="input-icon">
                                <i class="fa fa-key"></i>
                            </div>
                        </div>
                    </div>
                    <div>
                        <input type="submit" class="btn btn-success1" name="Log In"/>
                    </div>



                    <div class="row1" style="margin-top: 5%">
                        <div class="col-half testsign" disable>Forgot your password?</div>
                        <div class="col-half testsign">Don't have an account?
                            <a href="register.jsp"> Sign Up!</a>
                        </div>
                    </div>

                </div>
            </form>
        </c:if>

    </body> 
    <footer>
        <jsp:include page="footer.jsp"/>
    </footer>
</html>
