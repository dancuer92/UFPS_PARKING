<%-- 
    Document   : ConsultarUsuario
    Created on : 24/06/2015, 03:47:32 AM
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
    <script type="text/javascript" src="../js/general.js"></script>
</head>

<body>


    


    <div id="encabezado">
        <img src="../imagenes/banne_cursoft.jpg" alt=""/>
    </div>


    <div id="contenedor">

        <div id="sesion" align="center">CONSULTA DE USUARIO</div>

        <div id="contenido">
            <form id="formConsultarUsuario" name="formConsultarUsuario" method="post" action="ConsultaUser.jsp"> 

                <div id="registro">Código (estudiantil, docente, o administrativo)</div> 
                <div id="registro"><input type="text" name="codigo" placeholder="Codigo" required/></div>
                <br>

                <div id="boton"  align="center"><a href="ConsultaUSer.jsp"><button name="ConsultaUser" type="submit" value="Consultar">Consultar Usuario</button></a></div>


                <%--<button name="cmdRegistrarUsuario" id="cmdRegistrarUsuario" value="Registrar Usuario"/>Registrar Usuario</button>
                --%>
            </form>

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

