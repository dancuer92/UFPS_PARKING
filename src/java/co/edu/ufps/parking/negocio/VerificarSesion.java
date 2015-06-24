package co.edu.ufps.parking.negocio;

import java.io.Serializable;

import co.edu.ufps.parking.dao.Vigilante_dao;
import co.edu.ufps.parking.dto.Vigilante_dto;

/**
 * Clase que contiene los m�todos de iniciar y verificar los datos de sesi�n del usuario
 * @author Fredy
 *
 */
public class VerificarSesion implements Serializable {
	
	private Vigilante_dao vigilante;
	
	public VerificarSesion() {
		vigilante = new Vigilante_dao();
	}
	
	/**
	 * M�todo que verifica el login del vigilante
	 * @param vigi: Datos del usuairo a verificar
	 * @return String: mensaje a mostrar en la pagina, devuelve "ok" si los datos son correctos.
	 */
	public Vigilante_dto verificarLogin(Vigilante_dto vigi) {
		try {
			String password = vigi.getPassword();
			vigi= vigilante.buscarUsuario(vigi.getCodigo());
			if (vigilante!=null){ 
				if (!password.equals(vigi.getPassword())) 
                                    vigi=null;
			} 
		} catch (Exception e) {
			e.printStackTrace();
			vigi=null;
			vigilante.getConexion().escribirLogs("VerificarSesion", "verificarLogin", e.toString());
		}
		return vigi;
	}
}
