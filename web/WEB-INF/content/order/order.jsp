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
<%--<nav class="navbar sticky-top navbar-light bg-dark orange lighten-1">--%>
<nav class="mb-1 navbar navbar-expand-lg navbar-light orange accent-3 lighten-1" style="background-color: #ff9100;">
    <a class="navbar-brand" href="#">
        <img src="https://image.flaticon.com/icons/svg/267/267875.svg" width="30" height="30" class="d-inline-block align-top" alt="">
        In-n-Eat
    </a>
</nav>

<div class="container-fluid m-2">
    <div class="row justify-content-center">
        <s:iterator value="allPizzas" var="pizza">
            <s:form action="fill-order">
            <div class="card m-1" style="width: 15rem;">
                <img class="card-img-top" src="<s:property value="#pizza.image" />" alt="Card image cap"/>
                <div class="card-body">
                    <h5 class="card-title"><s:property value="#pizza.name" /></h5>
                    <h6 class="card-subtitle mb-2 text-muted"><s:property value="#pizza.ingirdients" /></h6>
                    <div class="row">
                        <p class="card-text col-6"><b>Size: </b><s:property value="#pizza.sizeOne" /></p></br>
                        <p class="card-text"><b>Price: </b>$<s:property value="#pizza.sizeOnePrice" /></p>
                    </div>
                    <div class="row">
                        <p class="card-text col-6"><b>Size: </b><s:property value="#pizza.sizeTwo" /></p></br>
                        <p class="card-text"><b>Price: </b>$<s:property value="#pizza.sizeTwoPrice" /></p>
                    </div>
                        <%--            <p class="card-text">Size 2:<s:property value="#pizza.sizeTwo" /></p>--%>
                        <%--            <p class="card-text">$<s:property value="#pizza.sizeTwoPrice" /></p>--%>
<%--                    <a href="#" class="card-link">Card link</a>--%>
                    <s:submit cssClass="btn btn-success card-link" theme="css_xhtml" value="Ordenar"/>
                </div>
            </div>
<%--                <s:textfield name="selectedPizza" value="%{<s:property value='#pizza.name'/>}" />--%>
<%--                <s:textfield name="selectedPizza" value="14cm"  />--%>
                <s:hidden name="selectedPizza" value="%{#pizza.name}"/>
<%--                <s:hidden name="selectedPizza" value="%{#pizza.idPizza}" />--%>
                <s:hidden name="sizeOne" value="%{#pizza.sizeOne}" />
                <s:hidden name="sizeTwo" value="%{#pizza.sizeTwo}" />
<%--                <s:hidden name="pizzaEntity" value="%{#pizza}" />--%>
                <%--                <s:set var="personName" value="person.name"/>--%>
            </s:form>
        </s:iterator>

    </div>
</div>
</body>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="${pageContext.request.contextPath}/css/order/style.css" rel="stylesheet" type="text/css"/>
</html>