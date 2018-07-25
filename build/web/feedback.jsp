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
        <title>Feedback - FlashTrans</title>
        <jsp:include page="header.jsp"/>
        <style scoped>
            .container2 {
                height: 20em;
            }
        </style>

    </head>
    <body>
        <c:if test="${not loggedin}">
            <c:redirect url="login.jsp"/>
        </c:if>
        <div class="container2">
            <form action="feedback" method="post">
                <h1 class="green"> FeedBack </h1>
                <div class="col-xs-12">
                    <div class="input-group2 input-group-icon">
                        <input type="text" name="uid" value="${sessionScope.user.username}" placeholder="Owner " readonly>
                        <div class="input-icon">
                            <i class="fa fa-envelope"></i>
                        </div>
                    </div>
                    <div class="input-group2 input-group-icon">
                        <input class="file" type="textarea" name="feedback" placeholder="Your Feedback" />
                        <div class="input-icon2">
                            <i class="fa fa-file-text"></i>
                        </div>
                    </div>
                    <center>
                        <input type="submit" class="btn btn-success" value="Submit Feedback"/>
                    </center>
                </div>


            </form>

        </div>

    </body>
    <footer>
        <jsp:include page="footer.jsp"/>
    </footer>
</html>
