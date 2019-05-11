<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<html>
<head>
    <title>Actividad 12</title>
</head>

<body>

<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
                   url = "jdbc:mysql://localhost/EmployeeRepo?serverTimezone=EST5EDT"
                   user = "root"  password = "Beatles_77b"/>

<sql:query dataSource = "${snapshot}" var = "result">
    SELECT * from Employee;
</sql:query>
<table border = "1" width = "100%">
    <tr>
        <th>Emp ID</th>
        <th>Nombre</th>
        <th>Edad</th>
        <th>Email</th>
    </tr>
    <c:forEach var = "row" items = "${result.rows}">
        <tr>
            <td><c:out value = "${row.id}"/></td>
            <td contenteditable><c:out value = "${row.name}"/></td>
            <td contenteditable><c:out value = "${row.age}"/></td>
            <td contenteditable><c:out value = "${row.email}"/></td>
            <td>
                <form action="manage" method="post">
                    <input type="hidden" name="employee" value="{id:${row.id},name:${row.name},age:${row.age},email:${row.email}}">

                    <button type="submit" name="operation" value="delete">Delete</button>
                    <button type="button" value="update" onclick="submitEdit(this);">Edit</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<form id="insertForm" action="manage" method="post">
    <label>
        Name:
        <input type="text" name="name" onchange="updateEmployeeInfo(this)" required>
    </label>
    <label>
        Age:
        <input type="number" min="1" max="150" name="age" onchange="updateEmployeeInfo(this)" required>
    </label>
    <label>
        Email:
        <input type="email" name="email"  onchange="updateEmployeeInfo(this)" required>
    </label>
    <input id="employeeInfo" type="hidden" name="employee" value="">
    <input type="hidden" name="operation" value="insert">
    <button id="submitButton" type="submit" name="operation" value="insert">Agregar</button>
</form>
</body>

<script>
    "use strict";

    function updateEmployeeInfo(e) {
        console.log("Submitting form...");
        var employeeData = ""; //Get input fields

        var formInputsElement = document.querySelectorAll("#insertForm > label > input"); //Get employee input

        var employeeInfoElement = document.getElementById("employeeInfo");
        var name = formInputsElement[0].value;
        var age = formInputsElement[1].value;
        var email = formInputsElement[2].value;
        employeeData = "{name:'".concat(name, "',age:").concat(age, ",email:").concat(email, "}");
        employeeInfoElement.value = employeeData;
        console.log(employeeInfoElement.value); // formButton.value = "insert";

        // document.getElementById("insertForm").submit();
    }

    function submitEdit(element) {
        console.log("Editing form...");

        console.log(element.parentElement.parentElement);

        let elementToEdit = element.parentElement;
        let employeeInfo = elementToEdit[0].value;
        employeeInfo = employeeInfo.replace(/,/g, '&').replace(/:/g, '=').replace("{","").replace("}","");
        window.location = "/Actividades_war_exploded/EditEmployee.jsp?" + employeeInfo;
        // document.getElementById("insertForm").submit();
    }

</script>
</html>