/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ufps.parking.dao;

import co.edu.ufps.parking.util.*;
import java.sql.PreparedStatement;
import co.edu.ufps.parking.dto.*;
import java.sql.ResultSet;

import co.edu.ufps.parking.util.Conexion;
import java.io.Serializable;
/**
 *
 * @author Daniel
 */
public class Vigilante_dao implements Serializable {

	public boolean registrarVigilante(Vigilante_dto vig) throws Exception {
        boolean rta = false;

        try {
            ConexionPostgres.conectar();
            PreparedStatement ps;
            String sql = "INSERT INTO vigilante (codigo, nombre, password) "
                    + "VALUES (?,?,?)";

            ps = ConexionPostgres.getConnection().prepareStatement(sql);

            ps.setLong(1, vig.getCodigo());
            ps.setString(2, vig.getNombre());
            ps.setString(3, vig.getPassword());
            

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

    public Vigilante_dto buscarVigilante(Long cod) throws Exception {
        Vigilante_dto vig = new Vigilante_dto();
        ConexionPostgres.conectar();
        ResultSet rst = ConexionPostgres.ejecutarSQL("SELECT * FROM vigilante where codigo= '" + cod + "'");

        if (rst.next()) {
            vig = new Vigilante_dto(rst.getLong(1), rst.getString(2), rst.getString(3));
        }
        ConexionPostgres.desconectar();
        return vig;
    }

    public boolean existeUsuario(Long cod) throws Exception {
        boolean user = false;
        ConexionPostgres.conectar();
        ResultSet rst = ConexionPostgres.ejecutarSQL("SELECT * FROM usuario where codigo= '" + cod + "'");

        if (rst.next()) {
            user = true;
        }
        ConexionPostgres.desconectar();
        return user;
    }
}
