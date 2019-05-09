<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<html>
<head>
    <title>Actividad 12</title>
</head>

<body>

<form id="insertForm" action="manage" method="post">
    <label>
        id:
        <input type="text" name="name" value=${param.id} onchange="updateInfo(this)" readonly>
    </label>
    <label>
        Name:
        <input type="text" name="name" value=${param.name} onchange="updateInfo(this)" required>
    </label>
    <label>
        Age:
        <input type="number" min="1" max="150" name="age" value=${param.age} onchange="updateInfo(this)" required>
    </label>
    <label>
        Email:
        <input type="email" name="email" value=${param.email} required>
    </label>
    <input id="employeeInfo" type="hidden" name="employee" value="">
    <input type="hidden" name="operation" value="update">
    <button id="submitButton" type="submit" name="operation" value="insert">Actualizar</button>
</form>
</body>

<script>
    "use strict";

    function updateInfo(e) {
        console.log("Submitting form...");
        var employeeData = ""; //Get input fields

        var formInputsElement = document.querySelectorAll("#insertForm > label > input"); //Get employee input

        var employeeInfoElement = document.getElementById("employeeInfo");
        var id = formInputsElement[0].value;
        var name = formInputsElement[1].value;
        var age = formInputsElement[2].value;
        var email = formInputsElement[3].value;
        employeeData = "{id:".concat(id, ",name:'").concat(name, "',age:").concat(age, ",email:").concat(email, "}");
        // employeeData = "{name:".concat(name, ",age:").concat(age, ",email:").concat(email, "}");
        employeeInfoElement.value = employeeData;
        console.log(employeeInfoElement.value); // formButton.value = "insert";

        // document.getElementById("insertForm").submit();
    }
    //
    // (function() {
    //     let employeeInfoElement = document.getElementById("employeeInfo");
    //     let info = JSON.stringify(employeeInfoElement);
    //     console.log(info);
    //
    // })();

</script>
</html>