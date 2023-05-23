package Modelo;

import java.util.ArrayList;

public abstract class  Mascota {
	public static int identifiacion;
	int id;
	String requisitoVacunacion;	
	public static ArrayList<Mascota> listaMascota = new ArrayList<>();
	public static void incrementarIdentifiacion() {
		identifiacion=identifiacion+1;
	}
	
	

	
	public abstract String requisitoVacunacion();
	
	protected String nombre;
	protected int edad;
	protected String especie;
	protected String raza;
	protected String genero;
	protected float altura;
	protected float peso;
	protected Propietario propietario;
	protected String registroVacunacion;
	protected HistorialMedico historialMedico;
    public int cont =0; 
    
    //constructor en vacio
    public Mascota() {
        nombre = "";
        edad = 0;
        especie = "";
        raza = "";
        genero = "";
        altura = 0;
        peso = 0;
        // esta variable es para poder interactuar con la clase propietario
        propietario = new Propietario();
        historialMedico = new HistorialMedico();
    }
    //constructor con parametros
    public Mascota(String nombre, int edad, String especie, String raza, String genero, float altura, float peso, Propietario propietario) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.raza = raza;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
        this.propietario = propietario;
        incrementarIdentifiacion();
		id= identifiacion;
    }
   
   
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
      
          
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + ", raza=" + raza + ", genero=" + genero + ", altura=" + altura + ", peso=" + peso + ", propietario=" + propietario + '}';
    }
	
	public static  Mascota encontrarPorId(int id) {
		return null;
	}
}




	    