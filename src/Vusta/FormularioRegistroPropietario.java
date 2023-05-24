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
	public HashMap<String, Object> desplegarFormulario() {
		System.out.println("MODULO REGISTRO PROPIETARIO");
		System.out.println("Nombre");
		String nombre=tc.nextLine();
		solicitud.put("nombre", nombre);
		System.out.println("Identificacion");
		String identificacion=tc.nextLine();
		solicitud.put("identificacion", identificacion);
		
		System.out.println("Direccion");
		String direccion=tc.nextLine();
		solicitud.put("identificacion", direccion);
		
		System.out.println("Correo");
		String correo=tc.nextLine();
		solicitud.put("identificacion", correo);
		
		System.out.println("telefono");
		
		String telefono=tc.nextLine();
		solicitud.put("identificacion", telefono);
		
		
		return solicitud;
	}
	
}
