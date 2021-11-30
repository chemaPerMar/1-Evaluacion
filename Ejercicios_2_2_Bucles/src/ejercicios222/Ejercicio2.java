package ejercicios222;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		int resultado = random.nextInt(6)+1;
		int i = 0;
		while (i<=19) {
			System.out.println(resultado);
			resultado = random.nextInt(6)+1;
			i++;
		}
	}
}