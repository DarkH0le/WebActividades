<%--
  Created by IntelliJ IDEA.
  User: darkh0le
  Date: 2019-05-09
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Beer Selection</title>
</head>
<body>
<h1>Pagina de seleccion de cervezas Mexicanas!</h1>
<p>Selecciona la caracteristica de la cerveza</p>
<s:form>
    <s:select list="beerTypes" name="enteredBeer"/>
    <s:submit value="Enter"/>
</s:form>
<s:if test="%{!enteredBeer.isEmpty()}">
    <h2>Recomendaciones: <s:property value="suggestions"/></h2>
</s:if>
</body>
</html>
