package ejercicio_7;

import java.util.Random;

public class Ejercicio_7 {
public static void main(String[] args) {
		
		Random numberWeek = new Random();
		
		int day = numberWeek.nextInt(7) + 1;
		
		switch(day)
		{
			case 1: System.out.println("Lunes");
			break;
			case 2: System.out.println("Martes");
			break;
			case 3: System.out.println("Miercoles");
			break;
			case 4: System.out.println("Jueves");
			break;
			case 5: System.out.println("Viernes");
			break;
			case 6: System.out.println("Sabado");
			break;
			case 7: System.out.println("Domingo");
			break;
		}

	}

}
