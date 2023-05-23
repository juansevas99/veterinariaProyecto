package Modelo;



import java.util.ArrayList;

/**
 *
 * @author Bullrock
 */
public class Propietario {
	public static ArrayList<Propietario> listaPropietario = new ArrayList<Propietario>();
    //declaracion de variables
    private String nombre;
    private String identificacion;
    private String direccion;
    private String correo;
    private int telefono;

    //contructor vacio
    public Propietario() {
        nombre = "";
        identificacion = "";
        direccion = "";
        correo = "";
        telefono = 0;
    }

    //contructor con parametros
    public Propietario(String nombre, String identificacion, String direccion, String correo, int telefono) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
// getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public ArrayList<Propietario> getListaPropietario() {
    	return this.listaPropietario;
    }
    
   
    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
    public static Propietario encontrarPorId(String id){
    	return ;
    }
   
    

}

