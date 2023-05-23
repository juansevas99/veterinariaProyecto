package Vusta;

import java.util.Scanner;

public class MenuRegistroDatos extends Menus {
	Scanner tc= new Scanner(System.in);
	@Override
	public int desplegarMenus() {
		System.out.println("MENU PRINCIPAL	");
		 System.out.println("Menu\n"+
		 "1. Agendar Cita \n"+  // se requiere un flujo 
		 "2. Mostrar Lista de mascotas"+ // es Opcional
		 "3. Buscar Mascota por propietario\n"); // Es opcional
		 String choice= tc.nextLine();
		 switch (choice) {
			case "1":
				return 1;
			default:
				return 0;
		 }
		 
		 

	}

}
