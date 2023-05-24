package Vusta;

import java.util.HashMap;
import java.util.Scanner;

public class FormularioRegistroMascota  extends Formulario{

	Scanner tc = new Scanner(System.in);
	HashMap<String, Object> solicitud;
	public FormularioRegistroMascota() {
		solicitud= new HashMap<String,Object>();
	}

	@Override
	public HashMap<String, Object>  deplegarFormulario() {
		System.out.println("MODULO REGISTRO MASCOTA");
		
	
		
		
		
		
		System.out.println("Nombre");
		String nombre=tc.nextLine();
		solicitud.put("nombre", nombre);
		
		System.out.println("edad");
		int edad=tc.nextInt();
		solicitud.put("edad", edad);
		
		System.out.println("Especie");
		String especie=tc.nextLine();
		solicitud.put("especie", especie);
		
		System.out.println("genero");
		String genero=tc.nextLine();
		solicitud.put("genero", genero);
	
		System.out.println("raza");
		String raza=tc.nextLine();
		solicitud.put("raza", raza);
		
		
		System.out.println("altura");
		float altura=tc.nextFloat();
		solicitud.put("altura", altura);
		
		
		System.out.println("Peso");
		
		float peso=tc.nextFloat();
		solicitud.put("peso", peso);
		
		return solicitud;
		
	}
}
