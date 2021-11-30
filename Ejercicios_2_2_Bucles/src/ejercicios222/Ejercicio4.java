package ejercicios222;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		
		int n1 = random.nextInt(100)+0;
		int n2 = random.nextInt(100)+0;
		int resultado = n1;
		int i = 1;
		while (i != n2) {
			i++;
			resultado = resultado + n1;
			System.out.println(resultado);
		}
		System.out.printf("Los productos eran n1: %d y n2: %d",n1,n2);
	}
}
