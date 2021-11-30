package ejercicio_6;

import java.util.Random;

public class Ejercicio_6 {
public static void main(String[] args) {
		
		Random numberMonth = new Random();
		
		int month = numberMonth.nextInt(12) + 1;
		
		System.out.println(month);
		
		if(month < 9 && month > 6) { System.out.println("Es verano"); }
		
	}
}
