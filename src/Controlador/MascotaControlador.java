package Controlador;

import java.util.HashMap;

import Modelo.Gato;
import Modelo.Mascota;
import Modelo.Perro;
import Modelo.Propietario;
import Vusta.Formulario;
import Vusta.FormularioRegistroMascota;

public class MascotaControlador {
	Formulario registro;
	Mascota mascota;
	public MascotaControlador() {
		registro= new FormularioRegistroMascota();
	}
	

	public int crearMascota(int tipo ) {
		
		HashMap<String, Object> solicitud=registro.deplegarFormulario();
		if (tipo==1) {
			mascota= new Perro(null, tipo, null, null, null, tipo, tipo, Propietario.listaPropietario.get(Propietario.listaPropietario.size()-1));
		}
		else {
			mascota= new Gato(null, tipo, null, null, null, tipo, tipo, Propietario.listaPropietario.get(Propietario.listaPropietario.size()-1));
		}
		return Mascota.identifiacion;
		
	}
	
}
