package Controlador;

import Vusta.Menus;
import Vusta.MenuPrincipal;
import Vusta.MenuRegistroDatos;
 
public class LanzarVeterinaria {
	public static void main(String[] args) {
		comienzo();
		
		
		
		
	}
	
	public static void comienzo() {
		while (true) {
			Menus menu= new MenuPrincipal();
			int opcion=menu.desplegarMenus();
			switch (opcion) {
			case 1:
				desplegarMenuRegistroDatos();
				break;
			case 2:
				break;
			default:
				break;
			}
			
			
			
		}
		
	}
	
	public static void desplegarMenuRegistroDatos() {
		while(true) {
			Menus menu= new MenuRegistroDatos();
			int opcion =menu.desplegarMenus();
			switch (opcion) {
			case 1:
				CitaControlador cita = new CitaControlador();
				cita.crearCita();
				break;

			default:
				break;
			}
			
		}
	}
}
