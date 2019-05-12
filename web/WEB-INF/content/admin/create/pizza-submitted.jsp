<%--
  Created by IntelliJ IDEA.
  User: darkh0le
  Date: 2019-05-11
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
    <title>New Pizza</title>
    <s:head/>
    <sj:head/>
</head>
<body>
<div class="container">
<h1>Pizza Added</h1>
</div>
<%--<s:iterator value="allPizzas" var="pizza">--%>
<%--    <br/>--%>
<%--    ...  <s:property value="#pizza.name" /><br/>--%>
<%--    ...  <s:property value="#pizza.ingirdients" /><br/>--%>
<%--    ...  <s:property value="#pizza.sizeOne" /><br/>--%>
<%--    ...  <s:property value="#pizza.sizeOnePrice" /><br/>--%>
<%--    ...  <s:property value="#pizza.sizeTwo" /><br/>--%>
<%--    ...  <s:property value="#pizza.sizeTwoPrice" /><br/>--%>
<%--    ...  <s:property value="#pizza.image" /><br/>--%>
<%--</s:iterator>--%>

<%--<h1>Grid</h1>--%>
</body>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="${pageContext.request.contextPath}/css/order/style.css" rel="stylesheet" type="text/css"/>
</html>