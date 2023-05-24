package Vusta;



import java.util.HashMap;
import java.util.Scanner;

import Modelo.Mascota;
import Modelo.Veterinario;

public class FormularioRegistroFactura extends Formulario {

private Mascota mascota;
private Veterinario veterinario;


	Scanner tc= new Scanner(System.in);
	HashMap<String, Object> solicitud;

	public FormularioRegistroFactura() {
		solicitud= new HashMap<String, Object>();
	}

	//	public void setMascota (Mascota mascota){
	//		this.mascota = mascota;
			
	//	}
	//	public void setVeterinario (Veterinario veterinario){
	//		this.veterinario = veterinario;
			
	//	}


	@Override
	public HashMap<String, Object> desplegarFormulario() {
		System.out.println("MODULO GENERACION DE FACTURA");
		
		System.out.println("Ingrese fecha de generación (formato: dd/MM/yyyy):");
		final String fecha=tc.nextLine();
		solicitud.put("fecha", fecha);
		
		
		System.out.println("Ingrese la hora de generación (formato: HH:mm:ss):");
		final String hora =tc.nextLine();
		solicitud.put("hora", hora);

		System.out.println("Ingrese el costo de la consulta");
		float costo = tc.nextFloat();

		if (costo <= 0){
			System.out.println("Costo invalido ");
			return solicitud;
		}
		
		solicitud.put("costo", costo);
		//solicitud.put("mascota", mascota);
        //solicitud.put("veterinario", veterinario);

		
	
		return solicitud;
	}

}






