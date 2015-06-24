<%-- 
    Document   : personasAdicionales
    Created on : 15/04/2015, 10:27:30 AM
    Author     : frayban
--%>

<%@page import="co.edu.ufps.parking.facade.Facade"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta UFPS Parking</title>
    <link rel="stylesheet" type="text/css" href="../CSS/estilo.css">
    </head>
    
    
    <body>
        <div id="encabezado">
            <img src="../imagenes/banne_cursoft.jpg" alt=""/>
        </div>
        
        
        <div id="contenedor">
            
            <div id="sesion" align="center">Buscar carro por placa</div>
            
            <div id="contenido">
                <form id="formBuscarCarro" name="formBuscarCarro" method="post" action="personaAdicional.jsp">
                    
                    <div id="registro">Placa del vehículo</div> 
                    <div id="registro"><input type="text" name="placa" placeholder="Digite la placa del vehículo" required/></div>
                    <br>
                    <div id="registro">
                        <%--<a href="RegistrarCarro.jsp"><button name="carroAdicional" type="submit" value="carros">Registrar Carro Adicional</button></a>                    
                        --%>
                        <a href="personaAdicional.jsp"><button name="registrarPersona" type="submit" value="registrarPersona">Buscar</button></a>
                        
                    </div>
                    
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
