package Tema2_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		
		int number;
		
		try {
		System.out.println("Introduce un numero");
		
		number = keyboard.nextInt();
		
		keyboard.close();
		
		if(number < 0)
		{
			number=Math.abs(number); //Convertimos el numero negativo en positivo para burlar la trampa del usuario al meter negativo
			System.out.println("Intentaste poner un negativo, pero ahora lo convierto en positivo ;)");
		}
		
		System.out.println(summation(number));
		} catch (InputMismatchException e) //Comprueba si el usuario ha introducido un dato no numerico
		{
			System.out.println("No admitimos texto");
		}

	}
	
	public static int summation(int m) {
		
		int result = 0;
		int n = 0;
		
		while(result <= m) //Bucle que ira sumando n a result hasta que result sea mayor que m 
		{
			n++; //Incrementamos n para que pueda realizar el sumatorio 1 + 2 + 3 + n correctamente
			result += n;
		}
		
		return n;
		
	}

}
