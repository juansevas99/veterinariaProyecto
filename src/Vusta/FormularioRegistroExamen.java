package Vusta;

import java.util.HashMap;
import java.util.Scanner;

public class FormularioRegistroExamen extends Formulario {
	Scanner tc= new Scanner(System.in);
	HashMap<String, Object> solicitud;
	public FormularioRegistroExamen() {
		solicitud= new HashMap<String, Object>();
	}
	@Override
	public HashMap<String, Object> desplegarFormulario() {
		System.out.println("-----REGISTRO EXAMENES-------");
		
        System.out.println("Nombre del examen");
		String nombre=tc.nextLine();
		solicitud.put("nombre", nombre);
		
		
		System.out.println("precio");
		int precio=tc.nextInt();
		solicitud.put("precio", precio);
		
		
		return solicitud;
	}

}






