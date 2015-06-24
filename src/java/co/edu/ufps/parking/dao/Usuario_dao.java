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

/**
 *
 * @author Daniel
 */
public class Usuario_dao {

    public boolean registrarUsuario(Usuario_dto user) throws Exception {
        boolean rta = false;

        try {
            ConexionPostgres.conectar();
            PreparedStatement ps;
            String sql = "INSERT INTO usuario (codigo, nombre, apellido, telefono, correo) "
                    + "VALUES (?,?,?,?,?)";

            ps = ConexionPostgres.getConnection().prepareStatement(sql);

            ps.setLong(1, user.getCodigo());
            ps.setString(2, user.getNombre());
            ps.setString(3, user.getApellido());
            ps.setLong(4, user.getTelefono());
            ps.setString(5, user.getCorreo());

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

    public Usuario_dto getUsuario(Long cod) throws Exception {
        Usuario_dto user = new Usuario_dto();
        ConexionPostgres.conectar();
        ResultSet rst = ConexionPostgres.ejecutarSQL("SELECT * FROM usuario where codigo= '" + cod + "'");

        if (rst.next()) {
            user = new Usuario_dto(rst.getLong(1), rst.getString(2), rst.getString(3), rst.getLong(4), rst.getString(5));
        }
        ConexionPostgres.desconectar();
        return user;
    }
    
    public String buscarUsuario(Long cod) throws Exception {        
        ConexionPostgres.conectar();
        String rst = ConexionPostgres.getTablaHTML("SELECT * FROM usuario where codigo= '" + cod + "'");
        ConexionPostgres.desconectar();
        return rst;
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
