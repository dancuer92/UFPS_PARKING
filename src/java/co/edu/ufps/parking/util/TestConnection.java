/*
 * To change this template, choose Tools
 | Templates
 * and open the template in the editor.
 */
package co.edu.ufps.parking.util;
import java.sql.*; 


/**
 *Clase de prueba para realizar una conexión a una base de datos
 * @author madarme
 */
public class TestConnection {




 public static void main(String[] args) throws Exception 
 {
   ConexionPostgres.conectar(); 
   
   char[] llave = {'f','m','d','f'};
   Seguridad seguridad = new Seguridad(llave, 20);
   String claveEncriptada = seguridad.encriptar("123456");
    if (ConexionPostgres.hayConexion()){
        System.out.println("...Hay conexion...");
    	System.out.println("clave:" + claveEncriptada);
    } else
        System.out.println("...No Hay conexión...");

 }
}