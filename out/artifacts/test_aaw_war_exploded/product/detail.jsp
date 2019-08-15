<%--
  Created by IntelliJ IDEA.
  User: Le Hoang Anh
  Date: 8/15/2019
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Product Detail</title>
</head>
<body>
<h1>Product Detail</h1>
<div>Name <s:property value="product.name"/></div>
<div>Address <s:property value="product.address"/></div>
<div>Phone <s:property value="product.phone_No"/></div>

</body>
</html>