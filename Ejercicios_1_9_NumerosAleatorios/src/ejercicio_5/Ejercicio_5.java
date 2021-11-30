package ejercicio_5;

import java.util.Random;

public class Ejercicio_5 {
public static void main(String[] args) {
		
		Random numberWeek = new Random();
		
		int day = numberWeek.nextInt(7) + 1;
		
		System.out.println(day);
		
		if(day > 5) { System.out.println("Es fin de semana"); }

	}
}
