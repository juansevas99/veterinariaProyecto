package Controlador;

import java.util.Scanner;

import Modelo.CitaModelo;
import Modelo.Gato;
import Modelo.Mascota;
import Modelo.Perro;
import Modelo.Propietario;
import Vusta.alertaClaseMascota;

public class CitaControlador {
	public CitaModelo  citaModelo= new CitaModelo(); // se inicializa el modelo
	public PropietarioControlador propietarioControlador= new PropietarioControlador();
	public MascotaControlador mascotaControlador= new MascotaControlador();
	public alertaClaseMascota alerta;
	public CitaControlador() {
		alerta= new alertaClaseMascota();
	}
	public void crearCita() {
		Scanner tc= new Scanner(System.in);
		System.out.println("ALERTA: VALIDACION INICIAL DE DATOS:\n");
		System.out.println("Indique numero de indentifiacion\n"); // es demasiado pequeño para crear una vista 
		
		String documento=tc.nextLine();
		if (Propietario.encontrarPorId(documento)!=null) {
			System.out.println("Indieque numero de indentifiacion de la mascota"); // es demasiado pequeño para crear una vista 
			
			int identifiacion=tc.nextInt();
			if (Mascota.encontrarPorId(identifiacion)!=null) {
				System.out.println("Creando cita (falta logica)");
			}
			else {
				int tipo=alerta.desplegarAlerta();
				mascotaControlador.crearMascota(tipo);
				System.out.println("Creando cita (falta logica)");
			}
		}
		else {
			propietarioControlador.crearPropietario();
			int tipo=alerta.desplegarAlerta();
			mascotaControlador.crearMascota(tipo); // se crear segun el ultimo registro en propietario
			
			System.out.println("Creando cita (falta logica)");
		
		}
		
		
		
		
		
		
		
	}	
	
	
}
