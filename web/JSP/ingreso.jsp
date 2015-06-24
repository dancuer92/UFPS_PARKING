<%-- 
    Document   : ingreso
    Created on : 14/04/2015, 10:24:01 AM
    Author     : frayban
--%>

<
<jsp:useBean id="vigilante" scope="session" class="co.edu.ufps.parking.dto.Vigilante_dto"></jsp:useBean>
        <jsp:useBean id="facade" scope="page" class="co.edu.ufps.parking.facade.Facade"></jsp:useBean>
        
        <%
            
            String mensaje = "";
            String codigo = request.getParameter("codigo");
            String pass = request.getParameter("password");
            System.out.println(codigo+ " " +pass);
            vigilante.setCodigo(Long.parseLong(codigo));
            vigilante.setPassword(pass);

            // verificar el login del usuario
            boolean b = facade.verificarLogin(vigilante);
            
            if (!b) {
                mensaje = "Datos erroneos, por favor verifique.";
                response.sendRedirect("iniciarSesion.jsp");
            } else {
                mensaje = "ok";
                response.sendRedirect("inicio.jsp");
            }


                
        %>

