package ejercicios222;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		
		int numero = 0;
		int i=0;
		int producto;
		
		System.out.println("Escriba un numero entre 0 y 10:");
		numero = keyboard.nextInt();
		while (!(numero >= 0 && numero <= 10)) {
			System.out.println("Error, Intentelo de nuevo:");
			numero = keyboard.nextInt();
		}
		while (i>=0 && i<10) {
			i++;
			producto = numero*i;
			System.out.printf("%d x %d = %d\n",numero, i, producto);
		}
	}
}