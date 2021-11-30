package ejercicios222;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		
		int n1=0;
		int n2 = 0;
		
		n1 = random.nextInt(100-(-100)+1)+-100;
		n2 = random.nextInt(200-100+1)+100;
		
		int i = n1;
		int j = n2;
		
		while (i<=j) {
			i++;
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.printf("\nEstas son las variables n1: %d y n2: %d.", n1, n2);
	}
}
