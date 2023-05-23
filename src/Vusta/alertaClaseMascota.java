package Vusta;

import java.util.Scanner;

public class alertaClaseMascota extends Alerta {
	Scanner tc = new Scanner(System.in);
	@Override
	public int desplegarAlerta() {
		System.out.println("Alerta Perro/ Gato");
		 System.out.println("Es perro o gato?"+
		 "1. Perro"+
		 "2. Gato"+
		 "\n");
		 
			
			 
		
			 String choice=tc.nextLine();
			 switch (choice) {
			case "1":
				return 1;
			case "2":
				return 2;
			default:
				return 0;
				
			}
		
	}

}
