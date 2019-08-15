<%--
  Created by IntelliJ IDEA.
  User: Le Hoang Anh
  Date: 8/15/2019
  Time: 8:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>From Customer</title>
</head>
<body>
<s:form action="create">
    <div>Name <s:textfield name="product.name" /></div>
    <div>Address <s:textfield name="product.address" /></div>
    <div>Phone <s:textfield name="product.phone_No" /></div>
    <s:submit value="Save"/>
</s:form>
</body>
</html>

