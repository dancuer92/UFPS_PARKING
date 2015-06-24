<%-- 
    Document   : ConsultaUser
    Created on : 24/06/2015, 03:50:55 AM
    Author     : Daniel
--%>

<%@page import="co.edu.ufps.parking.facade.Facade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta UFPS Parking</title>
    <link rel="stylesheet" type="text/css" href="../CSS/estilo.css">
    <link rel="stylesheet" type="text/css" href="../CSS/movil.css">
</head>

<%

    Facade facade = new Facade();

    String msj = "";

    String codigo = request.getParameter("codigo");

    msj = facade.consultarUser(codigo);

%>

<body>
    <div id="encabezado">
        <img src="../imagenes/banne_cursoft.jpg" alt=""/>
    </div>


    <div id="contenedor">

        <div id="sesion" align="center"> </div>

        <div id="contenido">

            

            <%=msj%>






            <a href="inicio.jsp" align="center">Volver a Inicio</a>

        </div>

    </div>



    <div id="footer" align="center">
        <br><br>
        Desarrollado por: Frayba Otalora - Manuel Saravia - Daniel Cuervo<br>
        Copyright © 2015. Programa de Ingeniería de Sistemas - UFPS<br>
        Desarrollo WEB
        <br><br>


    </div>
</body>
</html>

