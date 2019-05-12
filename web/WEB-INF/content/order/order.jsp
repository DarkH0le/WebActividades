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
    <title>Get Order</title>
    <s:head/>
    <sj:head/>
</head>
<body>
<div class="container">
    <div class="row">
        <s:iterator value="allPizzas" var="pizza">
            <s:form action="fillOrder">
            <div class="card" style="width: 18rem;">
                <img class="card-img-top" src="<s:property value="#pizza.image" />" alt="Card image cap"/>
                <div class="card-body">
                    <h5 class="card-title"><s:property value="#pizza.name" /></h5>
                    <h6 class="card-subtitle mb-2 text-muted"><s:property value="#pizza.ingirdients" /></h6>
                    <div class="row">
                        <p class="card-text col-6">Size 1:<s:property value="#pizza.sizeOne" /></p>
                        <p class="card-text">$<s:property value="#pizza.sizeOnePrice" /></p>
                    </div>
                    <div class="row">
                        <p class="card-text col-6">Size 1:<s:property value="#pizza.sizeTwo" /></p>
                        <p class="card-text">$<s:property value="#pizza.sizeTwoPrice" /></p>
                    </div>
                        <%--            <p class="card-text">Size 2:<s:property value="#pizza.sizeTwo" /></p>--%>
                        <%--            <p class="card-text">$<s:property value="#pizza.sizeTwoPrice" /></p>--%>
<%--                    <a href="#" class="card-link">Card link</a>--%>
                    <s:submit cssClass="btn btn-success card-link" theme="css_xhtml" value="Ordenar"/>
                </div>
            </div>
            </s:form>
        </s:iterator>

    </div>
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