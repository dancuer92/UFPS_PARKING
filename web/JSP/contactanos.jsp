<%-- 
    Document   : contactanos
    Created on : 15/04/2015, 09:45:16 AM
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
            
            <div id="sesion" align="center">BIENVENIDO</div>
            
            <div id="contenido">
            <%
                String registro="";
                
               registro+="<div id=\"registro\">"+"Codigo"+"</div>"; 
               registro+="<div id=\"registro\">"+"<input type=\"text\" name=\"codigo\"   placeholder=\"Codigo\">"+"</div>";
               registro+="<br>";
               registro+="<div id=\"registro\">"+"Asunto"+"</div>";
               registro+="<div id=\"registro\">"+"<input type=\"text\" name=\"correo\"  placeholder=\"Asunto\">"+"</div>";
               registro+="<br>";
               registro+="<div id=\"registro\">"+"Comentarios"+"</div>";
               registro+="<div id=\"registro1\">"+"<textarea name=\"comentarios\">Escribe aquí tus comentarios</textarea>"+"</div>";
               registro+="<br>";
               registro+="<div id=\"boton\"  align=\"center\">"+"<a href=\"index.jsp\">"+"<button name=\"inicio\" type=\"submit\" value=\"registrar\">"+"Enviar"+"</button>"+"</a>"+"</div>";
               
               out.print(registro);
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