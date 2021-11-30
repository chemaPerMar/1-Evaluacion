package Tema2_3;

import java.util.Scanner;

public class ExerciseR1 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		float base,exponent;
		
		System.out.println("Introduce un numero");
		
		base = keyboard.nextFloat();
		
		System.out.println("Introduce otro numero");
		
		exponent = keyboard.nextFloat();
		
		keyboard.close();
		
		System.out.println(recursivePow(base,exponent));

	}
	
	public static float recursivePow(float base, float exponent)
	{
		if(exponent == 1)
		{
			return base;
		}
		else if(exponent == 0)
		{
			return 0;
		}
		else
		{
			return base * recursivePow(base,exponent-1);
		}
	}

}
