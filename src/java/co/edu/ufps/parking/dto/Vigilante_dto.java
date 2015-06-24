/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ufps.parking.dto;

import java.io.Serializable;

/**
 *
 * @author Daniel
 */
public class Vigilante_dto implements Serializable{
    private long codigo;
    private String nombre;
    private String password;

    public Vigilante_dto() {
    }

    public Vigilante_dto(long codigo, String nombre, String password) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.password = password;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vigilante_dto other = (Vigilante_dto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vigilante_dto{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }
    
    
}
