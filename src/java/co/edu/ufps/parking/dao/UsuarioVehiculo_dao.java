/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ufps.parking.dao;
import co.edu.ufps.parking.dto.*;
import co.edu.ufps.parking.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Daniel
 * 
 * este sera un cambio muy basico
 * 
 */
public class UsuarioVehiculo_dao {
    
    
    public boolean registrarUsuarioVehiculo(Usuario_dto user, Vehiculo_dto carro) throws Exception {
        boolean rta = false;

        try {
            ConexionPostgres.conectar();
            PreparedStatement ps;
            String sql = "INSERT INTO usuario_vehiculo (usuario, placa) "
                    + "VALUES (?,?)";

            ps = ConexionPostgres.getConnection().prepareStatement(sql);

            ps.setLong(1, user.getCodigo());
            ps.setString(2, carro.getPlaca());
            
            ps.execute();
            rta = true;
            ps.close();
            ps = null;
            ConexionPostgres.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
            rta = false;
        }

        return rta;
    }
    
    public ArrayList<String> listarCarros(long cod) throws SQLException{
//        
        ArrayList<String> myVehiculos=new ArrayList<String>();        
        ConexionPostgres.conectar();
        ResultSet rst = ConexionPostgres.ejecutarSQL("SELECT * FROM usuario_vehiculo where usuario= '" + cod + "'");

        while (rst.next()) {
            String placa = rst.getString(2);
            myVehiculos.add(placa);
        }
        ConexionPostgres.desconectar();
        return myVehiculos;
        
    }
    
    public ArrayList<String> listarCarros2(long cod) throws SQLException{
//        
        ArrayList<String> myVehiculos=new ArrayList<String>();        
        ConexionPostgres.conectar();
        ResultSet rst = ConexionPostgres.ejecutarSQL("SELECT * FROM ingreso_salida where usuario= '" + cod + "' AND hora_salida is null");

        while (rst.next()) {
            String placa = rst.getString(2);
            myVehiculos.add(placa);
        }
        ConexionPostgres.desconectar();
        return myVehiculos;
        
    }
}
