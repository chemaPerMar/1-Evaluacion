package Tema2_3;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Introduce un numero");
		
		n1 = keyboard.nextInt();
		
		System.out.println("Introduce otro numero");
		
		n2 = keyboard.nextInt();
		
		keyboard.close();
		
		System.out.println(mcd(n1,n2));

	}

	public static int mcd(int number1,int number2)
	{
		int temp; /* esta variable sera usada para almacenar temporalmente el numero2 
		porque el valor del numero2 se cambiará y el valor del numero1 sera el que tuvo originalmente
		el numero2*/
		
		while(number1 % number2 != 0)
		{
			temp = number2;
			number2 = number1 % number2;
			number1 = temp;
		}
		
		return number2;
		
	}
	
}
