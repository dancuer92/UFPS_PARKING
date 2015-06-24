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
    
}