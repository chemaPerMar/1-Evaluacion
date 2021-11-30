package ejercicios222;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		
		int min;
		int max;
		int i = 0;
		
		System.out.println("Escriba el minimo del intervalo:");
		min = keyboard.nextInt();
		System.out.println("Escriba el maximo del intervalo");
		max = keyboard.nextInt();
		
		int aleatorio = random.nextInt(max-min+1)+min;
		while (i<=14) {
			System.out.println(aleatorio);
			aleatorio = random.nextInt(max-min+1)+min;
			i++;
		}
		
		
	}
}
