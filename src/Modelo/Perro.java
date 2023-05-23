package Modelo;

public class Perro extends Mascota{

	public Perro(String nombre, int edad, String especie, String raza, String genero, float altura, float peso, Propietario propietario) {
		super(nombre, edad, especie, raza, genero,  altura, peso, propietario);
	}
	@Override
	public String requisitoVacunacion() {
		
		return registroVacunacion;
	}
	
}
