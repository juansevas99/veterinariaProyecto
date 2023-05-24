package Vusta;

import java.util.HashMap;
import java.util.Scanner;

public class FormularioRegistroPropietario extends Formulario{
	Scanner tc = new Scanner(System.in);
	HashMap<String, Object> solicitud;
	public FormularioRegistroPropietario() {
		solicitud= new HashMap<String,Object>();
	}
	@Override
	public HashMap<String, Object> deplegarFormulario() {
		System.out.println("MODULO REGISTRO PROPIETARIO");
		System.out.println("Nombre");
		String nombre=tc.nextLine();
		solicitud.put("nombre", nombre);
		System.out.println("identificacion");
		String identificacion=tc.nextLine();
		solicitud.put("identificacion", identificacion);
		
		System.out.println("direccion");
		String direccion=tc.nextLine();
		solicitud.put("direccion", direccion);
		
		System.out.println("Correo");
		String correo=tc.nextLine();
		solicitud.put("correo", correo);
		
		System.out.println("telefono");
		
		String telefono=tc.nextLine();
		solicitud.put("telefono", telefono);
		
		
		return solicitud;
	}
	
}
