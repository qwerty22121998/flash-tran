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
        <title>Home - FlashTrans</title>
        <jsp:include page="header.jsp"/>

    </head>
    <body>

        <div class="container1">
            <div class="input-group2 input-group-icon">
                <input type="text" value="Some error happened. Try again later!" style="color: red" readonly/>
                <div class="input-icon">
                    <i class="fa fa-star"></i>
                </div>
            </div>
        </div>

    </body>
    <footer>


        <jsp:include page="footer.jsp"/>
    </footer>
</html>
