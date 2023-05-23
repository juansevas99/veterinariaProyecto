package Controlador;

import Modelo.Perro;
import Modelo.Propietario;

public class PerroControlador extends MascotaControlador {
	Perro perro;
	public void crearMascota(String nombre, int edad, String especie, String raza, String genero, float altura, float peso, Propietario propietario) {
		perro= new Perro(nombre, edad, especie, raza, genero, altura, peso, propietario);
		
	}
	
	

}
