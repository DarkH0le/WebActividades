<%--
  Created by IntelliJ IDEA.
  User: darkh0le
  Date: 2019-05-09
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Calcular Masa Corporal</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../styles/style.min(1).css">
</head>

<body>
<main class="main" role="main">

    <h1>Calculadora de indice de masa corporal</h1>
    <section class="section section--centric">
        <div class="container">

            <article id="post-602" class="article">

                <div class="article-elements">

                    <div class="article-elements__content">

                        <div id="cs_control_2946" class="cs_control CS_Element_Textblock">
                            <div class="CS_AlignLeft CS_Textblock_Text">
                                <p id="csPasteInner">Una medida de la obesidad se determina mediante el índice de masa corporal (IMC), que se calcula dividiendo los kilogramos de peso por el cuadrado de la estatura en metros (IMC = peso [kg]/ estatura [m2]). Según el Instituto Nacional del Corazón, los Pulmones y la Sangre de los Estados Unidos (NHLBI), el sobrepeso se define como un IMC de más de 25. Se considera que una persona es obesa si su IMC es superior a 30. Usted puede determinar su IMC con la calculadora que se encuentra a continuación. Con la cifra del IMC puede averiguar su composición corporal en la tabla que aparece debajo de la calculadora.</p>
                            </div>
                        </div>
                        <div class="emph">
                            <p>Para calcular su índice de masa corporal, ingrese su estatura y peso.</p>
                        </div>
                        <s:form>
<%--                                <div class="container">--%>
<%--                                    <div class="row">--%>
<%--                                        <div class="col-4">Estatura en centimetros</div>--%>
                                        <s:textfield name="height"  value="" placeholder="Altura centimetros" />
<%--                                    </div>--%>
<%--                                    <div class="row">--%>
<%--                                        Peso en Kilogramos--%>
                                        <s:textfield name="weight" value="" placeholder="Peso Kilogramos"/>
<%--                                    </div>--%>
<%--                                    <div class="row">--%>
                                            <s:submit value="Enter"/>
<%--                                    </div>--%>
<%--                                </div>--%>
                        </s:form>

                        <s:if test="%{!(result == 0)}">
                            <h4 class="result-label">Resultado:</h4>
                            <h3><s:property value="result"/></h3>
                        </s:if>
                        <table id="TableKey" border="0" width="100%" cellspacing="0" cellpadding="2">
                            <tbody>
                            <tr>
                                <td class="strongtext"><strong>Composición corporal</strong></td>
                                <td class="strongtext"><strong>Índice de masa corporal (IMC)</strong></td>
                            </tr>
                            <tr>
                                <td class="AltRow1">Peso inferior al normal</td>
                                <td class="AltRow1">Menos de 18.5</td>
                            </tr>
                            <tr>
                                <td class="AltRow2">Normal</td>
                                <td class="AltRow2">18.5 – 24.9</td>
                            </tr>
                            <tr>
                                <td class="AltRow1">Peso superior al normal</td>
                                <td class="AltRow1">25.0 – 29.9</td>
                            </tr>
                            <tr>
                                <td class="AltRow2">Obesidad</td>
                                <td class="AltRow2">Más de 30.0</td>
                            </tr>
                            </tbody>
                        </table>

                    </div>

                </div>
            </article>

        </div>
    </section>

</main>

</body>

</html>

<!--<script>-->
<!--    function FigureBMI(form, inches, pounds) {-->
<!--        TotalInches = eval(inches);-->
<!--        Meters = TotalInches/39.36;-->
<!--        Kilos = pounds/2.2;-->
<!--        Square = Meters * Meters;-->
<!--        form.calcval.value = Math.round(Kilos * 10 / Square) / 10;-->
<!--    }-->

<!--    function FigureBMImet(form, cm, kg) {-->
<!--        Meters = eval(cm)/100;-->
<!--        Kilos = eval(kg);-->
<!--        Square = Meters * Meters;-->
<!--        form.calcval.value = Math.round(Kilos * 10 / Square) / 10;-->
<!--    }-->
<!--</script>-->