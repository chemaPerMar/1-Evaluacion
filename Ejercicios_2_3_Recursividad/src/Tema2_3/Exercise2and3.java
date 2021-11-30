package Tema2_3;

import java.util.Scanner;

public class Exercise2and3 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		
		float n1,n2;
		
		String operator;
		
		System.out.println("Introduce un numero");
		
		n1 = keyboard.nextFloat();
		
		System.out.println("Introduce otro numero");
		
		n2 = keyboard.nextFloat();
		
		System.out.println("Introduce una operacion (Sumar/Restar/Multiplicar/Dividir");
		
		keyboard.nextLine();
		
		operator = keyboard.nextLine();
		
		keyboard.close();
		try {
			
			System.out.println(calculator((int)n1, (int)n2, operation.valueOf(operator.toLowerCase())));
			System.out.println(calculator(n1, n2, operation.valueOf(operator.toLowerCase())));
			
		}
		catch (IllegalArgumentException e) { //Esto lo usamos en caso de que al introducir el tipo de operador, lo pongamos mal o pongamos un operador que no exista
			System.out.println("Ese operador no existe o esta incorrecto");
		}

	}

	enum operation {
		sumar,
		restar,
		multiplicar,
		dividir;
	}
	
	public static int calculator(int number1, int number2, operation operator)
	{
		try {
		switch(operator)
		{
			case sumar: return number1 + number2;
			case restar: return number1 - number2;
			case multiplicar: return number1 * number2;
			case dividir: return number1 / number2;
			default: return 0;
		}
		}catch(ArithmeticException e) //Necesario para casos especiales como dividir un numero entre 0
		{
			System.out.println("No puedes dividir entre 0");
			return 0;
		}
	}
	
	public static float calculator(float number1, float number2, operation operator)
	{
		try {
		switch(operator) 
		{
			case sumar: return number1 + number2;
			case restar: return number1 - number2;
			case multiplicar: return number1 * number2;
			case dividir: return number1 / number2;
			default: return 0;
		}
		}catch(ArithmeticException e) //Necesario para casos especiales como dividir un numero entre 0
		{
			System.out.println("No puedes dividir entre 0");
			return 0;
		}
	}
	
}
