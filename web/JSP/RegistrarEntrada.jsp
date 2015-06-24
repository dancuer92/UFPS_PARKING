<%-- 
    Document   : RegistrarEntrada
    Created on : 24/06/2015, 12:29:20 AM
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
    String carros = "";
    String msj = "";

    String codigo = request.getParameter("codigo");
    

    carros = facade.listarCarros(codigo);

    String[] placas = carros.split("-");
    for (int i = 0; i < placas.length; i++) {
        msj+="<option name=\"placa"+i+"\" id=\"placa"+i+"\" value=\""+placas[i]+"\"/option>";
    }
    
    

%>

<body>
    <div id="encabezado">
        <img src="../imagenes/banne_cursoft.jpg" alt=""/>
    </div>


    <div id="contenedor">

        <div id="sesion" align="center"> </div>

        <div id="contenido">

            <form id="formRegistrarEntrada" name="formRegistrarEntrada" method="post" action="guardarEntrada.jsp">
                <div id="codigo">Usuario: <%= codigo%></div>
                <input type="hidden" name="codigo" id="codigo" value="<%= codigo%>"/>;
                <select name="placas">
                    <%=msj%>
                </select>
                
                <div id="boton"  align="center"><a href="guardarEntrada.jsp"><button name="registrar" type="submit" value="registrar">Guardar Entrada</button></a></div>;
            </form>
            
            
               
            
            

            <a href="index.jsp" align="center">Volver a Inicio</a>

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
