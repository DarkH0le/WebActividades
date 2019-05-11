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


</body>
</html>
