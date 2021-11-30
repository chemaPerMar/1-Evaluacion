package ejercicios222;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio9 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		
		int numero = 0;
		int i = 0;
		int j= 0;
		String asteriscos = "";
		String espacios = "";
		while (numero<=0) {
		System.out.println("Introcuzca un numero entero positivo:");
		numero = keyboard.nextInt();
		if (numero<=0)
			System.out.println("ERROR: numero no valido.\n");
		}
		for( i = 0;i<=numero;i++)
        {
            espacios += " ";     //Este for lo usaremos para agregar los espacios en funcion al numero introducido
        }
        
        for( i = 0;i<numero;i++)
        {
            asteriscos += "* ";		//añade un asterisco mas a la variable asterisco cada ciclo del bucle
            System.out.printf("%s\n",espacios.substring(0, espacios.length() - i) + asteriscos); 	//resta un espacio cada ciclo y añade la variable asteriscos
        }
	}
	}