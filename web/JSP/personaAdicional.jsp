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
    
    <%
        Facade facade=new Facade();
        String msj="";
        
        String placa=request.getParameter("placa");
        msj+="<input type=\"hidden\" name=\"placa\" id=\"placa\" value=\""+placa+"\"/>";
    %>
    <body>
        <div id="encabezado">
            <img src="../imagenes/banne_cursoft.jpg" alt=""/>
        </div>
        
        
        <div id="contenedor">
            
            <div id="sesion" align="center">Registrar Usuario Adicional</div>
            
            <div id="contenido">
                <form id="formRegistrarUsuario" name="formRegistrarUsuario" method="post" action="guardarRegistroPersona.jsp"> 
                    <div id="registro">Código (estudiantil, docente, o administrativo)</div> 
                    <div id="registro"><input type="text" name="codigo" placeholder="Codigo" required/></div>
                    <br>
                    <div id="registro">Nombre</div>
                    <div id="registro"><input type="text" name="nombre"  placeholder="Nombre del usuario" required/></div>
                    <br>
                    <div id="registro">Apellido</div>
                    <div id="registro"><input type="text" name="apellido"  placeholder="Apellido del usuario" required/></div>
                    <br>
                    <div id="registro">Teléfono</div>
                    <div id="registro"><input type="text" name="telefono"  placeholder="Teléfono" required/></div>
                    <br>
                    <div id="registro">Correo electrónico</div>
                    <div id="registro"><input type="email" name="correo"  placeholder="Correo electrónico" required/></div>
                    <br>
                    <div id="registro">
                        <%--<a href="RegistrarCarro.jsp"><button name="carroAdicional" type="submit" value="carros">Registrar Carro Adicional</button></a>                    
                        --%>
                        <%= msj%>
                        <a href="guardarRegistroPersona.jsp"><button name="terminarRegistro" type="submit" value="terminarRegistro">Terminar de Registrar</button></a>
                        
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
