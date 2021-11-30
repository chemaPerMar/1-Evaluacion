package Ejercicios;

import java.util.*;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce una nota");
		
		int nota = keyboard.nextInt();
		
		keyboard.close();
		
		switch(nota) {
			case 0:
			case 1:
			case 2: System.out.println("Es deficiente");
				break;
			case 3:
			case 4: System.out.println("Insuficiente");
				break;
			case 5: System.out.println("Suficiente");
				break;
			case 6: System.out.println("Bien");
				break;
			case 7:
			case 8: System.out.println("Notable");
				break;
			case 9:
			case 10: System.out.println("Sobresaliente");
				break;
			default: System.out.println("Nota incorrecta");
				break;
		}

	}

}
