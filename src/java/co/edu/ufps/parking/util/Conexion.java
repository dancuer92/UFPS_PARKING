package co.edu.ufps.parking.util;
import java.sql.*;

/*
 * Clase creada por el grupo 4 para conectar a la base de datos, fue creada en vista de los problemas
 * de conexion vistos en otros compa�eros
 */
public class Conexion {
	private String dir="jdbc:postgresql://sandbox2.ufps.edu.co:5432/proyectosGradoWeb";
    private Connection co;
    
    public Conexion(){
    	
    }
    
    /**
     * Grupo 4
     * Metodo para conectar con la base de datos en postgresql
     * @throws ClassNotFoundException Excepciones que se pueden producir durante la asignacion del driver de postgres
     * @throws SQLException Excepciones que se puedan producir en la creacion de la conexion
     */
    public void conectar() throws ClassNotFoundException, SQLException{
            Class.forName("org.postgresql.Driver");
            co=DriverManager.getConnection(dir,"proyectoweb","proyectoweb");
    
    }
    
    
    
    
    /**
     * Grupo 4
     * Metodo get del objeto Connection
     * @return
     */
    public Connection getCo() {
		return co;
	}




/**
 * Grupo 4
 * Metodo para desconectar a la base de datos
 * @throws SQLException
 */
	public void desconectar() throws SQLException{
 
            this.co.close();
       
    }

}
