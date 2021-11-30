package Tema2_3;

import java.util.Scanner;

public class ExerciseR2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		float n1,n2;
		
		System.out.println("Introduce un numero");
		
		n1 = keyboard.nextFloat();
		
		System.out.println("Introduce otro numero");
		
		n2 = keyboard.nextFloat();
		
		keyboard.close();
		
		System.out.println(mcd(n1,n2));

	}
	
	public static float mcd(float number1,float number2)
	{
		
		return (number1 % number2 == 0) ? number2 : mcd(number2,number1 % number2);
		
	}

}
