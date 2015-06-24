<%-- 
    Document   : personasAdicionales
    Created on : 15/04/2015, 10:27:30 AM
    Author     : frayban
--%>

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
            
            <div id="sesion" align="center">Añadir Carro Adicional</div>
            
            <div id="contenido">
                <form id="formRegistrarCarro" name="formRegistrarCarro" method="post" action="guardarRegistro_1.jsp">
                    
                    <div id="registro">Código de usuario</div> 
                    <div id="registro"><input type="text" name="codigo" placeholder="Digite el código de usuario" required/></div>
                    <br>
                    <div id="registro">Placa</div> 
                    <div id="registro"><input type="text" name="placa" placeholder="Digite la placa del vehículo" required/></div>
                    <br>
                    <div id="registro">Marca</div>
                    <div id="registro"><input type="text" name="marca"  placeholder="Digite la marca del vehículo" required/></div>
                    <br>
                    <div id="registro">Modelo</div>
                    <div id="registro"><input type="text" name="modelo"  placeholder="Digite el modelo del vehículo (No es el año)" required/></div>
                    <br>
                    <div id="registro">Color</div>
                    <div id="registro"><input type="text" name="color"  placeholder="Digite el color del vehículo" required/></div>
                    <br>
                    <div id="registro">
                        <%--<a href="RegistrarCarro.jsp"><button name="carroAdicional" type="submit" value="carros">Registrar Carro Adicional</button></a>                    
                        --%>
                        <a href="guardarRegistro_1.jsp"><button name="terminarRegistro" type="submit" value="terminarRegistro">Terminar de Registrar</button></a>
                        
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
