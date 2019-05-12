<%--
  Created by IntelliJ IDEA.
  User: darkh0le
  Date: 2019-05-11
  Time: 16:50
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
    <h1>Grid</h1>

    <s:iterator value="allPizzas" status="stat">

    <%--    <span>Name <s:property value="%{#stat.index}" /> info: </span>--%>

        <label>name: </label>
        <s:textfield name="allPizzas[%{#stat.index}].name" />

        <label>age: </label>
        <s:textfield name="allPizzas[%{#stat.index}].ingirdients" />
        <br/>

    </s:iterator>

    <h1><s:property value="test2" /></h1>
    <div class="card" style="width: 18rem;">
        <%--    <img class="card-img-top" src="%{<s:property value="#pizza.image">}" alt="Card image cap"/>--%>
        <div class="card-body">
        <h5 class="card-title"><s:property value="#pizza.name"/></h5>
        <h6 class="card-subtitle mb-2 text-muted"><s:property value="#pizza.ingirdients" /></h6>
        <p class="card-text">Size 1:<s:property value="#pizza.sizeOne" /></p>
        <p class="card-text">Size 2:<s:property value="#pizza.sizeTwo" /></p>
        <p class="card-text">$<s:property value="#pizza.sizeOnePrice" /></p>
        <p class="card-text">$<s:property value="#pizza.sizeTwoPrice" /></p>
        <a href="#" class="card-link">Card link</a>
        </div>
    </div>

</body>
</html>
