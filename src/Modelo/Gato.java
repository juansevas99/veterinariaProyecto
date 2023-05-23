package Modelo;

public class Gato  extends Mascota{

	
	public Gato(String nombre, int edad, String especie, String raza, String genero, float altura, float peso, Propietario propietarios) {
		super(nombre, edad, especie, raza, genero, altura, peso, propietarios);
	}
	@Override
	public String requisitoVacunacion() {
		
		return raza;
	}

}
