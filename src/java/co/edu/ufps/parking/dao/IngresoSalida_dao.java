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
import java.util.Date;
/**
 *
 * @author Daniel
 */
public class IngresoSalida_dao {
    
    public boolean registrarEntrada(Usuario_dto user, Vehiculo_dto carro, Date fechaIng) throws Exception {
        boolean rta = false;

        try {
            ConexionPostgres.conectar();
            PreparedStatement ps;
            String sql = "INSERT INTO ingreso_salida (usuario, placa, hora_ingreso) "
                    + "VALUES (?,?,?)";

            ps = ConexionPostgres.getConnection().prepareStatement(sql);

            ps.setLong(1, user.getCodigo());
            ps.setString(2, carro.getPlaca());
            ps.setDate(3, (java.sql.Date) fechaIng);
            
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
    
    public boolean registrarSalida(Usuario_dto user, Vehiculo_dto carro, Date fechaSalida) throws Exception {
        boolean rta = false;

        try {
            ConexionPostgres.conectar();
            PreparedStatement ps;
            String sql = "UPDATE ingreso_salida SET hora_salida=?"
                    + "WHERE usuario='"+user.getCodigo()+"' AND placa='"+carro.getPlaca()+"' AND hora_salida is Null";
                    

            ps = ConexionPostgres.getConnection().prepareStatement(sql);

            
            ps.setDate(1, (java.sql.Date) fechaSalida);
            
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
    
    public String listarEntradasSalidas(long cod) throws SQLException{
//        
               
        ConexionPostgres.conectar();
        String rst = ConexionPostgres.getTablaHTML("SELECT * FROM ingreso_salida where usuario= '" + cod + "' LIMIT 5");
        ConexionPostgres.desconectar();
        return rst;
        
    }
}
