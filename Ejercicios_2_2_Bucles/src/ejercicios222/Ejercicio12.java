package ejercicios222;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio12 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		
		int numero = 0;
		int i;
		int j;
		String cadena = "";
		String cadena2 = "";
		String espacio = "";
		
		while (numero<=0) {							//pide un numero positivo distinto a 0
		System.out.println("Introduzca su numero");
		numero = keyboard.nextInt();
		
		if (numero<=0) {
			
			System.out.println("ERROR: introduzca un numero positivo distinto a 0");
		}
		}
		for(i=0;i<numero;i++) {			//añade los espacios iniciales necesarios dado el numero establecido
			
			espacio += "  ";
		}
		for(i = 1; i <= numero; i++) {
			cadena += i + " ";
			cadena2= i + " "+cadena2;
			System.out.println(espacio.substring(0,espacio.length() - (i*2)) + cadena.substring(0,cadena.length()-1) + cadena2.substring(1,cadena2.length()));
			
		}
		
		}
	}