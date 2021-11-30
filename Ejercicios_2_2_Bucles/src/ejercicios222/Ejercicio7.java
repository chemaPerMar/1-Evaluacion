package ejercicios222;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		int nota = 0;
		int muyDeficiente = 0;
		int insuficiente = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		int noValida = 0;
		int i = 0;
		
		while(i>=0 && i<10) {
			System.out.println("Introduzca una nota:");
			nota = keyboard.nextInt();
	
		switch(nota) {
		case 0,1,2: {
			muyDeficiente++;
			break;
		}
		case 3,4: {
			insuficiente++;
			break;
		}
		case 5:{
			suficiente++;
			break;
		}
		case 6: {
			bien++;
			break;
		}
		case 7,8: {
			notable++;
			break;
		}
		case 9,10: {
			sobresaliente++;
			break;
		}
		default: {
			System.out.println("Nota no valida\n");
			noValida++;
			i--;
		}
		} 
		i++;
		}
		System.out.printf("\nEl numero de muy deficientes es: %d",muyDeficiente);
		System.out.printf("\nEl numero de insuficientes es  : %d",insuficiente);
		System.out.printf("\nEl numero de sufucientes es    : %d",suficiente);
		System.out.printf("\nEl numero de bien es           : %d",bien);
		System.out.printf("\nEl numero de notables es       : %d",notable);
		System.out.printf("\nEl numero de sobresalientes es : %d",sobresaliente);
		if (noValida>0) {
			System.out.printf("\n\nEl numero de notas no validas es: %d",noValida);
		}
		System.out.printf("\nEl numero de notas entregadas son: %d",i);
		System.out.printf("\n\nGracias por su atencion");
	}
}