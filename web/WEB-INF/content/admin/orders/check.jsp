<%--
  Created by IntelliJ IDEA.
  User: darkh0le
  Date: 2019-05-12
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<html>
<head>
    <title>Get all Order</title>
    <s:head/>
    <sj:head/>
</head>
<body>
<%--<div class="container">--%>
<%--    <div class="row">--%>
<%--        <s:iterator value="pizzaOrderEntityList" var="order">--%>
<%--            <s:form action="fill-order">--%>
<%--                order--%>
<%--                <div class="card" style="width: 15rem;">--%>
<%--&lt;%&ndash;                    <img class="card-img-top" src="<s:property value="#pizza.image" />" alt="Card image cap"/>&ndash;%&gt;--%>
<%--                    <div class="card-body">--%>
<%--                        <h5 class="card-title"><s:property value="#order.name" /></h5>--%>
<%--                        <h6 class="card-subtitle mb-2 text-muted"><s:property value="#order.street" /></h6>--%>
<%--                        <div class="row">--%>
<%--                            <p class="card-text col-6"><b>Size: </b><s:property value="#order.town" /></p></br>--%>
<%--                            <p class="card-text"><b>Price: </b>$<s:property value="#order.city" /></p>--%>
<%--                        </div>--%>
<%--&lt;%&ndash;                        <div class="row">&ndash;%&gt;--%>
<%--&lt;%&ndash;                            <p class="card-text col-6"><b>Size: </b><s:property value="#pizza.sizeTwo" /></p></br>&ndash;%&gt;--%>
<%--&lt;%&ndash;                            <p class="card-text"><b>Price: </b>$<s:property value="#pizza.sizeTwoPrice" /></p>&ndash;%&gt;--%>
<%--&lt;%&ndash;                        </div>&ndash;%&gt;--%>
<%--                            &lt;%&ndash;            <p class="card-text">Size 2:<s:property value="#pizza.sizeTwo" /></p>&ndash;%&gt;--%>
<%--                            &lt;%&ndash;            <p class="card-text">$<s:property value="#pizza.sizeTwoPrice" /></p>&ndash;%&gt;--%>
<%--                            &lt;%&ndash;                    <a href="#" class="card-link">Card link</a>&ndash;%&gt;--%>
<%--                        <s:submit cssClass="btn btn-success card-link" theme="css_xhtml" value="Ordenar"/>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                &lt;%&ndash;                <s:textfield name="selectedPizza" value="%{<s:property value='#pizza.name'/>}" />&ndash;%&gt;--%>
<%--                &lt;%&ndash;                <s:textfield name="selectedPizza" value="14cm"  />&ndash;%&gt;--%>
<%--&lt;%&ndash;                <s:hidden name="selectedPizza" value="%{#pizza.name}"/>&ndash;%&gt;--%>
<%--                &lt;%&ndash;                <s:hidden name="selectedPizza" value="%{#pizza.idPizza}" />&ndash;%&gt;--%>
<%--&lt;%&ndash;                <s:hidden name="sizeOne" value="%{#pizza.sizeOne}" />&ndash;%&gt;--%>
<%--&lt;%&ndash;                <s:hidden name="sizeTwo" value="%{#pizza.sizeTwo}" />&ndash;%&gt;--%>
<%--                &lt;%&ndash;                <s:hidden name="pizzaEntity" value="%{#pizza}" />&ndash;%&gt;--%>
<%--                &lt;%&ndash;                <s:set var="personName" value="person.name"/>&ndash;%&gt;--%>
<%--            </s:form>--%>
<%--        </s:iterator>--%>
<h1><a href="/">HOME</a></h1>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">#Id</th>
                <th scope="col">Pizza</th>
                <th scope="col">Calle</th>
                <th scope="col">Colonia</th>
                <th scope="col">Cantidad</th>
            </tr>
            </thead>
            <tbody>
                <s:iterator value="pizzaOrderEntityList" var="order" >
                    <tr>
<%--                    <s:form action="edit" theme="css_xhtml" cssClass="form">--%>
                        <th scope="row"><s:property value="#order.idPizzaOrder" /></th>
                        <th>
                            <s:property value="#order.street" />
                        </th>
                        <th>
                            <s:property value="#order.town" />
                        </th>
                        <th>
                            <s:property value="#order.city" />
                        </th>
                        <th>
<%--                            <s:url action="delete.action" >--%>
<%--                                <s:param name="id"><s:property value="#order.idPizzaOrder" /></s:param>--%>
<%--                            </s:url>--%>
                        <s:url action="delete" var="urlTag" >
                            <s:param name="id"><s:property value="#order.idPizzaOrder" /></s:param>
                        </s:url>
                        <a href="<s:property value="#urlTag" />" >delete</a>
                        <s:url action="edit" var="urlTag" >
                            <s:param name="id"><s:property value="#order.idPizzaOrder" /></s:param>
                        </s:url>
                        <a href="<s:property value="#urlTag" />" >edit</a>
                        </th>
<%--                    </s:form>--%>
                    </tr>
                </s:iterator>
            </tbody>
        </table>
    </div>
</div>
</body>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="${pageContext.request.contextPath}/css/order/style.css" rel="stylesheet" type="text/css"/>
</html>
