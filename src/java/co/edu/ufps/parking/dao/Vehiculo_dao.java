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
public class Vehiculo_dao {
    public boolean registrarVehiculo(Vehiculo_dto carro) throws Exception {
        boolean rta = false;

        try {
            ConexionPostgres.conectar();
            PreparedStatement ps;
            String sql = "INSERT INTO vehiculo (placa, marca, modelo, color) "
                    + "VALUES (?,?,?,?)";

            ps = ConexionPostgres.getConnection().prepareStatement(sql);

            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getMarca());
            ps.setString(3, carro.getModelo());
            ps.setString(4, carro.getColor());

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
    
    public Vehiculo_dto getVehiculo(String placa) throws Exception {
        Vehiculo_dto car = new Vehiculo_dto();
        ConexionPostgres.conectar();
        ResultSet rst = ConexionPostgres.ejecutarSQL("SELECT * FROM vehiculo where placa= '" + placa + "'");

        if (rst.next()) {
            car = new Vehiculo_dto(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4));
        }
        ConexionPostgres.desconectar();
        return car;
    }
    
    public String consultarVehiculo(String placa) throws Exception {
        
        ConexionPostgres.conectar();
        String rst = ConexionPostgres.getTablaHTML("SELECT * FROM vehiculo where placa= '" + placa + "'");
        ConexionPostgres.desconectar();
        return rst;
    }
    
    public boolean existeVehiculo(String placa) throws Exception {
        boolean car = false;
        ConexionPostgres.conectar();
        ResultSet rst = ConexionPostgres.ejecutarSQL("SELECT * FROM vehiculo where placa= '" + placa + "'");

        if (rst.next()) {
            car = true;
        }
        ConexionPostgres.desconectar();
        return car;
    }
}
