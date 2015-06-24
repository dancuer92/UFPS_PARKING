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
    
        String codigo=request.getParameter("codigo");
        String nombre=request.getParameter("nombre");
        String apellido=request.getParameter("apellido");
        String telefono=request.getParameter("telefono");
        String correo=request.getParameter("correo");
        
        msj+="<input type=\"hidden\" name=\"codigo\" id=\"codigo\" value=\""+codigo+"\"/>";
        msj+="<input type=\"hidden\" name=\"nombre\" id=\"nombre\" value=\""+nombre+"\"/>";
        msj+="<input type=\"hidden\" name=\"apellido\" id=\"apellido\" value=\""+apellido+"\"/>";
        msj+="<input type=\"hidden\" name=\"telefono\" id=\"telefono\" value=\""+telefono+"\"/>";
        msj+="<input type=\"hidden\" name=\"correo\" id=\"correo\" value=\""+correo+"\"/>";
    %>
    
    
    <body>
        <div id="encabezado">
            <img src="../imagenes/banne_cursoft.jpg" alt=""/>
        </div>
        
        
        <div id="contenedor">
            
            <div id="sesion" align="center">Registrar vehículo</div>
            
            <div id="contenido">
                <form id="formRegistrarCarro" name="formRegistrarCarro" method="post" action="guardarRegistro.jsp">
                    
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
                        <%=msj%>
                        <a href="guardarRegistro.jsp"><button name="terminarRegistro" type="submit" value="terminarRegistro">Terminar de Registrar</button></a>
                        
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
