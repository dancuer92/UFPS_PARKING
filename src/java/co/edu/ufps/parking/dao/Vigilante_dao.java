package co.edu.ufps.parking.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.edu.ufps.parking.dto.Vigilante_dto;
import co.edu.ufps.parking.util.Conexion;

public class Vigilante_dao implements Serializable {

	private Conexion conexion;

	public Conexion getConexion() {
		return conexion;
	}

	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}
	
	/**
	 * Metodo que registra un usuario en la base de datos
	 * @param usuario: Usuario a registrar
	 * @return false si se presento error, true si se guardo correctamente en la base de datos.
	 */
	public boolean registrarUsario(Vigilante_dto usuario){
		boolean rta=false;
		Connection con=null;
		PreparedStatement ps=null;
		try {
			
			if(conexion==null) conexion= new Conexion();
			if(conexion.getConnection()==null) con = conexion.conectar("Vigilante.registrarVigilante");
			else con= conexion.getConnection();
			String sql = "INSERT INTO vigilante (codigo, nombre, password) "
					+    "VALUES (?,?,?) ";
			ps = con.prepareStatement(sql);
			
			ps.setLong(1, usuario.getCodigo());
			ps.setString(2, usuario.getNombre());
			ps.setString(3, usuario.getPassword());
			
			ps.executeUpdate();
			rta=true;
		} catch (Exception e) {
			e.printStackTrace();
			conexion.escribirLogs("Vigilante_dao", "registrarVigilante", e.toString());
			rta=false;			
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				conexion.escribirLogs("Vigilante_dao", "registrarVigilante", e2.toString());
			}
						
			ps=null;
			con=null;
		}
		return rta;
	}
	
	/**
	 * M�todo que permite buscar un usuario por su log�n.
	 * @param login: login del usuario a buscar
	 * @return Usuario, datos del usuario, si no existe el login devuelve null.
	 */
	public Vigilante_dto buscarUsuario(long codigo){
		Vigilante_dto usuario=null;
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rst=null;
		try {
			
			if(conexion==null) conexion= new Conexion();
			if(conexion.getConnection()==null) con = conexion.conectar("Usuario.registrarUsuario");
			else con= conexion.getConnection();
			String sql = "SELECT * FROM vigilante "
					+    "WHERE codigo = ? ";
			ps = con.prepareStatement(sql);
			ps.setLong(1, codigo);
			rst = ps.executeQuery();
			
			if(rst.next()){
				usuario = new Vigilante_dto();
				
				usuario.setCodigo(rst.getLong(1));
				usuario.setNombre(rst.getString(2));				
				usuario.setPassword(rst.getString(3));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			conexion.escribirLogs("Vigilante_dao", "registrarVigilante", e.toString());
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				conexion.escribirLogs("Vigilante_dao", "registrarVigilante", e2.toString());
			}
						
			ps=null;
			con=null;
		}
		
		return usuario;
	}
	
	/**
	 * M�todo que permite editar los datos de un usuario
	 * @param usuario: Datos del usuario a editar
	 * @return boolean, true si se realizaron los cambio y false si se produjo error.
	 */
	public boolean editarUsario(Vigilante_dto usuario){
		boolean rta=false;
		Connection con=null;
		PreparedStatement ps=null;
		try {
			
			if(conexion==null) conexion= new Conexion();
			if(conexion.getConnection()==null) con = conexion.conectar("Usuario.registrarUsuario");
			else con= conexion.getConnection();
			String sql = "UPDATE vigilante SET codigo=?, nombre=?, password=?"
					+    "WHERE codigo=? ";
			ps = con.prepareStatement(sql);
			
			ps.setLong(1, usuario.getCodigo());
			ps.setString(2, usuario.getNombre());
			ps.setString(3, usuario.getPassword());
			
			ps.executeUpdate();
			rta=true;
		} catch (Exception e) {
			e.printStackTrace();
			conexion.escribirLogs("Vigilante_dao", "registrarVigilante", e.toString());
			rta=false;			
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
				conexion.escribirLogs("Vigilante_dao", "registrarVigilante", e2.toString());
			}
						
			ps=null;
			con=null;
		}
		return rta;
	}
	
}
