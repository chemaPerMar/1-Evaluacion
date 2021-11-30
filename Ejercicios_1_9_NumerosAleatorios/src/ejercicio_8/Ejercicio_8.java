package ejercicio_8;

import java.util.Random;

public class Ejercicio_8 {
public static void main(String[] args) {
		
		Random numberMonth = new Random();
		
		int month = numberMonth.nextInt(12);
		
		final String MONTHS[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre",
				"Noviembre","Diciembre"};
		
		System.out.println(MONTHS[month]);

	}

}
