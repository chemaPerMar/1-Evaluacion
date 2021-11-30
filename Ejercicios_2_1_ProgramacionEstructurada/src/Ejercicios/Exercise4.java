package Ejercicios;

import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		
		int numero = keyboard.nextInt();
		
		keyboard.close();
		
		System.out.print(NumberType(numero));
		
	}
	
	public static String NumberType(int number)
	{
		String resultado;
		if(number > 0) {
			resultado = "Es positivo";
		} else if(number < 0) {
			resultado = "Es negativo";
		} else {
			resultado = "Es cero";
		}
		
		return resultado;
	}

}
