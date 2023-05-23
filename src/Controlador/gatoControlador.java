package Controlador;

import Modelo.Gato;
import Modelo.Mascota;
import Modelo.Propietario;

public class gatoControlador extends MascotaControlador{
	Mascota gato;
	public void crearMascota( String nombre, int edad, String especie, String raza, String genero, float altura, float peso, Propietario propietario) {
		gato= new Gato(nombre, edad, especie, raza, genero, altura, peso, propietario);
		
	}
	
	
	
	

}
