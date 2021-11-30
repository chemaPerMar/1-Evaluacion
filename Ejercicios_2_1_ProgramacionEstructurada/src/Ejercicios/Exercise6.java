package Ejercicios;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int numbers [] = new int[3];
		
		System.out.println("Introduce un numero");
		
		numbers[0] = keyboard.nextInt();
		
		System.out.println("Introduce un segundo numero");
		
		numbers[1] = keyboard.nextInt();
		
		System.out.println("Introduce un tercer numero");
		
		numbers[2] = keyboard.nextInt();
		
		keyboard.close();
		
		if(numbers[0] == numbers[1]) {
			
			if(numbers[0] == numbers[2]) {
				System.out.printf("Hay 3 numeros que son iguales a %d",numbers[0]);
			}else {
				System.out.printf("Hay 2 numeros que son iguales a %d",numbers[0]);
			}
			
		}else if(numbers[0] == numbers[2]) {
			System.out.printf("Hay 2 numeros que son iguales a %d",numbers[0]);
		}else if(numbers[1] == numbers[2]) {
			System.out.printf("Hay 2 numeros que son iguales a %d",numbers[1]);
		}else {
			System.out.println("No hay numeros iguales");
		}

	}

}
