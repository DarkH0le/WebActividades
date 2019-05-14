<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: darkh0le
  Date: 2019-05-12
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <s:head/>
    <title>Edit</title>
    <style>

    </style>
</head>
<body>
<div class="container center">
    <div class="row">
        <div class="col">
            <s:form cssClass="form" action="edit-submit" theme="css_xhtml">
                <%--    <div class="form-group">--%>
                <%--        <label for="fName">id</label>--%>
                <%--            <input type="text" class="form-control" id="formGroupExampleInput" placeholder="">--%>
                <%--            <s:textfield name="pizzaOrderEntity.name" theme="css_xhtml" id="fName"/>--%>
                <s:textfield name="pizzaOrderEntity.idPizzaOrder" id="id" type="hidden"/>
                <%--    </div>--%>
                <div class="form-group">
                        <%--            <input type="text" class="form-control" id="formGroupExampleInput" placeholder="">--%>
                        <%--            <s:textfield name="pizzaOrderEntity.name" theme="css_xhtml" id="fName"/>--%>
                    <s:property value="pizzaOrderEntity.pizzaType"/>
                </div>
                <div class="form-group">
                    <label for="fName">Nombre</label>
                        <%--            <input type="text" class="form-control" id="formGroupExampleInput" placeholder="">--%>
                        <%--            <s:textfield name="pizzaOrderEntity.name" theme="css_xhtml" id="fName"/>--%>
                    <s:textfield name="pizzaOrderEntity.name" id="fName"/>
                </div>
                <div class="form-group">
                    <label for="fCalle">Calle</label>
                        <%--            <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="">--%>
                    <s:textfield id="fCalle" name="pizzaOrderEntity.street" theme="css_xhtml"/>
                </div>
                <div class="form-group">
                    <label for="fCalle">Colonia</label>
                        <%--            <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="">--%>
                    <s:textfield id="fColonia" name="pizzaOrderEntity.town" theme="css_xhtml"/>
                </div>
                <div class="form-group">
                    <label for="fCiudad">Ciudad</label>
                        <%--            <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="">--%>
                    <s:textfield id="fCiudad" name="pizzaOrderEntity.city" theme="css_xhtml"/>
                </div>
                <div class="form-group">
                    <label for="fCalle">Telefono</label>
                        <%--            <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="">--%>
                    <s:textfield id="fTelefono" name="pizzaOrderEntity.phone" theme="css_xhtml" type="number"/>
                </div>
                <div class="form-group">
                    <label for="fTamano">Tamano</label>
                        <%--            <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="">--%>
                        <%--            <s:textfield id="fTamano" name="pizzaOrderEntity.size" theme="css_xhtml"/>--%>
                    <s:textfield name="pizzaOrderEntity.size" id="fTamano"/>
                </div>
                <div class="form-group">
                    <label for="fCantidad">Cantidad</label>
                        <%--            <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="">--%>
                    <s:textfield id="fCantidad" name="pizzaOrderEntity.amout" theme="css_xhtml" type="number"/>
                </div>
                <%--        <input type="hidden" name="selectedPizza" value="testttt" id="registerUser_username"/>--%>
                <%--        <s:textfield name="selectedPizza" value="testttt"/>--%>
                <%--    <s:param name="id"><s:property value="#pizzaOrderEntity.idPizzaOrder" /></s:param>--%>
                <s:hidden name="sizeOne" value="pizzaOrderEntity.idPizzaOrder" />
                <s:submit cssClass="btn btn-success" theme="css_xhtml" value="Completar"/>
            </s:form>
        </div>
        <div class="card m-1" style="width: 15rem;">
            <img class="card-img-top" src="<s:property value="pizzaOrderEntity.image" />" alt="Card image cap"/>
            <div class="card-body">
                <h5 class="card-title"><s:property value="#pizza.name" /></h5>
                <h6 class="card-subtitle mb-2 text-muted"><s:property value="pizzaOrderEntity.ingirdients" /></h6>
                <div class="row">
                    <p class="card-text col-6"><b>Size: </b><s:property value="pizzaOrderEntity.sizeOne" /></p></br>
                    <p class="card-text"><b>Price: </b>$<s:property value="pizzaOrderEntity.sizeOnePrice" /></p>
                </div>
                <div class="row">
                    <p class="card-text col-6"><b>Size: </b><s:property value="pizzaOrderEntity.sizeTwo" /></p></br>
                    <p class="card-text"><b>Price: </b>$<s:property value="pizzaOrderEntity.sizeTwoPrice" /></p>
                </div>
                <%--            <p class="card-text">Size 2:<s:property value="#pizza.sizeTwo" /></p>--%>
                <%--            <p class="card-text">$<s:property value="#pizza.sizeTwoPrice" /></p>--%>
                <%--                    <a href="#" class="card-link">Card link</a>--%>
            </div>
        </div>
    </div>
</div>
</body>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="${pageContext.request.contextPath}/css/order/style.css" rel="stylesheet" type="text/css"/>
</html>
