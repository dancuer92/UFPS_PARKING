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
        <div id="encabezado">
            <img src="../imagenes/banne_cursoft.jpg" alt=""/>
        </div>
        
        
        <div id="contenedor">
            
            <div id="sesion" align="center">Iniciar Sesión</div>
            
            <div id="contenido1">
            <%
                String login="";
                
               login+="<div id=\"user\">"+"Usuario"+"</div>"; 
               login+="<div id=\"user\">"+"<input type=\"text\" name=\"usuario\"   placeholder=\"Usuario\">"+"</div>";
               login+="<br><br>";
               login+="<div id=\"user\">"+"Contraseña"+"</div>";
               login+="<div id=\"user\">"+"<input type=\"password\" name=\"contraseña\"  placeholder=\"Contaseña\">"+"</div>";
               login+="<div id=\"olvido\"  align=\"center\" >"+"¿Olvido su contraseña?"+"</div>";
               login+="<div id=\"boton\"  align=\"center\">"+"<a href=\"ingreso.jsp\">"+"<button name=\"inicio\" type=\"submit\" value=\"enviar\">"+"Iniciar sesión"+"</button>"+"</a>"+"</div>";
               out.print(login);
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
