package Vusta;

import java.util.Scanner;

public class MenuPrincipal extends Menus{
	Scanner tc= new Scanner(System.in);
	@Override
	public int  desplegarMenus() {
		System.out.println("Este es el menu prinipal");
		 System.out.println("Menu\n"+
		 "1. Registrar Datos\n"+
		 "\n"+
		 "\n");
		 
			
			 
		
			 String choice=tc.nextLine();
			 switch (choice) {
			case "1":
					System.out.println("... cargando vista");
					return 1;
				
			case "2":
					System.out.println("... cargando vista");
					return 2;
				
			case "3":
					System.out.println("... cargando vista");
					return 3;
				
			default:
				
				return 0;
			}
			 
			 
	}

}
