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
            
            <div id="contenido">
            <%
                String ingreso="";
                
               ingreso+="<div id=\"user\">"+"Codigo"+"</div>"; 
               ingreso+="<div id=\"user\">"+"<input type=\"text\" name=\"usuario\"   placeholder=\"010101010101010101\">"+"</div>";
               out.print(ingreso);
                %>
            
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
