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
    <script>
        $(document).ready(function () {
            $('#ordersTable').DataTable();
            $('.dataTables_length').addClass('bs-select');
        });
    </script>
</head>
<body>
<nav class="navbar sticky-top navbar-light bg-light">
    <a class="navbar-brand" href="../../order/order">In-N-Out Burger</a>
    <a class="navbar-brand" href="#">Sticky top</a>
    <a class="navbar-brand" href="#">Sticky top</a>
</nav>
<div class="container-fuild m-4">
<%--    <h1 class="center"><a href="/">HOME</a></h1>--%>
    <div class="row">
        <div class="col">
            <table id="ordersTable" class="table table-striped table-bordered col">
                <thead>
                <tr>
                    <th scope="col">#Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Calle</th>
                    <th scope="col">Colonia</th>
                    <th scope="col">city</th>
                    <th scope="col">phone</th>
                    <th scope="col">actions</th>
                </tr>
                </thead>
                <tbody>
                <s:iterator value="pizzaOrderEntityList" var="order" >
                        <tr>
                            <%--                    <s:form action="edit" theme="css_xhtml" cssClass="form">--%>
                        <th scope="row"><s:property value="#order.idPizzaOrder" /></th>
                        <th>
                            <s:property value="#order.name" />
                        </th>
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
                            <s:property value="#order.phone" />
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
</div>
</body>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="${pageContext.request.contextPath}/css/order/style.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.css"/>

<script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.10.18/datatables.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</html>
