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
<h1>Grid</h1>

<s:iterator value="allPizzas" status="stat">

    <%--    <span>Name <s:property value="%{#stat.index}" /> info: </span>--%>
    <label>Nombre: </label>
    <s:textfield name="allPizzas[%{#stat.index}].name" />
    <br/>
    <label>Ingredientes: </label>
    <s:textfield name="allPizzas[%{#stat.index}].ingirdients" />
    <br/>
    <label>Tamaños: </label>
    <s:textfield name="allPizzas[%{#stat.index}].ingirdients" />
    <br/>
    <label>Precios: </label>
    <s:textfield name="allPizzas[%{#stat.index}].ingirdients" />
    <br/>

</s:iterator>
</body>
</html>
