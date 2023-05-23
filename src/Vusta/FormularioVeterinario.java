package Vusta;

import java.util.HashMap;
import java.util.Scanner;

public class FormularioVeterinario extends Formulario {
	Scanner tc= new Scanner(System.in);
	HashMap<String, Object> solicitud;
	public FormularioVeterinario() {
		solicitud= new HashMap<String, Object>();
	}
	@Override
	public HashMap<String, Object> deplegarFormulario() {
		System.out.println("MODULO REGISTRO VETERINARIO");
		System.out.println("Nombre");
		String nombre=tc.nextLine();
		solicitud.put("nombre", nombre);
		
		
		System.out.println("Correo");
		String correo=tc.nextLine();
		solicitud.put("correo", correo);
		
		System.out.println("telefono");
		
		String telefono=tc.nextLine();
		solicitud.put("telefono", telefono);
		
		
		return solicitud;
	}

}






