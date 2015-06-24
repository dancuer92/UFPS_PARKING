<%-- 
    Document   : registrarse
    Created on : 14/04/2015, 10:04:54 AM
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
    <script type="text/javascript" src="../js/general.js"></script>
    </head>
    
    <body>
        <div id="encabezado">
            <img src="../imagenes/banne_cursoft.jpg" alt=""/>
        </div>
        
        
        <div id="contenedor">
            
            <div id="sesion" align="center">BIENVENIDO</div>
            
            <div id="contenido">
                <form id="formRegistrarUsuario" name="formRegistrarUsuario" method="post" action="RegistrarCarro.jsp"> 
                
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
                    <div id="boton"  align="center"><a href="RegistrarCarro.jsp"><button name="registroPersona" type="submit" value="registrar">Registrar</button></a></div>
                    
                    
                    <%--<button name="cmdRegistrarUsuario" id="cmdRegistrarUsuario" value="Registrar Usuario"/>Registrar Usuario</button>
                --%>
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
