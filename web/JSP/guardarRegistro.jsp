<%-- 
    Document   : comoFunciona
    Created on : 15/04/2015, 10:05:32 AM
    Author     : frayban
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
    
        Facade facade=new Facade();
        String msj="";
    
        String codigo=request.getParameter("codigo");
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String telefono=request.getParameter("telefono");
        String correo=request.getParameter("correo");
        
        String placa=request.getParameter("placa");
        String marca=request.getParameter("marca");
        String modelo=request.getParameter("modelo");
        String color=request.getParameter("color");
        
        msj=facade.registrarUsuarioCarro(codigo, nombre, apellido, telefono, correo, placa, marca, modelo, color);
    %>
    
    <body>
        <div id="encabezado">
            <img src="../imagenes/banne_cursoft.jpg" alt=""/>
        </div>
        
        
        <div id="contenedor">
            
            <div id="sesion" align="center"> </div>
            
            <div id="contenido">
            
            <%= msj%>
            
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
