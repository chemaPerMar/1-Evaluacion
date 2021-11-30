package ejercicios222;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		
		int n1 = 2;
		int n2 = 1;
		
		while(n1>=n2) {
			System.out.println("Introduzca n1:");
			n1 = keyboard.nextInt();
			System.out.println("Introduzca n2:");
			n2 = keyboard.nextInt();
			if (n1>=n2) {
				System.out.println("ERROR: n1 es menor o igual que n2\n");
			}
		}
		
		int i = n1;
		int j = n2;
		int pares = n1;
		int impares = n1;
		int npares = 0;
		int nimpares = 0;
		while(i<=j) {
			
			if (i%2==0) {				//si i es par, el valor que tenga i en ese ciclo se añade a la suma de numeros pares.
				pares = pares + i;
				npares++;
			}
			else if(i%2!=0) {			//si i es impar, el valor que tenga i en ese momento se añande a la suma de numeros pares.
				impares = impares + i;	
				nimpares++;
			}
			i++;
		}
		System.out.printf("La suma de todos los numeros pares entre %d y %d es:   %d\n", n1,n2,pares);
		System.out.printf("La suma de todos los numeros impares entre %d y %d es: %d\n", n1,n2,impares);
		System.out.printf("Ha habido %d numeros pares\n",nimpares);
		System.out.printf("Ha habido %d numeros impares\n",nimpares);
		System.out.println("Gracias por su atencion");
				
	}
}
