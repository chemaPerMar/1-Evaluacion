package Tema2_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		
		int base, exponent;
		try
		{
			System.out.println("Introduce un numero");
			
			base = keyboard.nextInt();
			
			System.out.println("Introduce otro numero");
			
			exponent = keyboard.nextInt();
			
			keyboard.close();
			
			System.out.println(ownPow(base,exponent));
		}catch (InputMismatchException e) //Necesario para comprobar que el usuario no meta caracteres no numericos
		{
			System.out.println("No se admite caracteres alfabeticos o especiales");
		}

	}

	public static float ownPow(float base, float exponent)
	{
		float result = base;
		for(int i = 0;i<(exponent-1);i++)
		{
			result *= base;
		}
		if (exponent == 0) { return 1; };
		
		return result;
	}
}
