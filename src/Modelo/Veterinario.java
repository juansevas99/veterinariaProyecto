package Modelo;

import java.util.ArrayList;

public class Veterinario {
	private String nombre;
	private String correo;
	private String telefono;
	private static ArrayList<Veterinario> listaVeterinarios  = new ArrayList<Veterinario>();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public static Veterinario encontrarPorId;
	
	
}