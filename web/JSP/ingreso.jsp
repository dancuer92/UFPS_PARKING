<%-- 
    Document   : ingreso
    Created on : 14/04/2015, 10:24:01 AM
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
    <div id="encabezado">
        <img src="../imagenes/banne_cursoft.jpg" alt=""/>
    </div>


    <div id="contenedor">

        <div id="sesion" align="center">Bienvenido </div>

        <jsp:useBean id="usuario" scope="session" class="co.edu.ufps.casinoWeb.dto.Usuario"/>
        <jsp:setProperty property="*" name="usuario"/>
        <jsp:useBean id="juego" scope="session" class="co.edu.ufps.casinoWeb.dto.Juego21"/>
        <jsp:useBean id="facade" scope="page" class="co.edu.ufps.casinoWeb.facade.Juego21Facade"/>
        
        <%
            String estado = request.getParameter("txtEstado");
            String mensaje = "";
            if (estado==null) estado="";

            // verificar el login del usuario
            usuario = facade.verificarLogin(usuario);
            if (usuario == null) {
                mensaje = "Datos erroneos. Por favor verifique.";
            } else {
                mensaje = "ok";
            }

            if (mensaje.equals("ok")) {

                juego.setNombreJugador(usuario.getNombreUsuario());

                if (estado.equals("")) {
                    facade.iniciarJuego(juego);
                }

                /*
                 if (estado.equals("PedirCarta")){
                 mensaje = juego.pedirCarta();
                 if (!mensaje.equals("")) response.sendRedirect("ganador.jsp");
                 }*/
        %>


        <div id="contenido">

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
