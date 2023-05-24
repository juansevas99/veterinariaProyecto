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
		
		HashMap<String, Object> solicitud=registro.desplegarFormulario();
		if (tipo==1) {
			mascota= new Perro(solicitud.get("nombre").toString(), Integer.parseInt(solicitud.get("edad").toString()), solicitud.get("especie").toString(), solicitud.get("raza").toString(), solicitud.get("genero").toString(), Float.parseFloat( solicitud.get("altura").toString()),Float.parseFloat( solicitud.get("peso").toString()), Propietario.listaPropietario.get(Propietario.listaPropietario.size()-1));
		}
		else {
			mascota= new Gato(solicitud.get("nombre").toString(), Integer.parseInt(solicitud.get("edad").toString()), solicitud.get("especie").toString(), solicitud.get("raza").toString(), solicitud.get("genero").toString(), Float.parseFloat( solicitud.get("altura").toString()),Float.parseFloat( solicitud.get("peso").toString()), Propietario.listaPropietario.get(Propietario.listaPropietario.size()-1));
		}
		
		Mascota.listaMascota.add(mascota);
		return Mascota.identifiacion;
		
	}
	
}
