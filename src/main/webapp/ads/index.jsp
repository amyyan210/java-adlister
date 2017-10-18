<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: amyyan210
  Date: 10/18/17
  Time: 12:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
    <%@include file="/partials/head.jsp"%>
    <%@include file="/partials/navbar.jsp"%>
</head>
<body>

<ul>
<c:forEach var="ad" items="${ads}">
    <div class="media">
        <div class="media-left">
            <a href="#">
                <img class="media-object" src="http://via.placeholder.com/100x100" alt="Random pic">
            </a>
        </div>
        <div class="media-body">
            <h4 class="media-heading">${ad.title}</h4>
                ${ad.description}
        </div>
    </div>

</c:forEach>
</ul>

</body>
</html>
