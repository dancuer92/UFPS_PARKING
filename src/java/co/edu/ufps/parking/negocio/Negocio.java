/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ufps.parking.negocio;

import java.util.ArrayList;
import java.util.List;
import co.edu.ufps.parking.dao.*;
import co.edu.ufps.parking.dto.*;
import co.edu.ufps.parking.util.*;

/**
 *
 * @author Daniel
 */
public class Negocio {

    private Usuario_dao usuario;
    private Vehiculo_dao vehiculo;
    private UsuarioVehiculo_dao usuarioVehiculo;

    public Negocio() {
        this.usuario = new Usuario_dao();
        this.vehiculo = new Vehiculo_dao();
        this.usuarioVehiculo = new UsuarioVehiculo_dao();
    }
    
    
    
    public String registrarUsuarioCarro2(Long codigo, String nombre, String apellido, Long telefono, String correo, String placa, String marca, String modelo, String color) {
        String rta = "";

        try {
            Usuario_dto user = new Usuario_dto();
            Vehiculo_dto carro = new Vehiculo_dto();

            boolean insertUser = false;
            boolean insertVehiculo = false;
            boolean insertUV = false;

            user.setCodigo(codigo);
            user.setNombre(nombre);
            user.setApellido(apellido);
            user.setTelefono(telefono);
            user.setCorreo(correo);

            carro.setPlaca(placa);
            carro.setMarca(marca);
            carro.setModelo(modelo);
            carro.setColor(color);

            this.usuario.registrarUsuario(user);
            this.vehiculo.registrarVehiculo(carro);
            this.usuarioVehiculo.registrarUsuarioVehiculo(user, carro);

            rta="Se ha registrado en el sistema";

        } catch (NumberFormatException nf) {
            nf.printStackTrace();
            rta = "Datos invalidos.";
        }
        catch (Exception e) {
            e.printStackTrace();
            rta = "Se ha producido un error.";
        }

        return rta;
    }
    
    public String añadirCarro2(long codigo, String placa, String marca, String modelo, String color) {
        String rta = "";

        try {
            
            System.out.println(codigo);
            Vehiculo_dto carro = new Vehiculo_dto();
            Usuario_dto user = this.usuario.getUsuario(codigo);
            
            System.out.println(user.toString());
            boolean insertVehiculo = false;
            System.out.println(insertVehiculo);
            boolean insertUV = false;
            System.out.println(insertUV);

            if (user.getCodigo() > 0) {
                carro.setPlaca(placa);
                carro.setMarca(marca);
                carro.setModelo(modelo);
                carro.setColor(color);

                System.out.println(carro.toString());
                insertVehiculo = this.vehiculo.registrarVehiculo(carro);
                insertUV = this.usuarioVehiculo.registrarUsuarioVehiculo(user, carro);

                if (insertUV && insertVehiculo) {
                    //negar el if
                    rta = "el vehículo ha sido añadido exitosamente";
                } else {
                    throw new Exception("Error, el carro y el usuario ya están relacionados");
                }

            }
            else {
                throw new Exception("Error, el usuario no existe en el sistema");
            }

        } catch (NumberFormatException nf) {
            nf.printStackTrace();
            rta = "Datos invalidos.";
        } catch (Exception e) {
            e.printStackTrace();
            rta = "Se ha producido un error.";
        }

        return rta;
    }
    
    
    
    
    

//    public String registrarUsuarioCarro(Long codigo, String nombre, String apellido, Long telefono, String correo, String placa, String marca, String modelo, String color) {
//        String rta = "";
//
//        try {
//            Usuario_dto user = new Usuario_dto();
//            Vehiculo_dto carro = new Vehiculo_dto();
//
//            boolean insertUser = false;
//            boolean insertVehiculo = false;
//            boolean insertUV = false;
//
//            user.setCodigo(codigo);
//            user.setNombre(nombre);
//            user.setApellido(apellido);
//            user.setTelefono(telefono);
//            user.setCorreo(correo);
//
//            carro.setPlaca(placa);
//            carro.setMarca(marca);
//            carro.setModelo(modelo);
//            carro.setColor(color);
//
//            insertUser = this.usuario.registrarUsuario(user);
////            insertVehiculo = this.vehiculo.registrarVehiculo(carro);
////            insertUV = this.usuarioVehiculo.registrarUsuarioVehiculo(user, carro);
//
//            if (insertUser) {
//                insertVehiculo = this.vehiculo.registrarVehiculo(carro);
//                if (insertVehiculo) {
//                    insertUV = this.usuarioVehiculo.registrarUsuarioVehiculo(user, carro);
//                    if (!insertUV) {
//                        //negar el if
//                        rta = "el registro ha sido exitoso";
//
//                    } else throw new Exception("Error, el carro y el usuario ya están relacionados");
//                    
//                } else throw new Exception("Error al registrar el carro");
//                
//            } else throw new Exception("Error al registrar el usuario");
//            
//
//        } catch (NumberFormatException nf) {
//            nf.printStackTrace();
//            rta = "Datos invalidos.";
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//            rta = "Se ha producido un error.";
//        }
//
//        return rta;
//    }

//    public String añadirCarro(Long codigo, String placa, String marca, String modelo, String color) {
//        String rta = "";
//
//        try {
//            Vehiculo_dto carro = new Vehiculo_dto();
//            Usuario_dto user = this.usuario.getUsuario(codigo);
//            boolean insertVehiculo = false;
//            boolean insertUV = false;
//
//            if (user.getCodigo() > 0) {
//                carro.setPlaca(placa);
//                carro.setMarca(marca);
//                carro.setModelo(modelo);
//                carro.setColor(color);
//
//                insertVehiculo = this.vehiculo.existeVehiculo(placa);
//                insertUV = this.usuarioVehiculo.registrarUsuarioVehiculo(user, carro);
//
//                if (!insertVehiculo) {
//                    insertVehiculo = this.vehiculo.registrarVehiculo(carro);
//                }
//                if (insertUV && insertVehiculo) {
//                    //negar el if
//                    rta = "el vehículo ha sido añadido exitosamente";
//                } else {
//                    throw new Exception("Error, el carro y el usuario ya están relacionados");
//                }
//
//            }
//            throw new Exception("Error, el usuario no existe en el sistema");
//
//        } catch (NumberFormatException nf) {
//            nf.printStackTrace();
//            rta = "Datos invalidos.";
//        } catch (Exception e) {
//            e.printStackTrace();
//            rta = "Se ha producido un error.";
//        }
//
//        return rta;
//    }

