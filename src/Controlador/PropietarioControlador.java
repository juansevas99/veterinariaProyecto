package Controlador;

import java.util.HashMap;

import Modelo.Propietario;
import Vusta.Formulario;
import Vusta.FormularioRegistroPropietario;

public class PropietarioControlador {
	
	Propietario propietario;
	Formulario registro;
	public PropietarioControlador() {
		registro = new FormularioRegistroPropietario();
		
	}
	
	
	public void crearPropietario() {
		
		HashMap<String ,Object > solicitud=registro.desplegarFormulario(); // aqui se camptan todos lo datos
		propietario = new Propietario(solicitud.get("nombre").toString(),solicitud.get("identifiacion").toString(), solicitud.get("direccion").toString(), solicitud.get("correo").toString(), Integer.parseInt(solicitud.get("telefono").toString()) );
	}
}
