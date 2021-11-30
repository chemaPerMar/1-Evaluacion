package Ejercicios;

import java.util.*;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Introduce un numero");
		
		int numero = keyboard.nextInt();
		
		keyboard.close();
		
		if(numero % 2 == 0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}

	}

}
