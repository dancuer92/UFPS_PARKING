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
	 * @param vigilante: Datos del usuairo a verificar
	 * @return String: mensaje a mostrar en la pagina, devuelve "ok" si los datos son correctos.
	 */
	public Vigilante_dto verificarLogin(Vigilante_dto vigi) throws Exception{
		try {
			String password = vigi.getPassword();
			vigi= Vigilante_dao.buscarVigilante(vigi.getCodigo());
			if (vigilante!=null){ 
				if (!password.equals(vigi.getPassword())) vigilante=null;
			} 
		} catch (Exception e) {
			e.printStackTrace();
			vigilante=null;
			Vigilante_dao.getConexion().escribirLogs("VerificarSesion", "verificarLogin", e.toString());
		}
		return vigilante;
	}
}
