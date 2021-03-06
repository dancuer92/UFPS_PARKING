/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ufps.parking.facade;


import co.edu.ufps.parking.dto.Vigilante_dto;
import co.edu.ufps.parking.negocio.Negocio;
import co.edu.ufps.parking.negocio.VerificarSesion;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Facade {

    private Negocio myNegocio = new Negocio();
    private VerificarSesion mySesion=new VerificarSesion();

    public String registrarUsuarioCarro(String codigo, String nombre, String apellido, String telefono, String correo, String placa,
            String marca, String modelo, String color) {

        long cod = Long.parseLong(codigo);
        long tel = Long.parseLong(telefono);
        
        return this.myNegocio.registrarUsuarioCarro2(cod, nombre, apellido, tel, correo, placa, marca, modelo, color);

//        return this.myNegocio.registrarUsuarioCarro(cod, nombre, apellido, tel, correo, placa, marca, modelo, color);

    }

    public String añadirCarro(String codigo, String placa, String marca, String modelo, String color) {
        long cod = Long.parseLong(codigo);

        return this.myNegocio.añadirCarro2(cod, placa, marca, modelo, color);
    }

    public String buscarCarro(String placa) {
        return this.myNegocio.buscarCarro(placa);
    }

    public String añadirPersona(String placa, String codigo, String nombre, String apellido, String telefono, String correo) {
        long cod = Long.parseLong(codigo);
        long tel = Long.parseLong(telefono);
        return this.myNegocio.añadirPersona(placa, cod, nombre, apellido, tel, correo);
    }
    
    public boolean verificarLogin(Vigilante_dto vigilante){
        return this.myNegocio.verificarLogin(vigilante);
    }
    
    public String listarCarros(String codigo){
        long cod = Long.parseLong(codigo);
        return this.myNegocio.listarCarros(cod);
    }
    
    public String listarCarros2(String codigo){
        long cod = Long.parseLong(codigo);
        return this.myNegocio.listarCarros2(cod);
    }
    
    public String registrarEntrada(String codigo, String placa){
        long cod = Long.parseLong(codigo);
        return this.myNegocio.registrarEntrada(cod, placa);
    }

    public String registrarSalida(String codigo, String placa){
        long cod = Long.parseLong(codigo);
        return this.myNegocio.registrarSalida(cod, placa);
    }
    
    public String listarEntradasSalidas(String codigo){
        long cod = Long.parseLong(codigo);
        return this.myNegocio.listarEntradasSalidas(cod);
    }
    
    public String consultarUser(String codigo){
        long cod = Long.parseLong(codigo);
        return this.myNegocio.buscarUSer(cod);
    }
    
    public String consultarCarro(String placa){
        return this.myNegocio.consultarCarro(placa);
    }
}
