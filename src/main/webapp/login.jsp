<%--
  Created by IntelliJ IDEA.
  User: amyyan210
  Date: 10/17/17
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <title>Login</title>
    <%@include file="partials/styles.jsp"%>
</head>

<body>
<%@ include file="partials/nav-bar.jsp"%>

<h2 class="text-center">Login</h2>

<form method="POST" action="/login.jsp" class="text-center">

    <div class="form-group">
        <label for="username">Username</label>
        <input type="text" class="form-control" id="username" name="username" placeholder="username">
    </div>

    <div class="form-group">
        <label for="password">Password</label>
        <input type="password" class="form-control" id="password" name="password" placeholder="password">
    </div>

    <button type="submit" class="btn btn-primary">Login</button>

</form>


<c:if test="${param.username == 'admin' && param.password == 'password'}" >
   <% response.sendRedirect("profile.jsp"); %>
</c:if>


<%@ include file="partials/scripts.jsp"%>

</body>

</html>
