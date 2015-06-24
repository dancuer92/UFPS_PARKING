/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ufps.parking.dao;

import co.edu.ufps.parking.dto.*;
import co.edu.ufps.parking.util.*;
import java.sql.PreparedStatement;

/**
 *
 * @author Daniel
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
}
