package ejercicios222;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		Random random = new Random();
		
		int numero = 0;
		int i = 0;
		int j = 0;
		String asteriscos = "";
		String espacios = "";
		
		while (numero<=0) {
		System.out.println("Introcuzca un numero entero positivo:");
		numero = keyboard.nextInt();
		
		if (numero<=0)
			System.out.println("ERROR: numero no valido.\n");
		
		}
		
		for( i = 0;i<=numero;i++) {		//genero los espacios iniciales
        
            espacios += " "; 
        }
        
        for( i = 0;i<numero;i++) {		//añado "* " cada ciclo a la variable asteriscos y resto espacios para crear la forma de la piramide
        
            asteriscos += "* ";
            System.out.printf("%s\n",espacios.substring(0, espacios.length() - i) + asteriscos); 
        }
        
        for(i = 0,espacios = "  "; i < numero;i++) {
        	
        	asteriscos = asteriscos.substring(0, asteriscos.length() -2 );		//cada ciclo le quita los caracteres "* " que se habian añadido anteriormente
        	espacios+=" ";														//se añade un espacio cada ciclo a la variable espacios       	
        	System.out.printf("%s\n",espacios + asteriscos);		//se imprimen los espacios y los asteriscos
        	
        }
	}
}