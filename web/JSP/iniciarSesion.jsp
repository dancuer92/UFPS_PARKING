<%-- 
    Document   : index
    Created on : 13/04/2015, 11:22:42 AM
    Author     : frayban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta UFPS Parking</title>
    <link rel="stylesheet" type="text/css" href="../CSS/estilo.css">
    <link rel="stylesheet" type="text/css" href="../CSS/movil.css">
</head>
<body>

    <%
        session.invalidate();
    %>

    <div id="encabezado">
        <img src="../imagenes/banne_cursoft.jpg" alt=""/>
    </div>


    <div id="contenedor">

        <div id="sesion" align="center">Iniciar Sesión</div>
        <form action="ingreso.jsp" method="post">
        <div id="contenido1">
            <div id="user">Código</div> 
            <div id=user><input type="number" name="codigo"   placeholder="Codigo"></div>
            <br><br>
            <div id="user">Contraseña</div>
            <div id="user"><input type="password" name="password"  placeholder="Contraseña"></div>
            <div id="olvido"  align="center" >¿Olvido su contraseña?</div>
            <div id="boton"  align="center"><button name="inicio" type="submit" value="enviar">Iniciar sesión</button></div>

        </div>

        </form>

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
