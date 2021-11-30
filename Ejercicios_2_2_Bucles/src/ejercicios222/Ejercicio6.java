package ejercicios222;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		float n1 = 2;
		float n2 = 1;
		while (n1>n2) {
		System.out.println("Introduzca un n1 menor que n2.");
		System.out.println("\nn1:");
		n1 = keyboard.nextFloat();
		System.out.println("\nn2:");
		n2 = keyboard.nextFloat();
		}
		float i;
		float j;
		for ( i = 0, j = 0; n1<n2; i=i+1, j=j+1, n1=n1*2 , n2=n2/2) {
			System.out.printf("\ni= %.0f\tj= %.0f\n",i,j);
			System.out.printf("n1 = %.2f n2= %.2f",n1 , n2);
		}
		System.out.printf("\n\nn1: %f \nn2: %f", n1, n2);
	}
}