    public String buscarCarro(String placa) {
        String rta = "";
        
        System.out.println(placa);

        try {
            boolean insertVehiculo = false;
            insertVehiculo = this.vehiculo.existeVehiculo(placa);
            System.out.println(placa+ " prueba insertar vehiculo: "+ insertVehiculo);

            if (insertVehiculo) {
                System.out.println(insertVehiculo);
                rta = "OK";
            } else {
                System.out.println(insertVehiculo);
                throw new Exception("Error, el vehículo no existe en el sistema");
            }

        } catch (NumberFormatException nf) {
            nf.printStackTrace();
            rta = "Datos invalidos.";
        } catch (Exception e) {
            e.printStackTrace();
            rta = "Se ha producido un error.";
        }

        return rta;
    }

    public String añadirPersona(String placa, long codigo, String nombre, String apellido, long telefono, String correo) {
        String rta = "";

        try {
            Usuario_dto user = new Usuario_dto();
            user.setCodigo(codigo);
            user.setNombre(nombre);
            user.setApellido(apellido);
            user.setTelefono(telefono);
            user.setCorreo(correo);

            Vehiculo_dto carro = this.vehiculo.getVehiculo(placa);

            boolean insertUser = false;
            boolean insertUV = false;

            insertUser = this.usuario.existeUsuario(codigo);
            insertUV = this.usuarioVehiculo.registrarUsuarioVehiculo(user, carro);

            if (!insertUser) {
                insertUser = this.usuario.registrarUsuario(user);
            }

            if (insertUV && insertUser) {
                //negar el if
                rta = "la persona ha sido añadida exitosamente";
            } else {
                throw new Exception("Error, el carro y el usuario ya están relacionados");
            }
        } catch (NumberFormatException nf) {
            nf.printStackTrace();
            rta = "Datos invalidos.";
        } catch (Exception e) {
            e.printStackTrace();
            rta = "Se ha producido un error.";
        }

        return rta;
    }

}
