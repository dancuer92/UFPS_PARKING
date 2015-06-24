<%-- 
    Document   : index
    Created on : 14/04/2015, 10:30:10 AM
    Author     : frayban
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta UFPS Parking</title>
    <link rel="stylesheet" type="text/css" href="../CSS/estilo.css">
    <link rel="stylesheet" type="text/css" href="../CSS/slider.css">
    <link rel="stylesheet" type="text/css" href="../CSS/movil.css">
    <script  src="../js/jquery-1.11.2.min.js"  ></script>
    <script  src="../js/slider3.js"  ></script>

</head>
<body>
    <div id="encabezado">
        <img src="../imagenes/banne_cursoft.jpg" alt=""/>
    </div>


    <div id="contenedor">

        <div id="sesion" align="center">BIENVENIDO </div>


        <div id="conprincipal">

            <div id="menu" >

                <div id="li"><a href="iniciarSesion.jsp">Iniciar Sesión</a> </div>
                <div id="li"><a href="RegistrarUsuario.jsp">Registrarse</a></div>
                <div id="li"><a href="CarroAdicional.jsp">Añadir carro</a></div>
                <div id="li"><a href="BuscarMiCarro.jsp">Buscar mi carro</a></div>
                <div id="li"><a href="comoFunciona.jsp">¿Cómo funciona?</a></div>
                <div id="li"><a href="contactanos.jsp">Contactanos</a></div>
                <div id="li"><a href="servicios.jsp">Servicios Adicionales</a></div>

            </div>   

            <div id="imgindex">

                <div id="slider">       

                    <a href=""><img src="../imagenes/Entradas/Entrada1.jpg" /><p>TEXTO1</p></a>
                    <a href=""><img src="../imagenes/Entradas/Entrada2.jpg" /><p>TEXTO1</p></a>
                </div>

                <a href="javascript:void();" class="mas">&rsaquo;</a>
                <a href="javascript:void();" class="menos">&lsaquo;</a>
            </div>


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
